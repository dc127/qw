package com.lanqiao.io;

import java.io.*;

public class ReadFileDemo {
public static void main(String[] args) {
	FileInputStream fileInputStream=null;
	FileOutputStream fileOutputStream=null;
	File file = new File("D:/1/sda.txt");
	File copyfile = new File("D:/1/aaaaa.txt");
	try {
		fileInputStream = new FileInputStream(file);
		fileOutputStream = new FileOutputStream(copyfile);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	long fileSize = file.length();
	//存放文件内容的byte数组
	byte[] content = new byte[(int) fileSize];
	//读取文件内容到字节数组
	try {
		fileInputStream.read(content);//read方法有IOException需要处理
		//写入字节数组到目标文件
		fileOutputStream.write(content);//write方法有IOException需要处理
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
