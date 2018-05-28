package com.lanqiao.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
public static void main(String[] args) {
	File file = new File("D:/1/sda.txt");//利用String类型描述路径，创建文件对象
	File parent = file.getParentFile();  // 获取父文件
			if( !parent.exists() ) {
				parent.mkdirs();
				}  //创建所有父文件夹
	try {
	 boolean exist = file.createNewFile();//创建一个新文件，返回true代表创建成功，返回false代表文件已存在
	} catch (IOException e) {
	 e.printStackTrace();
	}
}
}
