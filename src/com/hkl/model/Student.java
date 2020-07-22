package com.hkl.model;

public class Student {
	private int stdId;
	public int getStdId() {
		return stdId;
	}
	public Student() {
		super();
	}
	public Student(String stdName, String stdPhno, String stdGmail, int roomId) {
		super();
		this.stdName = stdName;
		this.stdPhno = stdPhno;
		this.stdGmail = stdGmail;
		this.roomId = roomId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public Student(int stdId, String stdName, String stdPhno, String stdGmail, int roomId) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdPhno = stdPhno;
		this.stdGmail = stdGmail;
		this.roomId = roomId;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdPhno() {
		return stdPhno;
	}
	public void setStdPhno(String stdPhno) {
		this.stdPhno = stdPhno;
	}
	public String getStdGmail() {
		return stdGmail;
	}
	public void setStdGmail(String stdGmail) {
		this.stdGmail = stdGmail;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	private String stdName;
	private String stdPhno;
	private String stdGmail;
	private int roomId;
}
