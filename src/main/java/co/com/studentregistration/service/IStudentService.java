package co.com.studentregistration.service;

import java.util.List;

import co.com.studentregistration.entity.Student;

public interface IStudentService {

	public List<Student> findAll();
	
	public Student save(Student student);
}
