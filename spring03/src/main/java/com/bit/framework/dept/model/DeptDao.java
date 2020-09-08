package com.bit.framework.dept.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.framework.dept.model.entity.DeptVo;

public interface DeptDao {
	List<DeptVo> selectAll() throws SQLException;
	int insertOne(DeptVo bean) throws SQLException;
	DeptVo selectOne(int key) throws SQLException;
	int updateOne(DeptVo bean) throws SQLException;
	int deleteOne(int key) throws SQLException;
}
