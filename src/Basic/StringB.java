package Basic;

public class StringB {

	public static void main(String[] args) {

//		StringBuffer sf = new StringBuffer("string buffer");
//		sf.append("join");
//		System.out.println(sf);
//		StringBuffer s = new StringBuffer(" new string");
//		sf.append(s);
//		System.out.println(sf);
////		sf.reverse();
////		System.out.println("reverse ="+sf);
//		System.out.println(sf.charAt(0));
//		System.out.println(sf.delete(0, 3));
//		sf.replace(1, 4, "join");
//		System.out.println(sf);
//		System.out.println(sf.capacity());
//		System.out.println(sf.deleteCharAt(0));
//		System.out.println(sf.length());
//		System.out.println(sf.insert(0, "we"));
		
		StringBuilder str =new StringBuilder("programming ");
		str.append("java");
		System.out.println(str);
		System.out.println(str.indexOf("a", 2));
	}
}
