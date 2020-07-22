package com.hkl.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hkl.dao.AdminDao;
import com.hkl.model.Admin;

@WebServlet(urlPatterns = { "/loginPath" })
public class AdminController extends HttpServlet {
	private AdminDao adminDao;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.adminDao = new AdminDao();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("adminId"));
		String password = req.getParameter("adminPassword");
		Admin admin = this.adminDao.selectAdminById(id);
		if (password.equals(admin.getAdminPassword())) {
			RequestDispatcher dis=req.getRequestDispatcher("adminHome.jsp");
			dis.forward(req, resp);
		} else {
			RequestDispatcher dis=req.getRequestDispatcher("loginForm.jsp");
			dis.forward(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {}

}
