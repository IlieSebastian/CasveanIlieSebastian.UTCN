package ro.utcn.iliesebastian.service;
import java.util.*;

import ro.utcn.iliesebastian.pojo.StudentPOJO;

public interface StudentService {
	public List<StudentPOJO> getAllStudents();
	public String deleteById(Integer id);
	public String findById(Integer id);
	public StudentPOJO save(StudentPOJO student);
	public void updateStudent(Integer id,StudentPOJO studentDetails);
}
