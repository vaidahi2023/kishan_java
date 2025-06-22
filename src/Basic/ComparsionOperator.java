package Basic;

//>,<,<=,>=,==,!=
//logical operators -- 
/*
 *  && --and 
 *  || --or
 *  !--not
 */
public class ComparsionOperator {

	public static void main(String[] args) {
		
		
		int a=3,b=5;
		System.out.println("a>b="+(a>b));
		System.out.println("a<b="+(a<b));
		System.out.println("a>b="+(a>=b));
		System.out.println("a>b="+(a<=b));
		System.out.println("a>b="+(a==b));
		System.out.println("a>b="+(a!=b));
		
		System.out.println("a>b && a<b="+((a>b) && (a==3)));
		System.out.println("a>b && a<b="+((a<b) && (a==3)));
		
		System.out.println("a>b && a<b="+((a>b) || (a==3)));
		
		System.out.println("a>b && a<b="+(!(a==3)));
	}
}
