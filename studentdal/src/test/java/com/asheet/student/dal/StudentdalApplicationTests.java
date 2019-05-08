package com.asheet.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.asheet.student.dal.entities.Student;
import com.asheet.student.dal.repos.IStudentRepository;
import com.asheet.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	private IStudentRepository isr;
	
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("Bond1");
		student.setCourse("Java1");
		student.setFee(30d);
		studentRepository.save(new Student());

	}
	
	@Test
	public void testFindStudentById() {
		Student student = studentRepository.findAllById(1L);
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {
		Student student = studentRepository.findAllById(1l);
		student.setFee(40d);
		studentRepository.save(student);
		//System.out.println(student);
	}

	@Test
	public void testDeleteStudent() {
		Student student = new Student();
		student.setId(1l);
		//Student student = studentRepository.delete(1l);
		studentRepository.delete(student);
		//System.out.println(student);
	}
}
