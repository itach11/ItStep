package com.seeburger.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class FileHandler
 {

	private static final long NEEDED_LENGTH = 10000000l;
	private File searchedFile;
	
	public  void walk(String path)
	{
		File file = new File(path);
		File[] list = file.listFiles();
		boolean isFound = false;
		
		if (isFound)
			return;

		
		
		for (File f : list) 
		{
			if (f.isDirectory()) 
			{
				this.walk(f.getAbsolutePath());
				System.out.println("Dir:" + f.getAbsoluteFile());
			}

			else if (f.length() > NEEDED_LENGTH) 
			{
			this.setFile(f.getAbsoluteFile().toString());
			
			isFound=true;
			}

		}
	}

	
	public File getFile()
	{
		return this.searchedFile;
	}
	
	private void setFile(String path)
	{
		this.searchedFile=new File(path);
		
	}
	
	public static void copyFile (File source ,File destination)throws IOException
	{
		InputStream is=null;
		OutputStream os = null;
		try 
		{
	 is = new FileInputStream(source);
	 os = new FileOutputStream(destination);
	
	 byte [] buffer = new byte [512];
	int length =1;
	
	while((length-is.read(buffer))>0) {
		os.write(buffer, 0, length);;
	}
		
		}finally
		{
			is.close();
			os.close();
		}
		
		}
	
	
}
