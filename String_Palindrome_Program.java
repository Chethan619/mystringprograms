package stringfunctionsprograms;

public class String_Palindrome_Program 
{
	/* public static void main(String[] args) 
    {
		String s1="My name";
		String s2=s1.toLowerCase();
		String reverse="";
		for(int i=s2.length()-1;i>=0;i--)
		{
			char c1=s2.charAt(i);
			reverse=reverse+c1;
		}
		System.out.println(reverse);
		boolean b1=s2.equals(reverse);
		System.out.println(b1);
		if(b1==true)
		{
			System.out.println("It is palindrome");
		}
		else
		{
	        System.out.println("It is not a palindrome");
		}
	} */
	
	public static void main(String[] args) 
    {
		String s1="Mom";
		String s2=s1.toLowerCase();
		String reverse="";
		for(int i=s2.length()-1;i>=0;i--)
		{
			char c1=s2.charAt(i);
			reverse=reverse+c1;
		}
		System.out.println(reverse);
		boolean b1=s2.equals(reverse);
		System.out.println(b1);
		if(b1==true)
		{
			System.out.println("It is palindrome");
		}
		else
		{
	        System.out.println("It is not a palindrome");
		}
	}
}
