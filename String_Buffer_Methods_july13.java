package stringfunctionsprograms;

public class String_Buffer_Methods_july13 //same methods for stringbuffer and stringbuilder
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Reddy");
	    System.out.println(s1);
	    System.out.println(s1.append(" Cool")); //append method
	    System.out.println(s1.capacity()); //capacity
	    StringBuffer s2=new StringBuffer();
	    System.out.println(s2.capacity()); //initial capacity is 16
	    System.out.println(s1.insert(5, " nice")); //insert method
	    System.out.println(s1.replace(6, 10, "done")); //replace method
	    System.out.println(s1.delete(6, 10)); //delete method
	    System.out.println(s1.reverse()); //reverse method
	    char c1=s1.charAt(3);
	    System.out.println(c1); //character at given index method
	    StringBuffer s3=new StringBuffer("All is well");
	    String s4=s3.substring(2);
	    System.out.println(s4); // substring with one parameter
	    String s5=s3.substring(2,7);
	    System.out.println(s5); // substring with two parameter
	    int i1=s1.length();
	    System.out.println(i1); //length method
	    StringBuffer s6=new StringBuffer();
	    s6.ensureCapacity(20);
	    System.out.println(s6); //ensure capacity method
	}    
}
