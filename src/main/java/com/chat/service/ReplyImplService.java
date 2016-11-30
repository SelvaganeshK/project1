package com.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chat.dao.ReplyDAO;

import com.chat.model.Reply;

@Service("replyService")
public class ReplyImplService implements ReplyService {
    
	 @Autowired
	 ReplyDAO replyDAO;

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int insertRow(Reply rep) {
	  return replyDAO.insertRow(rep);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public List getList() {
	  return replyDAO.getList();
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public Reply getRowById(int id) {
	  return replyDAO.getRowById(id);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int updateRow(Reply rep) {
	  return replyDAO.updateRow(rep);
	 }

	 @Transactional(propagation = Propagation.SUPPORTS)
	 public int deleteRow(int id) {
	  return replyDAO.deleteRow(id);																																																																																	
	 }
}