import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  msgErr: any;
  constructor(private http: HttpClient, private route: Router) { }

ngOnInit(): void {
}

register(val: any) {
    this.http.post('http://localhost:8286/client', val).subscribe({
      next: (data)=> {
        this.route.navigateByUrl('login');
      },
      error: (err)=> { console.log(err); this.msgErr = 'Une erreur s\'est produite' }
    })
}
}