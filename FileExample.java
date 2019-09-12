import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:\\eclipse-jee-luna-R-win32\\eclipse\\NewFile.txt");
		File f1 = new File("D:\\eclipse-jee-luna-R-win32\\eclipse\\ReadingFile.txt");
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f, false);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		
		int k=0;
		while((k=bis.read())!=-1){
			bos.write((char)k);
			System.out.print((char)k);
		}
		
		bos.close();
		bis.close();
		
		fos.close();
		fis.close();
	}

}
