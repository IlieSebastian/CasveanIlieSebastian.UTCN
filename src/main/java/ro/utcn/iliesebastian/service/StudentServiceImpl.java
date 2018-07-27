package ro.utcn.iliesebastian.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.utcn.iliesebastian.dao.StudentDAO;
import ro.utcn.iliesebastian.pojo.StudentPOJO;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDAO studentDAO;
	@Override
	public List<StudentPOJO> getAllStudents() {
		return studentDAO.findAll();
	}
	@Override
	public String deleteById(Integer id) {
		studentDAO.deleteById(id);
		return "Done";
	}
	@Override
	public String findById(Integer id) {
			if(studentDAO.existsById(id))
			{
				 return studentDAO.getOne(id).toString();
			}
			return "nu exista";
	}
	@Override
	public StudentPOJO save(StudentPOJO student) {
		return studentDAO.save(student);
	}
	

}
