package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class IOUtilTest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f=new File("e:\\guanjujinqinpp.apk");
			//按字节批量读取方式拷贝文件时间测试100MB以上
			long start = System.currentTimeMillis();
			IOUtil.copyFile(f, new File(
					"e:\\test1.apk"));
			long end = System.currentTimeMillis();
			System.out.println("文件大小"+f.length()/1024/1024+"MB\t"+"字节批量读取方式拷贝文件所需时间"+(end - start)+"ms" );	
			//按批量缓冲方式读取文件拷贝文件时间测试100MB以上
			start = System.currentTimeMillis();
			IOUtil.copyFileByBuffer2(f, new File(
					"e:\\test2.apk"));
			end = System.currentTimeMillis();
			System.out.println("文件大小"+f.length()/1024/1024+"MB\t"+"缓冲批量读取方式拷贝文件所需时间"+(end - start)+"ms" );
			
			//按缓冲方式读取方式拷贝文件测试100MB以上
			start = System.currentTimeMillis();
			IOUtil.copyFileByBuffer(f, new File(
					"e:\\test3.apk"));
			end = System.currentTimeMillis();
			System.out.println("文件大小"+f.length()/1024/1024+"MB\t"+"缓冲读取方式拷贝文件所需时间"+(end - start) +"ms");	
		
			//按字节读取方式拷贝文件测试100MB以上
			start = System.currentTimeMillis();
			IOUtil.copyFileByByte(f, new File(
					"e:\\test4.apk"));
			end = System.currentTimeMillis();
			System.out.println("文件大小"+f.length()/1024/1024+"MB\t"+"字节读取方式拷贝文件所需时间"+(end - start)+"ms" );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
