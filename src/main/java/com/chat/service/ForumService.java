package com.chat.service;

import java.util.List;

import com.chat.model.Forum;



public interface ForumService {
 public int insertRow(Forum fo);

 public List getList();

 public Forum getRowById(int id);

 public int updateRow(Forum fo );

 public int deleteRow(int id);

}