package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;

public interface StudentRepository extends JpaRepository <Student, Integer>{


}
