package org.example.ums.Model;

import jakarta.persistence.*;

@Entity
@Table(name="University")
public class Ums {
    @Id
    @Column(name="Registration Number")
    private int regNo;
    @Column(name="Name")
    private String name;
    @Column(name="Class")
    private String className;
    @Column(name="Batch")
    private String batch;
    @Column(name="Start Session(Year) - End Session(Year)")

    private String session;

    public Ums(){

    }

    public Ums(int regNo, String name, String className, String batch, String session) {
        this.regNo = regNo;
        this.name = name;
        this.className = className;
        this.batch = batch;
        this.session = session;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}


