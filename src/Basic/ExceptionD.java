package Basic;

/*
 * types of exception
 * 1.built exception
 * 		arithmetic exception
 * 		class not found exception
 * 		interuppted exception
 * 		sqlexpection
 * 		filenotfound exception
 * 		null pointer exception
 * 		arrayindexout of bound exception
 * 
 * 2.user defined Exception
 * 
 *  
 * 
 */
public class ExceptionD {

	public static void main(String[] args) {
		
		int m=20;
		Integer n=null;
		int ans;
		
//		try
//		{
//			ans=m/n;
//			System.out.println(ans);
//			
//		}catch(Exception e)
//		{
//			System.out.println("you cannot divided by 0");
//			System.out.println(e.getMessage());
//		}
//		finally
//		{
//			System.out.println("finally block");
//		}
		
		try
		{
			ans=m/n;
			System.out.println(ans);
		}catch (ArithmeticException e) {
			System.out.println("you can not able to divide the number by zero");
		}catch(NullPointerException e)
		{
			System.out.println("you have enter the number");
		}
	}
}