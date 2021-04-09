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


}