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

import com.hkl.dao.RoomDao;
import com.hkl.model.Room;
@WebServlet(urlPatterns = { "/selectAllRoom" })
public class selectAll extends HttpServlet {
	private RoomDao roomDao;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Room> l = this.roomDao.selectAllRoom();
		req.setAttribute("RoomList", l);
		RequestDispatcher dis = req.getRequestDispatcher("roomList.jsp");
		dis.forward(req, resp);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		roomDao = new RoomDao();
	}

}
