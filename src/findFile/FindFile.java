package findFile;

import java.io.File;
import java.net.MalformedURLException;

import jcifs.smb.SmbFile;

import jpg2webp.Jpg2webP;


public class FindFile {
	public static void main(String args[]) {
/*		SmbFile file;
		try {
			file = new SmbFile("smb://NAS//e//Picture//x!ng//DCIM//100SHARP");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		findfile("F:\\x!ng\\picture");
	}

	/**
	 * 指定文件路径或者文件夹路径进行转换
	 * 
	 * @param filepath
	 */
	static void findfile(String filepath) {
		Jpg2webP j2w = new Jpg2webP();
		File file = new File(filepath);
		if (file.isFile()&&file.getName().toLowerCase().endsWith("jpg")) {
			j2w.jpg2webP(file);
		} else if (file.isDirectory()) {
			File[] templist = file.listFiles();
			for (int i = 0; i < templist.length; i++) {
				if (templist[i].isFile() && templist[i].getName().toLowerCase().endsWith("jpg")) {
					j2w.jpg2webP(templist[i]);
				}
				if (templist[i].isDirectory()) {//
					findfile(templist[i].getAbsolutePath());
				}
			}
		}
	}
}
