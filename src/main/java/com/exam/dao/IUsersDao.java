package com.exam.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exam.model.UsersModel;



@Repository
@Transactional
public interface IUsersDao extends CrudRepository<UsersModel, Integer> {
	
	public UsersModel findByUserName(String userName);
	
}
