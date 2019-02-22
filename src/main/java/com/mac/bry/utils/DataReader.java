package com.mac.bry.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mac.bry.entity.Box;

public class DataReader {

	private Scanner scanner;
	File file = new File("paczki.txt");

	public DataReader()  {
		super();
		
		try {
			this.scanner = new  Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public List<Box> readAndCreateBox () {
		List<Box> listOfBoxes = new ArrayList<Box>();
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] dimensions = line.split("x");
			int hight = Integer.parseInt(dimensions[0]);
			int width = Integer.parseInt(dimensions[1]);
			int deep = Integer.parseInt(dimensions[2]);
			Box box = new Box(hight, width, deep);
			listOfBoxes.add(box);
		}
		return listOfBoxes;
	}
}
