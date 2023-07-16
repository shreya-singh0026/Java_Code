package string_stringBuffer;
//LENGTH VS CAPACITY OF STRING AND STRINGBUFFER
public class LengthVsCapacity {

	public static void main(String[] args) {
		//In String,capacity==length,becoz we can't make any changes to the existing object
		String s=new String("");
		System.out.println(s.length());
		//System.out.println(s.capacity());
		s.concat("ShreyaSinghChikiKumari");
		System.out.println(s.length());
		//System.out.println(s.capacity());
		
		
		//In StringBuffer,default capacity=16,but if 17th character is added,its new capacity =((curent_capacity+1)*2)
		StringBuffer sb=new StringBuffer("");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("ShreyaSinghChikiKumari");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		

	}

}
