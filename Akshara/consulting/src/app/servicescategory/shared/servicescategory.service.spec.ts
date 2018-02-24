import { TestBed, inject } from '@angular/core/testing';

import { ServicescategoryService } from './servicescategory.service';

describe('ServicescategoryService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ServicescategoryService]
    });
  });

  it('should be created', inject([ServicescategoryService], (service: ServicescategoryService) => {
    expect(service).toBeTruthy();
  }));
});
