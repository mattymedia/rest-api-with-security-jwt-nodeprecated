package co.com.studentregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.studentregistration.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer>{

}
