package org.codestream.server.data

import scala.collection.mutable.HashMap

class FriendshipDTO(x: HashMap[String, String]){
  private var mFriendName = "";
  private var mInitiatorName = "";
  private var mFriendshipId = 0;
  
  def FriendshipDTO(){
    this.mFriendName = x.get("friend_name").toString();
    this.mInitiatorName = x.get("initiator_name").toString();
    this.mFriendshipId = Integer.parseInt(x.get("friendship_id").toString);
  }
  
  def putToMap(){
    x.put("friend_name", this.mFriendName);
    x.put("initiator_name", this.mInitiatorName);
    x.put("friendship_id", Integer.toString(this.mFriendshipId));
  }
  
  def getFriendName = mFriendName;
  
  def getInitiatorName = mInitiatorName;
  
  def getFriendshipId = mFriendshipId;
  
  def setFriendName(friendName : String) = mFriendName = friendName;
  
  def setInitiatorName(name : String) = mInitiatorName = name;
  
  def setFriendshipId(id : Int) = mFriendshipId = id;
}