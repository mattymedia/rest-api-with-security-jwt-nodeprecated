package co.com.studentregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.studentregistration.entity.Message;
import co.com.studentregistration.entity.Student;
import co.com.studentregistration.service.IStudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private IStudentService studentService;
		
	@GetMapping("/list")
	public List<Student> findAll() {
		return studentService.findAll();
	}
	 
	@PostMapping("/create")
	public ResponseEntity<Message> save(@RequestBody Student student, 
			BindingResult result){
		if(result.hasErrors()) {
			return new ResponseEntity<Message>(new Message("The student data is incorrect"), HttpStatus.BAD_REQUEST);
		}
		studentService.save(student);
		return new ResponseEntity<Message>(new Message("The student, "+ student.getSurname() + " " + student.getName() + " has been saved"), HttpStatus.OK);
	}
}
