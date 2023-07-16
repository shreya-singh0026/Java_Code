package constructor_StringBuffer;

public class ConstructorStringBuffer {

	public static void main(String[] args) {
		//CREATE A EMPTY STRING OBJECT
		//default capacity=16,but if 17th character is added,
		//its new capacity =((curent_capacity+1)*2)
		StringBuffer sb=new StringBuffer("");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		//CREATE LARGE STRINGBUFFER
		//its new capacity =((curent_capacity+1)*2)
		StringBuffer sb1=new StringBuffer(1000);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		//CREATE STRINGBUFFER FROM GIVEN STRING
		//capacity=Str.length()+ defaullt_capacity
		String str="Shreya";
		StringBuffer sb2=new StringBuffer(str);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
	}

}
