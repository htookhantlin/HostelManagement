package com.hkl.model;

public class Admin {
	private int adminId;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminGamil() {
		return adminGamil;
	}
	public void setAdminGamil(String adminGamil) {
		this.adminGamil = adminGamil;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	private String adminName;
	private String adminGamil;
	private String adminPassword;
}
