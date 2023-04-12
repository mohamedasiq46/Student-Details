package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
@RequestMapping
@RestController
public class StudentController {
	
	@Autowired
	StudentService serv;
	
	@PostMapping ("save")
		public boolean save(@RequestBody StudentDto details) {
			return serv.save(details);
	}
	@GetMapping ("delete")
	public boolean deleteById(int id) {
		return serv.deleteById(id);
	}
    @GetMapping ("getall")
    List<Student> getAllStudent(){
		return serv.getAllStudent();
    }
    @GetMapping ("getbyid")
    Optional<Student> getById(int id){
		return serv.getById(id);	
    }
}
