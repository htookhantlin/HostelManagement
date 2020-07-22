package com.hkl.dao;

import org.apache.ibatis.session.SqlSession;

import com.hkl.config.MyBatisConfig;
import com.hkl.model.Admin;

public class AdminDao extends MyBatisConfig {
public Admin selectAdminById(int id) {
	SqlSession s=super.sqlSF.openSession();
	Admin admin=s.selectOne("selectAdminById",id);
	return admin;
}
}
