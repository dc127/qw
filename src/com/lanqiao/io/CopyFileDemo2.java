package com.lanqiao.io;

import java.io.*;

/**
 * 文件复制
 * 
 * @param originalPath
 *            原始文件路径
 * @param copyPath
 *            目标文件路径
 */
public class CopyFileDemo2 {
	FileInputStream fileinputstream = null;
	FileOutputStream fileoutputstream = null;

	public void copy(String orginalPath, String copyPath) {
		File file = new File(orginalPath);
		File copyfile = new File(copyPath);
		try {
			FileInputStream fileinputstream = new FileInputStream(file);
			FileOutputStream fileoutputstream = new FileOutputStream(copyfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fileinputstream != null) {
					fileinputstream.close();
				}
				if (fileoutputstream != null) {
					fileoutputstream.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
//		CopyFileDemo2 a = new CopyFileDemo2();
//		a.copy("D:/1/sdasa.txt", "D:/1/aaaaa.txt");
	}
}
