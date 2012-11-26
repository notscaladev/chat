package org.codestream.server.data

import scala.collection.mutable.HashMap

class ChatDTO(x: HashMap[String,String]) {
  
  private var mInfo = "";
  private var mRoomName = "";
  private var mCreatorName = "";
  private var mCreationDate = "";
  private var chatRoomId = 0;
  private var mUserId = 0;
  
  def ChatDTO(x: HashMap[String, String]) = {
    this.mInfo = x.get("info").toString();
    this.mRoomName = x.get("roomname").toString();
    this.mCreatorName = x.get("creatorName").toString();
    this.mCreationDate = x.get("creationDate").toString();
    this.chatRoomId = Integer.parseInt(x.get("chatroom_id").toString());
    this.mUserId = Integer.parseInt(x.get("user_id").toString());
  }
  
  def putToMap(){
    x.put("info", this.mInfo);
    x.put("roomname", this.mRoomName);
    x.put("creatorName", this.mCreatorName);
    x.put("creationDate", this.mCreationDate);
    x.put("chatroom_id", Integer.toString(this.chatRoomId));
    x.put("user_id", Integer.toString(this.mUserId));
  }
  
  def getInfo = mInfo;
  
  def setInfo(info: String) = mInfo = info;
  
  def getRoomName = mRoomName;
  
  def setRoomName(room: String) = mRoomName = room;
  
  def getCreatorName = mCreatorName;
  
  def setCreatorName(name: String) = mCreatorName = name;
  
  def getCreationDate = mCreationDate;
  
  def setCreationDate(date : String) = mCreationDate = date;
  
  def getChatRoomId = chatRoomId;
  
  def setChatRoomId(room : Int) = chatRoomId = room;
  
  def getUserId = mUserId;
  
  def setUserId(userId : Int) = mUserId = userId;
  
}