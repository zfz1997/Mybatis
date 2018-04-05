package com.iotek.entity;

public class Student {
       int stu_id;
       String stu_name;
	public int getId() {
		return stu_id;
	}
	public void setId(int id) {
		this.stu_id = id;
	}
	public String getName() {
		return stu_name;
	}
	public void setName(String name) {
		this.stu_name = name;
	}
    public String toString() {
    	return "ID:"+stu_id+" name:"+stu_name;
    }
}
