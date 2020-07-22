package com.hkl.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hkl.dao.RoomDao;
import com.hkl.model.Room;
@WebServlet(urlPatterns = { "/roomPath" })

public class RoomController extends HttpServlet {
	private RoomDao roomDao;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String roomName=req.getParameter("roomName");
		String roomType=req.getParameter("rooms");
		String roomFloor=req.getParameter("floors");
		Room room=new Room(roomName,roomType,roomFloor);
		roomDao.saveRoom(room);
		RequestDispatcher dis=req.getRequestDispatcher("adminHome.jsp");
		dis.forward(req, resp);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		this.roomDao=new RoomDao();
	}
	
}
