package com.hkl.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hkl.config.MyBatisConfig;
import com.hkl.model.Student;

public class StudentDao extends MyBatisConfig {
	public void saveStudent(Student student) {
		SqlSession s=super.sqlSF.openSession();
		try {
			s.insert("saveStudent",student);
			s.commit();
		}catch(Exception e) {
			s.rollback();
		}
	}
	public List<Student> selectAllStudent(){
		SqlSession s=super.sqlSF.openSession();
		List l=s.selectList("selectAllStudent");
		return l;
	}
}
