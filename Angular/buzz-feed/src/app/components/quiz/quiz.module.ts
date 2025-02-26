// quizz.module.ts
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { QuizzComponent } from './quiz.component';

@NgModule({
  declarations: [QuizzComponent],
  imports: [CommonModule],
  exports: [QuizzComponent]  // Exporte o componente para ser utilizado em outros módulos
})
export class QuizzModule { }