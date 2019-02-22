package com.mac.bry.entity;

public class Box {
	private int hight;
	private int width;
	private int deep;
	
	
	public Box(int hight, int width, int deep) {
		super();
		this.hight = hight;
		this.width = width;
		this.deep = deep;
	}


	public int getHight() {
		return hight;
	}


	public void setHight(int hight) {
		this.hight = hight;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getDeep() {
		return deep;
	}


	public void setDeep(int deep) {
		this.deep = deep;
	}
	
	
}
