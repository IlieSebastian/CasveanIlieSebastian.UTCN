package ro.utcn.iliesebastian.controller;

import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.utcn.iliesebastian.bl.StudentBL;
import ro.utcn.iliesebastian.pojo.StudentPOJO;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentBL studentBL;
	@RequestMapping(value="/")
	public String index()
	{
		return "index.html";
	}
	@GetMapping("/students")
	public List<StudentPOJO> getAllStudents() {
	    return studentBL.getAllStudents();
	}
	@DeleteMapping("/students/{id}")
	public String deleteByID(@PathVariable(value="id") Integer id)
	{
		studentBL.deleteById(id);
		return "Done";
	}
	@GetMapping("/students/{id}")
	public String findById(@PathVariable(value="id") Integer id)
	{
		return studentBL.findById(id);
		
	}
	@PostMapping("/students")
	public StudentPOJO createStudent(@Valid @RequestBody StudentPOJO student) {
	    return studentBL.save(student);
	}
	@PutMapping("/students/{id}")
	public void updateStudent(@PathVariable(value = "id") Integer id,@Valid @RequestBody StudentPOJO studentDetails) {
		studentBL.updateStudent(id, studentDetails);
		
		
		
	}
	
}
