package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;

public interface StudentService {

    public boolean save(StudentDto details) ;
	public boolean deleteById(int id);
	public List<Student> getAllStudent();
	public Optional<Student> getById(int id);
}
