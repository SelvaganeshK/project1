package com.chat.dao;

import java.util.List;

import com.chat.model.Cmd;



public interface CommentDAO {
 public int insertRow(Cmd cat);

 public List getList();

 public Cmd getRowById(int id);

 public int updateRow(Cmd cat);

 public int deleteRow(int id);

}