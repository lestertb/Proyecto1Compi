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

  onKeydown(event) {
    if(event.keyCode===9){
      var fileArea = document.getElementById("file") as HTMLInputElement;
      var val = fileArea.value,
      start = fileArea.selectionStart,
      end = fileArea.selectionEnd;
      fileArea.value = val.substring(0, start) + ' ' + val.substring(end);
      fileArea.selectionStart = fileArea.selectionEnd = start + 1;

      return false;
    }
  }

}
