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

  textTXT : string;

  response: string;

  constructor(public AJservice: ApijavaService) {
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

  enviarTXT(form) {
    this.response = '';
      if (form) {
          this.AJservice.postTest(this.textTXT)
          .subscribe(
          (data1:any)=>{
            this.AJservice.getTest()
            .subscribe(
              (data2:any) =>{
                this.response=data2.content;
              }
            );
          }
          );
      }
    }

}
