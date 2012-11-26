package org.codestream.server.data

import scala.collection.mutable.HashMap

class ChatUserDTO(x: HashMap[String,String]) {
  private var mChatUserId = 0;
  private var mChatRoomId = 0;
  
  def ChatUserDTO(){
    this.mChatUserId = Integer.parseInt(x.get("chatuser_id").toString());
    this.mChatRoomId = Integer.parseInt(x.get("chatroom_id").toString());
  }
  
  def putToMap(x : HashMap[String,String]){
    x.put("chatuser_id", Integer.toString(this.mChatUserId));
    x.put("chatroom_id", Integer.toString(this.mChatRoomId));
  }
  
  def getUserId = mChatUserId;
  
  def setUserId(userId : Int) = mChatUserId = userId;
  
  def getChatRoomId = mChatRoomId;
  
  def setChatRoomId(roomId : Int) = mChatRoomId = roomId;
}