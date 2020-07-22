package com.hkl.model;

public class Room {
	private int roomId;
	private String roomName;
	private String roomType;
	public String getFloor() {
		return roomFloor;
	}
	public Room(int roomId, String roomName, String roomType, String floor) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.roomType = roomType;
		this.roomFloor = floor;
	}
	public Room() {
		super();
	}
	public void setFloor(String floor) {
		this.roomFloor = floor;
	}
	private String roomFloor;
	public int getRoomId() {
		return roomId;
	}
	public Room(String roomName, String roomType, String floor) {
		super();
		this.roomName = roomName;
		this.roomType = roomType;
		this.roomFloor = floor;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
}
