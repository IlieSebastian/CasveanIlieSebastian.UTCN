package ro.utcn.iliesebastian.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ro.utcn.iliesebastian.pojo.StudentPOJO;

public interface StudentDAO extends JpaRepository<StudentPOJO, Integer>{

}
