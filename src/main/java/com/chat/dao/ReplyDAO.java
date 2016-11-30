package com.chat.dao;

import java.util.List;

import com.chat.model.Reply;



public interface ReplyDAO {
 public int insertRow(Reply rep);

 public List getList();

 public Reply getRowById(int id);

 public int updateRow(Reply rep);

 public int deleteRow(int id);

}