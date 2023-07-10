import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-connexion',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.css']
})
export class ConnexionComponent implements OnInit {
  user: any;
  msgErr: any;
  constructor(private http: HttpClient, private route: Router) { }

  ngOnInit(): void {
  }

  connexion(val: any) {
    this.msgErr = '';
    this.http.post('http://localhost:8286/login', val).subscribe({
      next: (data)=> {
        this.user = data;
        if(this.user != null) {
          this.route.navigateByUrl('home');
        }
        else {
          this.msgErr = 'Adresse email ou mot de passe incorrect';
        }
      },
      error: (err)=> { console.log(err) }
    })
  }
}