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

  response3: string;

  response4: string;

  constructor(public AJservice: ApijavaService) {
  }

  ngAfterViewInit() {

    this.child.write('Here starts the terminal \r\n\r\nCreated by: Lester & Marco\r\n');
    this.child.write('\r\nLM > ');

    this.child.keyEventInput.subscribe(e => {


     const ev = e.domEvent;
     const printable = !ev.altKey && !ev.ctrlKey && !ev.metaKey;

     if (ev.keyCode === 37 || ev.keyCode === 38 || ev.keyCode === 39 || ev.keyCode === 40) {

       this.child.underlying.reset();
       this.textCMD = '';
       this.child.write('Here starts the terminal \r\n\r\nCreated by: Lester & Marco\r\n');
       this.child.write('\r\nLM > ');
     }


     if (ev.keyCode === 13) {
       if (this.textCMD === 'cls') {
         this.child.underlying.reset();
         this.textCMD = '';
         this.child.write('Here starts the terminal \r\n\r\nCreated by: Lester & Marco\r\n');
         this.child.write('\r\nLM > ');
       }else if (this.textCMD === '') {
         this.child.write('\r\nLM > ');
       }else if (this.textCMD === 'if(' ||
         this.textCMD === 'while(' ||
         this.textCMD === 'class' ||
         this.textCMD === 'int' ||
         this.textCMD === 'string' ||
         this.textCMD === 'boolean' ||
         this.textCMD === 'char' ||
         this.textCMD[this.textCMD.length-1] === '{'
         ){
         this.child.write('\r\n...> ');
          this.textCMD += ' ';
       }else {
         this.response = '';
         this.response2 = '';
         this.response3 = '';
         this.response4 = '';

         this.imprimirTokens(this.textCMD);
         this.imprimirInfo(this.textCMD);
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
     } else if (printable && ev.keyCode && ev.keyCode != 37 && ev.keyCode != 38 && ev.keyCode != 39 && ev.keyCode != 40) {
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
    this.response3 = '';
    this.response4 = '';
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

    imprimirTokens(text : string){

        this.AJservice.postTest3(text)
        .subscribe(
          (data:any) =>{
            this.response3 += data.content;
          }
        );


    }

    imprimirInfo(text : string){
        this.AJservice.postTest4(text)
        .subscribe(
          (data:any) =>{
            this.response4 += data.content;
          }
        );
    }

    limpiarListBack(){
      this.AJservice.getTest5()
      .subscribe(
        (data:any) =>{
        }
      );
      this.response = '';
      this.response2 = '';
      this.response3 = '';
      this.response4 = '';
    }
}
