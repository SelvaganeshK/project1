package com.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chat.dao.ForumDAO;
import com.chat.dao.ForumDAOImpl;
import com.chat.model.Forum;

@Service("forumService")
public class ForumImplService implements ForumService {
    
	 @Autowired
	 ForumDAO forumDAO;

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int insertRow(Forum fo) {
	  return forumDAO.insertRow(fo);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public List getList() {
	  return forumDAO.getList();
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public Forum getRowById(int id) {
	  return forumDAO.getRowById(id);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int updateRow(Forum fo) {
	  return forumDAO.updateRow(fo);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int deleteRow(int id) {
	  return forumDAO.deleteRow(id);
	 }
}