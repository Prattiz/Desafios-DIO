import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { QuizzComponent } from './components/quiz/quiz.component';
import { HomeComponent } from './pages/home/home.component';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
})
export class AppComponent {
  title = 'buzz-feed';
}
