import { Component, AfterViewInit, ViewChild} from '@angular/core';
import { ApijavaService } from '../services/apijava.service';
import {TestModel} from '../models/testModel';

import { NgTerminal } from 'ng-terminal';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements AfterViewInit {

  @ViewChild('term', { static: true }) child: NgTerminal;

  dataTest = new TestModel();

  textTXT = '';

  textCMD = '';

  response: string;

  response2: string;

  constructor(public AJservice: ApijavaService) {
  }

  ngAfterViewInit() {

    this.child.write('Here starts the terminal \r\n\r\nCreated by: Lester & Marco\r\n');
    this.child.write('\r\nLM > ');

    this.child.keyEventInput.subscribe(e => {


     const ev = e.domEvent;
     const printable = !ev.altKey && !ev.ctrlKey && !ev.metaKey;

     if (ev.keyCode === 37 || ev.keyCode === 38 || ev.keyCode === 39 || ev.keyCode === 40) {

       console.log("hola");


     }


     if (ev.keyCode === 13) {
       if (this.textCMD === 'cls') {
         this.child.underlying.reset();
         this.textCMD = '';
         this.child.write('Here starts the terminal \r\n\r\nCreated by: Lester & Marco\r\n');
         this.child.write('\r\nLM > ');
       }else if (this.textCMD === '') {
         this.child.write('\r\nLM > ');
       }else {
         this.AJservice.postTest(this.textCMD)
         .subscribe(
         (data1:any)=>{
           this.AJservice.getTest()
           .subscribe(
             (data2:any) =>{
               if (data2.content != '0 errors') {
                 this.child.write('\r\n'+data2.content);
               }
             }
           );
           this.AJservice.getTest2()
           .subscribe(
             (data3:any) =>{
             }
           );
         }
         );
         setTimeout(() => {
                this.child.write('\r\nLM > ');
                this.textCMD = '';
              },
         100);
       }
     } else if (ev.keyCode === 8) {
         this.textCMD = this.textCMD.substr(0, this.textCMD.length-1);
       // Do not delete the prompt
       if (this.child.underlying.buffer.active.cursorX > 5) {
         this.child.write('\b \b');
       }
     } else if (printable) {
       this.child.write(e.key);
       this.textCMD += e.key;
     }

   })
  }

  onKeydownFile(event) {
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
    this.response2 = '';
      if (form && this.textTXT != '') {
          this.AJservice.postTest(this.textTXT)
          .subscribe(
          (data1:any)=>{
            this.AJservice.getTest()
            .subscribe(
              (data2:any) =>{
                this.response=data2.content;
              }
            );
            this.AJservice.getTest2()
            .subscribe(
              (data3:any) =>{
                //this.response=data2.content;
                this.response2 = data3.content;
              }
            );
          }
          );
      }else{
        this.response2='Empty';
      }
    }
}
