package com.lanqiao.io;

import java.io.*;

public class CopyFileDemo {
public static void main(String[] args) {
	File file = new File("D:/1/sda.txt");
	File copyfile = new File("D:/1/sdasa.txt");
	try {
<<<<<<< HEAD
		FileInputStream fileinputsteam = new FileInputStream(file);
		FileOutputStream fileoutputstream = new FileOutputStream(copyfile);
		System.out.println("sdsadah");
=======
		FileInputStream fileinputsteam = new FileInputStream(file);
		FileOutputStream fileoutputstream = new FileOutputStream(copyfile);
		System.out.println("djhsdasdh");
>>>>>>> branch 'master' of https://github.com/dc127/qw.git
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
