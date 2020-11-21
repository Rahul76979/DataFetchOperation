package com.fetch.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fetch.demo.DTO.UserDTO;
import com.fetch.demo.Service.UserService;

@RestController
@RequestMapping(value = "/DataFetch")
public class UserCtl 
{
	@Autowired
	UserService service;
	
	@GetMapping(value = "/getAll")
	public List<UserDTO> getAll()
	{
		return service.getAll();
	}
}
