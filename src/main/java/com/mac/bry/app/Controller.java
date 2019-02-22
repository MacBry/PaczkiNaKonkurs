package com.mac.bry.app;

import java.util.List;

import com.mac.bry.entity.Box;
import com.mac.bry.services.BoxService;
import com.mac.bry.utils.DataReader;


public class Controller {
	
	
	private BoxService boxService;
	private DataReader  dataReader;
	
	public  Controller() {
		this.boxService = new BoxService();
		this.dataReader = new DataReader();
	}
	
	public int start() {
		int area = 0;
		List<Box> boxListFromFile = dataReader.readAndCreateBox();
		for(Box box : boxListFromFile) {
			area = area + boxService.getFullAreaOfBox(box);
		}
		return area;
	}
}
