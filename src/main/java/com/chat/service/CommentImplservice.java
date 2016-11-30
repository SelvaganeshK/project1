package com.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chat.dao.CommentDAO;
import com.chat.dao.CommentDAOImpl;
import com.chat.model.Cmd;

@Service("commentService")
public class CommentImplservice implements CommentService {
    
	 @Autowired
	 CommentDAO commentDAO;

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int insertRow(Cmd cat) {
	  return commentDAO.insertRow(cat);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public List getList() {
	  return commentDAO.getList();
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public Cmd getRowById(int id) {
	  return commentDAO.getRowById(id);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int updateRow(Cmd cat) {
	  return commentDAO.updateRow(cat);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int deleteRow(int id) {
	  return commentDAO.deleteRow(id);																																																																																	
	 }
}