
import java.nio.file.*;
import java.io.BufferedReader.*;
import java.io.Reader;
import java.io.*;
import java.nio.charset.Charset;
import java.io.IOException;


public class BigWord {

	public static void main(String[] args) {
		/*try{
			Path file = Paths.get("C:\\Users\\Zsolt_Ludanyi\\Java7Language\\basic.html");
			byte[] fileArray;
			fileArray = Files.readAllBytes(file);
			int max = 0;
			int count = 0;
			for(byte b: fileArray) {
				char ch = (char)b;
				if(ch == ' ' || ch == '\n' || ch == '\t' ) {
					if (max<count)
						max = count;
					count = 0;	
				}
				else
				{
					count++;	
				}
			}
			String s = new String(fileArray);
			String[] words = s.split("\\s+");
			int max2 = 0;
			for(String word: words) {
				if(max2<word.length())
					max2 = word.length();
			}
 			System.out.println("max: " +max);
			System.out.println("max2: " +max2);
		}
		catch (Exception e){
      			e.printStackTrace();
  		}*/
		Path file = Paths.get("C:\\Users\\Zsolt_Ludanyi\\Java7Language\\basic.html");
		try(BufferedReader reader = Files.newBufferedReader(file, Charset.forName("US-ASCII"))) {
			String line = null;
			String maxline = "";
  			while ((line = reader.readLine()) != null) {
      				if(maxline.length()<line.length())
					maxline = line;
  			}
			System.out.println("maxline: " +maxline.length() );
		} catch (IOException x) {
  			System.err.format("IOException: %s%n", x);
		}
		
	}
}