package ro.utcn.iliesebastian.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.utcn.iliesebastian.pojo.StudentPOJO;
import ro.utcn.iliesebastian.service.StudentService;

@Service
public class StudentBL {
	@Autowired
	private StudentService studentService;
	public List<StudentPOJO> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	public String deleteById(Integer id)
	{
		studentService.deleteById(id);
		return "Done";
	}
	public String findById(Integer id)
	{
		return studentService.findById(id);
		
	}
	public StudentPOJO save(StudentPOJO student) {
		return studentService.save(student);
	
	
	}
}
