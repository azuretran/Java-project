/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.logging.Logger;

/**
 *
 * @author azure Tran
 */
public class qltkb {
    protected  String centerString;
    protected int time;
    protected String classrString;protected String teacher;
    protected int slgvnn;
    protected String room;
    protected String temporaryteacher;
     protected int session;
      protected String AssisstansString;
       protected int status;
    private static final Logger LOG = Logger.getLogger(qltkb.class.getName());

    public String getCenterString() {
        return centerString;
    }

    public int getTime() {
        return time;
    }

    public String getClassrString() {
        return classrString;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getSlgvnn() {
        return slgvnn;
    }

    public String getRoom() {
        return room;
    }

    public String getTemporaryteacher() {
        return temporaryteacher;
    }

    public int getSession() {
        return session;
    }

    public String getAssisstansString() {
        return AssisstansString;
    }

    public int getStatus() {
        return status;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public void setCenterString(String centerString) {
        this.centerString = centerString;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setClassrString(String classrString) {
        this.classrString = classrString;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setSlgvnn(int slgvnn) {
        this.slgvnn = slgvnn;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setTemporaryteacher(String temporaryteacher) {
        this.temporaryteacher = temporaryteacher;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public void setAssisstansString(String AssisstansString) {
        this.AssisstansString = AssisstansString;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public qltkb(String centerString, int time, String classrString, String teacher, int slgvnn, String room, String temporaryteacher, int session, String AssisstansString, int status) 
    {
        this.centerString = centerString;
        this.time = time;
        this.classrString = classrString;
        this.teacher = teacher;
        this.slgvnn = slgvnn;
        this.room = room;
        this.temporaryteacher = temporaryteacher;
        this.session = session;
        this.AssisstansString = AssisstansString;
        this.status = status;
    }
               
    
}
