package com.hkl.config;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	public SqlSessionFactory sqlSF;
	
	public MyBatisConfig(){
		try{
			Reader reader=Resources.getResourceAsReader("mybatis_config.xml");			
			this.sqlSF=new SqlSessionFactoryBuilder().build(reader);			
		}catch(Exception e){	
			e.printStackTrace();
		}
	}
}
