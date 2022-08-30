import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {


  user={
    name:'Priyabrat',
    age:26
  }
  constructor() { }

  ngOnInit(): void {
  }

}
