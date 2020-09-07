package com.bit.framework.emp.model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.bit.framework.emp.model.entity.EmpVo;

public class EmpDao extends JdbcDaoSupport {
	
	public EmpDao() {
	}
	
	
	
//	public EmpDao(String driver,String url,String user,String password) {
//		System.out.println("create Dao");
//		this.driver=driver;
//		this.url = url;
//		this.user=user;
//		this.password=password;
//		try {
//			Class.forName(driver);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
	
	public List<EmpVo> selectAll() throws SQLException{
		String sql="select * from emp";
		
		return getJdbcTemplate().query(sql, new RowMapper() {
			
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException{
				return new EmpVo(rs.getInt("sabun"),rs.getString("name"),
						rs.getString("sub"),rs.getTimestamp("nalja") ,rs.getInt("pay")
						);
			}
		});
	}

	public void insertOne(String name, String sub, int pay) throws SQLException {
		String sql = "insert into emp (name,sub,nalja,pay) values (?,?,now(),?)";
		Object[] params = new Object[] {name,sub,pay};
		getJdbcTemplate().update(sql, params);
		
	}

	public Object selectOne(int sabun) throws SQLException {
		String sql = "select * from emp where sabun=?";
		return getJdbcTemplate().queryForObject(sql,new Object[] {sabun},new RowMapper<EmpVo>() {
			@Override
			public EmpVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new EmpVo(rs.getInt("sabun"),rs.getString("name"),
						rs.getString("sub"),rs.getTimestamp("nalja") ,rs.getInt("pay")
						);
			}
		});
	}

	public int updateOne(int sabun, String name, String sub, int pay) throws SQLException {
		String sql = "update emp set name=?,sub=?,pay=? where sabun=?";
		return getJdbcTemplate().update(sql,new Object[] {name,sub,pay,sabun});
		
	}
	
}
