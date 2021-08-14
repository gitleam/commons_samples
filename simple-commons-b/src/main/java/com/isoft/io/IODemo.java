package com.isoft.io;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * 
 * @author 
 * @date   2021年8月14日
 * @time   下午7:22:43
 * @description
 * org.apache.commons.io.IOUtils
 * org.apache.commons.io.FileUtils
 * org.apache.commons.io.FilenameUtils
 */
public class IODemo {
	
	public static void main(String[] args) throws Exception {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		//demo6();
	}
	
	
	static void demo1() throws Exception{
		File file=new File("E:/log");
		String content=FileUtils.readFileToString(file);
		System.out.println(content);
		
	}
	
	static void demo2() throws Exception{
		File srcFile=new File("E:/log");
		File destFile=new File("E:/log2");
		FileUtils.copyFile(srcFile, destFile);
		 
		
	}
	
	static void demo3() throws Exception{
		File file=new File("E:/log");
		FileUtils.writeStringToFile(file, "hello");  //内容清空	
	}
	
	static void demo4() throws Exception{
		File file=new File("E:/log");
		FileUtils.forceMkdir(file);
	}
	
	static void demo5() throws Exception{
		File srcDir=new File("E:/log");
		File destDir=new File("E:/log2");
		FileUtils.copyDirectory(srcDir, destDir);
	}
	
	
//	static void demo6() throws Exception{
//		File directory=new File("E:/log");
//		 
//		List<File> list=(List<File>) FileUtils.listFiles(directory, null, null);
//		System.out.println(list);
//		
//	}
	
	
	
}
