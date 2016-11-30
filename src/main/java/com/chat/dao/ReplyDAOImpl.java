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

import com.chat.model.Reply;


@Repository("replyDAO")
public class ReplyDAOImpl implements ReplyDAO{

	@Autowired
	private SessionFactory sessionFactory;

	
	@Transactional(propagation=Propagation.SUPPORTS)
	 public int insertRow(Reply r) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  session.saveOrUpdate(r);
	  tx.commit();
	  Serializable id = session.getIdentifier(r);
	  session.close();
	  return (Integer) id;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public List getList() {
	  Session session = sessionFactory.openSession();
	  @SuppressWarnings("unchecked")
	  List rList = session.createQuery("from Reply").list();
	  session.close();
	  return rList;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public Reply getRowById(int id) {
	  Session session = sessionFactory.openSession();
	  Reply r = (Reply) session.load(Reply.class, id);
	  return r;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int updateRow(Reply r) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  session.saveOrUpdate(r);
	  tx.commit();
	  Serializable id = session.getIdentifier(r);
	  session.close();
	  return (Integer) id;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int deleteRow(int id) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  Reply r = (Reply) session.load(Reply.class, id);
	  session.delete(r);
	  tx.commit();
	  Serializable ids = session.getIdentifier(r);
	  session.close();
	  return (Integer) ids;
	 }

}
