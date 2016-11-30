package com.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chat.dao.BlogDAO;
import com.chat.dao.BlogDAOImpl;
import com.chat.model.Blog;

@Service("blogService")
public class BlogImplservice implements BlogService {
    
	 @Autowired
	 BlogDAO blogDAO;

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int insertRow(Blog cat) {
	  return blogDAO.insertRow(cat);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public List getList() {
	  return blogDAO.getList();
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public Blog getRowById(int id) {
	  return blogDAO.getRowById(id);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int updateRow(Blog cat) {
	  return blogDAO.updateRow(cat);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int deleteRow(int id) {
	  return blogDAO.deleteRow(id);
	 }
}