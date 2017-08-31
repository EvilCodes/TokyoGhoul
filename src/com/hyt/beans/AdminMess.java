package com.hyt.beans;

public class AdminMess {
	
	String mess;
	String type;
	int state;
	public String getMess() {
		return mess;
	}
	public void setMess(String mess) {
		this.mess = mess;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public AdminMess(String mess, String type, int state) {
		super();
		this.mess = mess;
		this.type = type;
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	

}
