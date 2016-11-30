package com.chat.service;

import java.util.List;

import com.chat.model.Cmd;



public interface CommentService {
 public int insertRow(Cmd cmd);

 public List getList();

 public Cmd getRowById(int id);

 public int updateRow(Cmd cmd );

 public int deleteRow(int id);

}