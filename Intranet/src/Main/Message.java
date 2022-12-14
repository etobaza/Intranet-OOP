package Main;

import java.lang.*;
import java.util.*;

public class Message  {
  
    private Employee messageFrom;
    private Employee messageTo;
    private String title;
    private String text;
    private Date messageDate;

    public Message() {
      
    }
    public Message(Employee messageFrom, Employee messageTo, String title, String text, Date messageDate) {
     this.messageFrom = messageFrom;
     this.messageTo = messageTo;
     this.title = title;
     this.text = text;
     this.messageDate = messageDate;
    }
    public Message(String text) {
     this.text = text;
    }
    public Message(String text ,String title) {
     this();
     this.title = title;
    }
    public Message(String text ,String title, Date messageDate) {
     this();
     this.messageDate = messageDate;
    }


 public Employee getMessageFrom() {
  return messageFrom;
 }

 public void setMessageFrom(Employee messageFrom) {
  this.messageFrom = messageFrom;
 }

 public Employee getMessageTo() {
  return messageTo;
 }

 public void setMessageTo(Employee messageTo) {
  this.messageTo = messageTo;
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public String getText() {
  return text;
 }

 public void setText(String text) {
  this.text = text;
 }

 public Date getMessageDate() {
  return messageDate;
 }

 public void setMessageDate(Date messageDate) {
  this.messageDate = messageDate;
 }
 
 public String toString() {
  return "messageFrom = " + messageFrom + " , messageTo = " + messageTo + " , title = " + title + " , text = "
    + text + " , messageDate = " + messageDate;
 }
  
 
}