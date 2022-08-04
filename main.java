package project3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.FileWriter;

public class main {

	public static void main(String[] args)  
	{
		Calendar cal=Calendar.getInstance();
				String str=cal.getTime().toString();
		// TODO Auto-generated method stub
		
		  
		        try 
		        {
		            File Obj = new File("myfile.txt");
		            if (Obj.createNewFile())
		            {
		                System.out.println("File created: "
		                                   + Obj.getName());
		            }
		            else 
		            {
		            	Scanner Reader = new Scanner(Obj);
		            while (Reader.hasNextLine())
		            {
		                String name = Reader.next();
		                String num=Reader.next();
		                String regex="[7-9]{1}[0-9]{9}";
		                if(num.matches(regex)==true)
		                {
		                	File myObj=new File(name+".txt");
		                	FileWriter a=new FileWriter(myObj);
		                	a.write(str);
		                	a.close();
		                }
		                
		            }
		            }
		                
		          
		        }
		        catch (IOException e) 
		        {
		            System.out.println("An error has occurred.");
		            e.printStackTrace();
		        }
	}
		
	

}
