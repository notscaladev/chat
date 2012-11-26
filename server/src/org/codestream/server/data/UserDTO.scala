package org.codestream.server.data

import scala.collection.mutable.HashMap

class UserDTO {
  private var mLogin = "";
  private var mPassword = "";
  private var mEmail = "";
  private var mUserId = 0;
  
  def UserDTO(map : HashMap[String, String]){
    this.mLogin = map.get("login").toString();
    this.mPassword = map.get("password").toString();
    this.mEmail = map.get("email").toString();
    this.mUserId = Integer.parseInt(map.get("user_id").toString());
  }
  
  def toMap() : HashMap[String, String] = {
    val map = new HashMap[String, String];
    
    map.put("login", this.mLogin);
    map.put("password", this.mPassword);
    map.put("email", this.mEmail);
    map.put("user_id", Integer.toString(this.mUserId));
    
    return map;
  }
  
  def getLogin = mLogin;
  
  def setLogin(login : String) = mLogin = login;
  
  def getPassword = mPassword;
  
  def setPassword(password : String) = mPassword = password;
  
  def getEmail = mEmail;
  
  def setEmail(email : String) = mEmail = email;
  
  def getUserId = mUserId;
  
  def setUserId(id : Int) = mUserId = id;
}