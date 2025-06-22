package Basic;
/*
 *  +,-,*,/,%,++,--
 *  
 *  a++ --post increment 
 *  ++a --pre increment 
 */
public class ArthimeticOperator {

	public static void main(String[] args) {
		
		int a=3,b=10,sum;
		sum=a+b;
		System.out.println("sum="+sum);
		System.out.println("sum="+(a+b));
		System.out.println("sum="+(a-b));
		System.out.println("sum="+(a/b));
		System.out.println("sum="+(a%b));
		
		System.out.println("a++="+(a++));
		System.out.println("a++="+a);
		System.out.println("++a="+(++a));
		System.out.println("a++="+(a--));
		System.out.println("a++="+a);
		System.out.println("++a="+(--a));
		
		
	}
}
