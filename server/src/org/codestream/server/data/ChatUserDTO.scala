package org.codestream.server.data

import scala.collection.mutable.HashMap

class ChatUserDTO {
  private var mChatUserId = 0;
  private var mChatRoomId = 0;
  
  def ChatUserDTO(){
    val x = new HashMap[String, String];
    this.mChatUserId = Integer.parseInt(x.get("chatuser_id").toString());
    this.mChatRoomId = Integer.parseInt(x.get("chatroom_id").toString());
  }
  
  def putToMap() : HashMap[String, String] = {
    val x = new HashMap[String, String];
    x.put("chatuser_id", Integer.toString(this.mChatUserId));
    x.put("chatroom_id", Integer.toString(this.mChatRoomId));
    return x;
  }
  
  def getUserId = mChatUserId;
  
  def setUserId(userId : Int) = mChatUserId = userId;
  
  def getChatRoomId = mChatRoomId;
  
  def setChatRoomId(roomId : Int) = mChatRoomId = roomId;
}