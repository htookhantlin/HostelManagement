package com.hkl.mapper;

import java.util.List;

import com.hkl.model.Room;

public interface RoomMapper {
	public void saveRoom(Room room);
	public List<Room> selectAllRoom();
}
