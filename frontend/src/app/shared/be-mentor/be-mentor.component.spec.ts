import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BeMentorComponent } from './be-mentor.component';

describe('BeMentorComponent', () => {
  let component: BeMentorComponent;
  let fixture: ComponentFixture<BeMentorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BeMentorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BeMentorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
