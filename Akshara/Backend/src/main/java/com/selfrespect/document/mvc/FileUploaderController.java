package com.selfrespect.document.mvc;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController

public class FileUploaderController {

    final static Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

    //Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "E://temp//";

    // 3.1.1 Single file upload
    @PostMapping("/api/upload")
    // If not @RestController, uncomment this
    //@ResponseBody
    public ResponseEntity<?> uploadFile(
            @RequestParam("file") MultipartFile uploadfile,   HttpServletRequest request) {

    	LOG.debug("Single file upload!");

        if (uploadfile.isEmpty()) {
            return new ResponseEntity("please select a file!", HttpStatus.OK);
        }

        try {

        	
            saveUploadedFiles(Arrays.asList(uploadfile),   request);

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity("Successfully uploaded - " +
                uploadfile.getOriginalFilename(), new HttpHeaders(), HttpStatus.OK);

    }
    
  //save file
    private void saveUploadedFiles(List<MultipartFile> files, HttpServletRequest request) throws IOException {

        for (MultipartFile file : files) {

            if (file.isEmpty()) {
            	
                continue; //next pls
            }

           // byte[] bytes = file.getBytes();
          //  Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
          //  Files.write(path, bytes);
            
            // store in seesion for time being , once the user suboitted the form save it to empluee table
            request.getSession().setAttribute("photoFile", file.getBytes());
        }

    }
}


