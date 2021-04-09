import { Component, OnInit } from '@angular/core';
import { ApijavaService } from '../services/apijava.service';
import {TestModel} from '../models/testModel';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  dataTest = new TestModel();

  constructor(public AJservice: ApijavaService) {
    this.AJservice.getTest()
    .subscribe(
      (data:any) =>{
        console.log(data);
      }
    );
  }

  ngOnInit(): void {
  }

}
