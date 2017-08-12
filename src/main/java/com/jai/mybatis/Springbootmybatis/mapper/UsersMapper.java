package com.jai.mybatis.Springbootmybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.jai.mybatis.Springbootmybatis.model.Users;

@Mapper
public interface UsersMapper {

	@Select("select * from users")
	List<Users> findAll();
	
	@Insert("insert into users(id,name,salary) values(#{id},#{name},#{salary})")
	void insert(Users users);
}
