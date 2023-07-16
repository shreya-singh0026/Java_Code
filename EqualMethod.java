package equals_method;

public class EqualMethod {

	public static void main(String[] args) {
		//in String,
		//==  -> reference comparison
		//equals  -> content comparison
		String s=new String("durga");
		String s1=new String("durga");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));

		//in StringBuffer,
		//==  -> reference comparison
		//equals  -> reference comparison
		StringBuffer sb=new StringBuffer("durga");
		StringBuffer sb1=new StringBuffer("Surga");
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
		
		
		//contentEquals-->used to compare content of string and stringBuffer
		System.out.println(s.contentEquals(sb1));

		
	}

}
