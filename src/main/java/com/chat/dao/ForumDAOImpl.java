package com.chat.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chat.model.Forum;

@Repository("forumDAO")
public class ForumDAOImpl implements ForumDAO{

	@Autowired
	private SessionFactory sessionFactory;

	
	@Transactional(propagation=Propagation.SUPPORTS)
	 public int insertRow(Forum f) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  session.saveOrUpdate(f);
	  tx.commit();
	  Serializable id = session.getIdentifier(f);
	  session.close();
	  return (Integer) id;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public List getList() {
	  Session session = sessionFactory.openSession();
	  @SuppressWarnings("unchecked")
	  List fList = session.createQuery("from Forum").list();
	  session.close();
	  return fList;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public Forum getRowById(int id) {
	  Session session = sessionFactory.openSession();
	  Forum f = (Forum) session.load(Forum.class, id);
	  return f;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int updateRow(Forum f) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  session.saveOrUpdate(f);
	  tx.commit();
	  Serializable id = session.getIdentifier(f);
	  session.close();
	  return (Integer) id;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int deleteRow(int id) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  Forum f = (Forum) session.load(Forum.class, id);
	  session.delete(f);
	  tx.commit();
	  Serializable ids = session.getIdentifier(f);
	  session.close();
	  return (Integer) ids;
	 }
	
}
