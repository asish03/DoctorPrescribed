package com.example.doctorpescribed;

public class userhelper {
    String fname, lname, dob, dept, mobno, username, pwd, cpwd;

    public userhelper() {
    }

    public userhelper(String fname, String lname, String dob, String dept, String mobno, String username, String pwd, String cpwd) {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.dept = dept;
        this.mobno = mobno;
        this.username = username;
        this.pwd = pwd;
        this.cpwd = cpwd;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCpwd() {
        return cpwd;
    }

    public void setCpwd(String cpwd) {
        this.cpwd = cpwd;
    }
}