package important_method_StringBufffer;

public class StringBufferMethods {

	public static void main(String[] args) {
		//length():-number of character in stringBuffer
		
		//capacity():-number of character a stringBuffer can hold
		
		//charAt(int index):-return character at particular index
		StringBuffer sb=new StringBuffer("ShreyaSingh");
		System.out.println(sb.charAt(3));
		//System.out.println(sb.charAt(30));
		
		//setCharAt():-
		sb.setCharAt(3,'Z');
		System.out.println(sb);

		//append(String):-used to add string/byte/int/long/float/boolean
		StringBuffer s1=new StringBuffer();
		s1.append("PI VALUE IS ");
		s1.append(2.12);
		s1.append("Its exactly ");
		s1.append(true);
		System.out.println(s1);
		
		//index(int index,String s):- used to add string at specific location
		StringBuffer s2=new StringBuffer("Shreya");
		s2.insert(3," PIVALUEIS ");
		System.out.println(s2);
		s2.insert(10,true);
		System.out.println(s2);
		
		//delete(int begin,int end)
		StringBuffer sb2=new StringBuffer("Shreya");
		sb2.delete(2,3);
		System.out.println(sb2);
		
		//deleteCharAt(int index)
		StringBuffer sb12=new StringBuffer("Shreya");
		sb12.deleteCharAt(2);
		System.out.println(sb12);

		//reverse():- reverse content of stringBuffer
		StringBuffer s12=new StringBuffer("Shreya");
		System.out.println(s12.reverse());

		//setlength():-
		StringBuffer ss12=new StringBuffer("ShreyaShreyaShreyaShreya");
		ss12.setLength(7);
		System.out.println(ss12);
		
		//ensureCapacity():-dynamically increase capacity of StringBuffer
		StringBuffer ss22=new StringBuffer("");
		System.out.println(ss22.capacity());
		ss22.ensureCapacity(10383);
		System.out.println(ss22.capacity());

		//trimToSize():-decrease the capacity to length size
		StringBuffer r=new StringBuffer(100);
		r.append("ABS");
		System.out.println(r.capacity());
		r.trimToSize();
		System.out.println(r.capacity());

		
		
		
		
	}

}
