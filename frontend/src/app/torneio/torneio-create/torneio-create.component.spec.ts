import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TorneioCreateComponent } from './torneio-create.component';

describe('TorneioCreateComponent', () => {
  let component: TorneioCreateComponent;
  let fixture: ComponentFixture<TorneioCreateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TorneioCreateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TorneioCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
