package com.asheet.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.asheet.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

	Student findAllById(long l);

}
