package Basic;

import java.io.IOException;

public class Throws1 {

	static void error() throws IOException
	{
		throw new IOException("inside method");
	}
	
	public static void main(String[] args) {
		
		try
		{
			error();
		}catch (Exception e) {
			System.out.println("error handling");
			System.out.println(e.getMessage());
		}
	}
}
