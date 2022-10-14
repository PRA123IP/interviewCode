package assignment;

import java.io.File;
import java.io.PrintStream;

public class Finlly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f=new File("");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally
		{try {
			
			PrintStream f;
			f.close();
		}
		catch(Exception e)
		{
			System.out.println("hii");
		}
		}
	}
        
	}

}
