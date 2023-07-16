package string_stringBuffer;

public class StringVsStringBuffer {

	public static void main(String[] args) {
		//String
		//In string,no change are performed at existing object
		String s=new String("Shreya");
		System.out.println(s);
		s.concat("Singh");
		System.out.println(s);
		s.concat("Kumari");
		System.out.println(s);
		s.concat("Singh");
		System.out.println(s);

		
		//StringBuffer
		//In StringBuffer,change are performed at existing object
		StringBuffer sb=new StringBuffer("Chanchal");
		System.out.println(sb);
		sb.append("Kumar");
		System.out.println(sb);
		sb.append("Yadav");
		System.out.println(sb);

	}

}
