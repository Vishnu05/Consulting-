import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ServicescategoryComponent } from './servicescategory.component';

describe('ServicescategoryComponent', () => {
  let component: ServicescategoryComponent;
  let fixture: ComponentFixture<ServicescategoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ServicescategoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ServicescategoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
