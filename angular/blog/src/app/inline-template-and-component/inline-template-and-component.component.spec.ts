import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InlineTemplateAndComponentComponent } from './inline-template-and-component.component';

describe('InlineTemplateAndComponentComponent', () => {
  let component: InlineTemplateAndComponentComponent;
  let fixture: ComponentFixture<InlineTemplateAndComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InlineTemplateAndComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InlineTemplateAndComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
