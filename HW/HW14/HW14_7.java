package HW14;
import java.io.*;
public class HW14_7 {

	public static void main(String args[]) throws IOException
	   {
	      int count=0;
	      String str;
	      FileReader fr=new FileReader("D:\\java\\donkey.txt");
	      BufferedReader bfr=new BufferedReader(fr);

	      while((str=bfr.readLine())!=null)
	      {
	         if(count==1)
	            bfr.skip(14);
	         System.out.println(str);
	         count++;
	      }
	      fr.close();
	   }
}
