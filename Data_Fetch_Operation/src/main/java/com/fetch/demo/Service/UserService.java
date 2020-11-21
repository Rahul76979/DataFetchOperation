package com.fetch.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fetch.demo.DTO.UserDTO;
import com.fetch.demo.Dao.UserRepo;

@Service
public class UserService 
{
	@Autowired
	UserRepo repo;

	public List<UserDTO> getAll() 
	{
		List<UserDTO> findAll = repo.findAll();
		return findAll;
	}
}
