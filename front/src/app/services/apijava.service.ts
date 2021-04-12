import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ApijavaService {

  ip: string = 'localhost';
  port: string = '8080';
  urlRoot: string = `http://${this.ip}:${this.port}`;


  constructor(public http: HttpClient) { }

  getTest() {
    return this.http.get(`http://${this.ip}:${this.port}/test`);
  }

  postTest(textTxt:string) {
      return this.http.post(`${this.urlRoot}/agregar`, textTxt);
  }

  getTest2() {
    return this.http.get(`http://${this.ip}:${this.port}/test2`);
  }

  postTest3(textTxt:string) {
    return this.http.post(`http://${this.ip}:${this.port}/test3`,textTxt);
  }

  postTest4(textTxt:string) {
    return this.http.post(`http://${this.ip}:${this.port}/test4`,textTxt);
  }

  getTest5() {
    return this.http.get(`http://${this.ip}:${this.port}/test5`);
  }

}
