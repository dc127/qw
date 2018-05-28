package com.lanqiao.io;

import java.io.*;

public class CopyFileDemo {
public static void main(String[] args) {
	File file = new File("D:/1/sda.txt");
	File copyfile = new File("D:/1/sdasa.txt");
	try {
		FileInputStream fileinputsteam = new FileInputStream(file);
		FileOutputStream fileoutputstream = new FileOutputStream(copyfile);
<<<<<<< HEAD
		System.out.println("dasdaa");
=======
		System.out.print("adsds");
>>>>>>> branch 'master' of https://github.com/dc127/qw.git
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
