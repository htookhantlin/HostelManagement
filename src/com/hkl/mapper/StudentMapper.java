package com.hkl.mapper;

import com.hkl.model.Student;

public interface StudentMapper {
	public void saveStudent(Student student);
	public <List>Student selectAllStudent();
}
