package com.fetch.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fetch.demo.DTO.UserDTO;

@Repository
public interface UserRepo extends JpaRepository<UserDTO,Integer>
{
	
}
