package jpg2webp;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Jpg2webP {
	public void jpg2webP(File file){
		//File file1= new File(file);
		String newFileDir = file.getParentFile().getAbsolutePath();
		String newFilePath = file.getAbsolutePath();
		newFilePath = newFilePath.replaceAll("picture", "picture(zip)");
		newFileDir = newFileDir.replaceAll("picture", "picture(zip)");
		File file2= new File(newFilePath+".webp");
		System.out.println(file2);
				
		try {
			BufferedImage im = ImageIO.read(file); 
				if(!file2.exists()){
					File newFile = new File(newFileDir);
					boolean mkdir = newFile.mkdirs();
				}
			ImageIO.write(im, "webp", file2);
					
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
