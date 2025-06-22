package Basic;

/*
 * throw  
 * throws

throw

It is used to explicitly throw an exception.

It is used inside a method or a block of code.

It can throw both checked and unchecked exceptions.

The method or block throws the exception.

Stops the current flow of execution immediately.

throw new ArithmeticException("Error");

throws

It is used to declare that a method might throw one or more exceptions.

It is used in the method signature.

It is only used for checked exceptions. Unchecked exceptions do not require throws

The method's caller is responsible for handling the exception.

It forces the caller to handle the declared exceptions.

public void myMethod() throws IOException {

}

 */


public class UserDefinedException {

	
//static void print()
//{
//	try
//	{
//		throw new NullPointerException();
//		
//	}catch (Exception e) {
//		System.out.println("error");
//		throw e;
//	}
//}

public static void main(String[] args) {
	
	try
	{
		print();
	}catch (NullPointerException e) {
		System.out.println("inside main method");
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
