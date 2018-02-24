import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ServicescategoryFormComponent } from './servicescategory-form.component';

describe('ServicescategoryFormComponent', () => {
  let component: ServicescategoryFormComponent;
  let fixture: ComponentFixture<ServicescategoryFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ServicescategoryFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ServicescategoryFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
