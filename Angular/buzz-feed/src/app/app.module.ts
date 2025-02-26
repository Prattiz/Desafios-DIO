// app.module.ts
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { QuizzModule } from './components/quiz/quiz.module';  // Importe o QuizzModule

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    QuizzModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
