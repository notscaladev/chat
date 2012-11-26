package org.codestream.server.data

import scala.collection.mutable.HashMap

class FriendshipDTO {
  private var mFriendName = "";
  private var mInitiatorName = "";
  private var mFriendshipId = 0;
  
  def FriendshipDTO(){
    val x = new HashMap[String,String];
    this.mFriendName = x.get("friend_name").toString();
    this.mInitiatorName = x.get("initiator_name").toString();
    this.mFriendshipId = Integer.parseInt(x.get("friendship_id").toString);
  }
  
  def putToMap() : HashMap[String,String] = {
    val map = new HashMap[String,String];
    map.put("friend_name", this.mFriendName);
    map.put("initiator_name", this.mInitiatorName);
    map.put("friendship_id", Integer.toString(this.mFriendshipId));
    
    return map;
  }
  
  def getFriendName = mFriendName;
  
  def getInitiatorName = mInitiatorName;
  
  def getFriendshipId = mFriendshipId;
  
  def setFriendName(friendName : String) = mFriendName = friendName;
  
  def setInitiatorName(name : String) = mInitiatorName = name;
  
  def setFriendshipId(id : Int) = mFriendshipId = id;
}