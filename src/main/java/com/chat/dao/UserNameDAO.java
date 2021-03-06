package com.chat.dao;

import java.util.List;

import com.chat.model.UserName;



public interface UserNameDAO {
 public int insertRow(UserName us);

 public List getList();

 public UserName getRowById(int id);

 public int updateRow(UserName us);

 public int deleteRow(int id);

}