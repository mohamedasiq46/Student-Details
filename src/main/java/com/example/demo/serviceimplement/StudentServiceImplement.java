package com.example.demo.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;
import com.example.demo.respository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImplement implements StudentService {
	
@Autowired
StudentRepository repo;

	@Override
	public boolean save( StudentDto details) {
		
		Student student= new Student();
		student.setId(details.getId());
		student.setName(details.getName());
		student.setDob(details.getDob());
		student.setAddress(details.getAddress());
		repo.save(student);
		return true;
	}

	@Override
	public boolean deleteById(int id) {
	repo.deleteById(id);
		return true;
	}
	@Override
	public List<Student> getAllStudent() {
		List<Student> stud= repo.findAll();
		return stud;
	}
      @Override
	public Optional<Student> getById(int id) {
		Optional<Student> stud= repo.findById(id);
		return stud;
	}
}
