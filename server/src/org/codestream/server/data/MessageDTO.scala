package org.codestream.server.data

import scala.collection.mutable.HashMap

class MessageDTO() {
  private var mMessageBody = "";
  private var mPostDate = "";
  private var mAuthorName = "";
  private var mRecipient = "";
  private var mMessageId = 0;
  private var mChatRoomId = 0;
  
  def MessageDTO(){
    val map = new HashMap[String,String];
    this.mMessageBody = map.get("message_body").toString();
    this.mPostDate = map.get("post_date").toString();
    this.mAuthorName = map.get("author_name").toString();
    this.mRecipient = map.get("recipient").toString();
    this.mMessageId = Integer.parseInt(map.get("message_id").toString());
    this.mChatRoomId = Integer.parseInt(map.get("chatroom_id").toString());
  }
  
  def toMap() : HashMap[String, String] = {
    val map = new HashMap[String,String];
    map.put("message_body", this.mMessageBody);
    map.put("post_date", this.mPostDate);
    map.put("author_name", this.mAuthorName);
    map.put("recipient", this.mRecipient);
    map.put("message_id", Integer.toString(this.mMessageId));
    map.put("chatroom_id", Integer.toString(this.mChatRoomId));
    
    return map;
  }
  
  def getMessageBody = mMessageBody;
  
  def setMessageBody(body : String) = mMessageBody = body;
  
  def getPostDate = mPostDate;
  
  def setPostDate(date : String) = mPostDate = date;
  
  def getAuthorName = mAuthorName;
  
  def setAuthorName(name : String) = mAuthorName = name;
  
  def getRecipient = mRecipient;
  
  def setRecipient(recipient : String) = mRecipient = recipient;
  
  def getMessageId = mMessageId;
  
  def setMessageId(id : Int) = mMessageId = id;
  
  def getChatRoomId = mChatRoomId;
  
  def setChatRoomId(roomId : Int) = mChatRoomId = roomId;
}