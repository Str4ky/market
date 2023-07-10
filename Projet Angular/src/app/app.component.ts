import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'market';
  searchResults: Product[] = [];
  constructor() {}
}

interface Product {
  id: number;
  name: string;
}