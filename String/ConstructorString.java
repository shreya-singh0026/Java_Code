package constructor_String;

public class ConstructorString {

	public static void main(String[] args) {
		//CREATE A EMPTY STRING OBJECT
		String s=new String();
		System.out.println(s);
		s.concat("hi");
		System.out.println(s);
		System.out.println(s.length());

		
		//CREATE A STRING FROM STRING LITERALS
		String lit="Shreya";
		String s1=new String(lit);
		System.out.println(s1);
		s1.concat("hi");
		System.out.println(s1);
		System.out.println(s1.length());
		
		//CREATE A STRING FROM GIVEN STRINGBUFFER
		StringBuffer sb=new StringBuffer("Chanchal");
		String s2=new String(sb);
		System.out.println(sb);
		sb.append("buffer");
		System.out.println(sb);
		System.out.println(s2);
		s2.concat("object");
		System.out.println(s2);
		
		//CREATE A STRING FROM GIVEN STRINGBUILDER
		StringBuilder sb1=new StringBuilder("Chiki");
		String s3=new String(sb1);
		System.out.println(sb1);
		sb1.append("buider");
		System.out.println(sb1);
		System.out.println(s3);
		s3.concat("object");
		System.out.println(s3);
		
		//CREATE A STRING FROM CHAR ARRAY
		char[] ch = {'A','B','C','D'};
		String s4=new String(ch);
		System.out.println(s4);
		s4.concat("no change in string object");
		System.out.println(s4);
		
		//CREATE A STRING FROM BYTE ARRAY
		byte[] b = {99,100,101,102};
		String s5=new String(b);
		System.out.println(s5);
		s5.concat("Msus");
		System.out.println(s5);

	}

}
