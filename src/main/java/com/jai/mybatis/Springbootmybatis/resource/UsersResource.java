package com.jai.mybatis.Springbootmybatis.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jai.mybatis.Springbootmybatis.mapper.UsersMapper;
import com.jai.mybatis.Springbootmybatis.model.Users;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {
	
	private UsersMapper usersMapper;
	
	public UsersResource(UsersMapper userMapper){
		this.usersMapper=userMapper;
	}
	
	@GetMapping("/all")
	public List<Users> getAll(){
		
		return usersMapper.findAll();
		
	}
	@GetMapping("/update")
	private List<Users> updateAll(){
		
		Users users = new Users();
		
		users.setId(3);
		users.setName("karuturi");
		users.setSalary(100000);
		usersMapper.insert(users);
		
		return usersMapper.findAll();
	}
}
