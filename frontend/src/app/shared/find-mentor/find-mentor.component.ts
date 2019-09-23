import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-find-mentor',
  templateUrl: './find-mentor.component.html',
  styleUrls: ['./find-mentor.component.css']
})
export class FindMentorComponent implements OnInit {

  mentorSearchForm: FormGroup;
  submitted: boolean = false;
  
  constructor(private formBuilder: FormBuilder, private router: Router) { }

  onSubmit() {
    this.submitted = true;
    if (this.mentorSearchForm.invalid) {
      return;
    }
  }

  ngOnInit() {
    this.mentorSearchForm = this.formBuilder.group({
       options: ['', Validators.required],
    
    });
  }

}
