package stringfunctionsprograms;

public class String_Reverse_Correctway_follow 
{
	public static void main(String[] args) 
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
	}
}
