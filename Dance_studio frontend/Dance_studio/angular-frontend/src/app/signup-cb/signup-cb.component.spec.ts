import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SignupCbComponent } from './signup-cb.component';

describe('SignupCbComponent', () => {
  let component: SignupCbComponent;
  let fixture: ComponentFixture<SignupCbComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SignupCbComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SignupCbComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
