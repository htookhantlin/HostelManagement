package com.hkl.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hkl.config.MyBatisConfig;
import com.hkl.model.Room;

public class RoomDao extends MyBatisConfig {
	public void saveRoom(Room room) {
		SqlSession s=super.sqlSF.openSession();
		try {
			s.insert("saveRoom",room);
			s.commit();
		}catch(Exception e) {
			s.rollback();
		}
	}
	public List<Room> selectAllRoom() {
		SqlSession s=super.sqlSF.openSession();
		List l=s.selectList("selectAllRoom");
		return l;
		
	}
}
