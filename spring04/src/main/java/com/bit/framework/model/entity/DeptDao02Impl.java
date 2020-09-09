package com.bit.framework.model.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class DeptDao02Impl implements DeptDao{
	JdbcTemplate jdbcTemplate;
	PlatformTransactionManager transcationManager;
	
	public void setTranscationManager(PlatformTransactionManager transcationManager) {
		this.transcationManager = transcationManager;
	}
	private RowMapper<DeptVo> rowMapper = new RowMapper<DeptVo>() {
		public DeptVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new DeptVo(rs.getInt("deptno"), rs.getString("dname"),rs.getString("loc") );
		}
	};
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public List<DeptVo> selectAll() throws SQLException {
		final String sql="select * from dept order by deptno desc";
		PreparedStatementCreator psc=null;
		psc=new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				return con.prepareStatement(sql);
			}
		};
		return jdbcTemplate.query(psc, rowMapper);
	}

	public DeptVo selectOne(final int key) throws SQLException {
		final String sql ="select * from dept where deptno=?";
		PreparedStatementCreator psc = null;
		psc=new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, key);
				return pstmt;
			}
		};
		return jdbcTemplate.query(psc, rowMapper).get(0);
	}

	public void insertOne(final DeptVo bean) throws SQLException {
		final String sql = "insert into dept (dname,loc) values (?,?)";
		
		PreparedStatementCreator psc = null;
		TransactionStatus status=null;
		TransactionDefinition definition=null;
		definition = new DefaultTransactionDefinition();
		status=transcationManager.getTransaction(definition);
		
		try {
		psc = new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bean.getDname());
				pstmt.setString(2, bean.getLoc());
				return pstmt;
			}
		};
		jdbcTemplate.update(psc);
		final String sql2 = "insert into dept (dname,loc) values (?,?)";
		psc = new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt = con.prepareStatement(sql2);
				pstmt.setString(1, bean.getDname());
				pstmt.setString(2, bean.getLoc());
				return pstmt;
			}
		};
		jdbcTemplate.update(psc);
		transcationManager.commit(status);
		}catch (Exception e) {
			transcationManager.rollback(status);
		}
	}

	public int updateOne(DeptVo bean) throws SQLException {
		return 0;
	}

	public int deleteOne(int key) throws SQLException {
		return 0;
	}

}
