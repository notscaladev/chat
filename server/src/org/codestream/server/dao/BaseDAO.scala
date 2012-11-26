package org.codestream.server.dao

import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement
import java.sql.PreparedStatement
import java.sql.DriverManager
import java.sql.SQLException

abstract class BaseDAO {
  
  protected var mConnection : Connection;
  private var mTableName = "";
  protected var mSet : ResultSet;
  protected var mStatement : Statement;
  protected var mPreparedStatement : PreparedStatement;
  private var mSql = "";
  private var lock : AnyRef = new Object();
  
  def BaseDAO(conn : Connection, table : String){
    this.mConnection = conn;
    this.mTableName = table;
  }
  
  def delete(id : Int) = lock.synchronized {
    try {
      mStatement = mConnection.createStatement();
      Class.forName("com.mysql.jdbc.Driver");
      mConnection = DriverManager.getConnection("");
      val deleteString = "DELETE FROM " + mTableName + "WHERE id = ?";
      mPreparedStatement = mConnection.prepareStatement(deleteString);
      mPreparedStatement.setInt(1,id);
      mPreparedStatement.executeUpdate();
    } catch {
        case t => t.printStackTrace();
    }
  }
  
  def select(id : Int) : ResultSet = lock.synchronized {
    try {
      mStatement = mConnection.createStatement();
      Class.forName("com.mysql.jdbc.Driver");
      mConnection = DriverManager.getConnection("");
      val selectString = "SELECT FROM " + mTableName + "WHERE id = ?";
      mPreparedStatement = mConnection.prepareStatement(selectString);
      mPreparedStatement.setInt(1, id);
      mSet = mPreparedStatement.executeQuery();
    } catch {
      case t => t.printStackTrace();
    }
    return mSet;
  }
  
  def update(field : String, value : Object) = lock.synchronized {
    try {
      mStatement = mConnection.createStatement();
      Class.forName("com.mysql.jdbc.Driver");
      mConnection = DriverManager.getConnection("");
      val updateString = "UPDATE " + mTableName + "SET field = ? WHERE value = ?";
      mPreparedStatement = mConnection.prepareStatement(updateString);
      mPreparedStatement.setString(1, field);
      mPreparedStatement.setObject(2, value);
      mPreparedStatement.executeUpdate();
    } catch {
      case t => t.printStackTrace();
    }
  }
  
  def insert(column : String, value : Object) = lock.synchronized {
    try {
      mStatement = mConnection.createStatement();
      Class.forName("com.mysql.jdbc.Driver");
      mConnection = DriverManager.getConnection("");
      val insertString = "INSERT INTO " + mTableName + "(?,?,?) values(?,?,?)";
      mPreparedStatement = mConnection.prepareStatement(insertString);
      mPreparedStatement.setString(1, column);
      mPreparedStatement.setString(2, column);
      mPreparedStatement.setString(3, column);
      mPreparedStatement.setObject(4, value);
      mPreparedStatement.setObject(5, value);
      mPreparedStatement.setObject(6, value);
      mPreparedStatement.executeUpdate();
    } catch {
      case t => t.printStackTrace();
    }
  }
}