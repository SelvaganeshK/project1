package com.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chat.dao.UserNameDAO;

import com.chat.model.UserName;

@Service("userBeanService")
public class UserNameServiceImpl implements UserNameService {
    
	 @Autowired
	 UserNameDAO userBeanDAo;

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int insertRow(UserName us) {
	  return userBeanDAo.insertRow(us);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public List getList() {
	  return userBeanDAo.getList();
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public UserName getRowById(int id) {
	  return userBeanDAo.getRowById(id);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int updateRow(UserName us) {
	  return userBeanDAo.updateRow(us);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int deleteRow(int id) {
	  return userBeanDAo.deleteRow(id);
	 }

	}