package jpg2webp;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Jpg2webP {
	public void jpg2webP(File file){
		//File file1= new File(file);
		File file2= new File(file.getAbsolutePath()+".webp");
		System.out.println(file2);
				
		try {
			BufferedImage im = ImageIO.read(file); 
			ImageIO.write(im, "webp", file2);
					
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
