package findFile;

import java.io.File;

import jpg2webp.Jpg2webP;

public class FindFile {
	public static void main(String args[]){
		Jpg2webP j2w = new Jpg2webP();
		findfile("C:\\Users\\Administrator\\Downloads");
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
		   if (templist[i].isFile()&&(templist[i].getName().endsWith("JPG")||templist[i].getName().endsWith("jpg")||templist[i].getName().endsWith("Jpg"))) {

			    j2w.jpg2webP(templist[i]);
			   }
			   if (templist[i].isDirectory()) {
				   findfile(templist[i].getAbsolutePath());
			   }
	}
	}
	
}
