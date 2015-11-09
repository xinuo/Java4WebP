package findFile;

import java.io.File;

import jpg2webp.Jpg2webP;

public class FindFile {
	public static void main(String args[]){
		Jpg2webP j2w = new Jpg2webP();
		//j2w.jpg2webP("C:\\Users\\Administrator\\Documents\\EGDownloads\\test");
		findfile("C:\\Users\\Administrator\\Documents\\EGDownloads\\test");
	}
	
	/**
	 * 
	 * @param filepath
	 */
	static void findfile(String filepath){
		Jpg2webP j2w = new Jpg2webP();
		File file = new File(filepath);
		File[] templist = file.listFiles();
		 for (int i = 0; i < templist.length; i++) {
		   if (templist[i].isFile()&&templist[i].getName().endsWith("jpg")) {
			    System.out.println("文     件："+templist[i]);
			    j2w.jpg2webP(templist[i]);
			   }
			   if (templist[i].isDirectory()) {
			    System.out.println("文件夹："+templist[i]);
			   }
	}
	}
	
}
