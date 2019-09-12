import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:\\eclipse-jee-luna-R-win32\\eclipse\\NewFile.txt");
		File f1 = new File("D:\\eclipse-jee-luna-R-win32\\eclipse\\ReadingFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(f1);
		BufferedWriter pw = new BufferedWriter(fw);
		
		String s;
		
		s= br.readLine();
		while(s!=null){
			System.out.println(s);
			pw.write(s);
			pw.write("\n"); // new line
			s = br.readLine();
		}
		pw.flush();
		
		pw.close();
		fw.close();
		
		br.close();
		fr.close();
	}

}
