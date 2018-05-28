package com.lanqiao.io;

import java.io.*;

public class CopyFileDemo {
public static void main(String[] args) {
	File file = new File("D:/1/sda.txt");
	File copyfile = new File("D:/1/sdasa.txt");
	try {
		FileInputStream fileinputsteam = new FileInputStream(file);
		FileOutputStream fileoutputstream = new FileOutputStream(copyfile);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
