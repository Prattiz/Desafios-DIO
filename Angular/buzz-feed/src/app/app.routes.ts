import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { QuizzComponent } from './components/quiz/quiz.component';

export const routes: Routes = [
    { path: '', component: HomeComponent },
    { path: '/sla', component: QuizzComponent },
];