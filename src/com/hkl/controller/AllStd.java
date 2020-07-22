package com.hkl.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hkl.dao.StudentDao;
import com.hkl.model.Student;
@WebServlet(urlPatterns = { "/AllStudent" })

public class AllStd extends HttpServlet {
	StudentDao stdDao;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Student> l=this.stdDao.selectAllStudent();
		System.out.print(l.get(0).getStdName());
		req.setAttribute("StudentList", l);
		RequestDispatcher dis = req.getRequestDispatcher("StudentList.jsp");
		dis.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		stdDao =new StudentDao();
	}

}
