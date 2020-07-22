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

import com.hkl.dao.*;
import com.hkl.model.Room;
import com.hkl.model.Student;

@WebServlet(urlPatterns = { "/studentPath" })
public class StudentController extends HttpServlet {
	private AdminDao adminDao;
	private RoomDao roomDao;
	private StudentDao stdDao;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("stdName");
		int roomId=Integer.parseInt(req.getParameter("stdRooms"));
		String ph=req.getParameter("stdPh");
		String gmail=req.getParameter("stdGmail");
		Student student=new Student(name,ph,gmail,roomId);
		stdDao.saveStudent(student);
		RequestDispatcher dis=req.getRequestDispatcher("adminHome.jsp");
		dis.forward(req, resp);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		adminDao = new AdminDao();
		roomDao = new RoomDao();
		stdDao=new StudentDao();
	}

}
