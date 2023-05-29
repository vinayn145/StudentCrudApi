package com.example.demo.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
@RequestMapping("/stud")
public class CrudController {
   Student st;
   @PostMapping
   public String addStudent(@RequestBody Student s) {
	   this.st=s;
	   return "Student added!";
   } 
   @GetMapping(value="{KodId}")
   public Student getStudent(String KodId) {
	   String temp = st.getKodId();
	   if(temp == KodId)
		   return st;
	   else
		   return null;
   }
   @PutMapping
   public String updateStudent(Student s) {
	   this.st=s;
	   return "Student Updated";
   }
   @DeleteMapping(value="{KodId}")
   public String deleteStudent(String kodId) {
	   this.st=null;
	   return "Student deleted";
   }
}
