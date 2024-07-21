package stringfunctionsprograms;

import java.util.Arrays;

public class String_Functions 
{
    /* public static void main(String[] args) 
    {
		String s1="Ram";
		String s2=s1.toLowerCase();
		System.out.println("After converting to lowercase ->" +s2);
	} */
    
    /* public static void main(String[] args) 
    {
		String s1="Ram";
		String s2=s1.toUpperCase();
		System.out.println("After converting to uppercase ->" +s2);
	} */
    
	/* public static void main(String[] args) 
    {
		String s1="Ram";
		int s2=s1.length();
		System.out.println("Length of the given string ->" +s2);
	} */
	
	/* public static void main(String[] args) 
    {
		String s1="Ram";
		char s2=s1.charAt(0);
		System.out.println("Character at the given index is ->" +s2);
	} */
	
	/* public static void main(String[] args) 
    {
		String s1="Ram";
		int s2=s1.indexOf('R');
		System.out.println("Index of a particular character is ->" +s2);
	} */
	
	/* public static void main(String[] args) 
    {
		String s1="   Ram is god   ";
		System.out.println(s1);
		String s2=s1.trim();
		System.out.println("After trimming the output is ->" +s2);
	} */
	
	/* public static void main(String[] args) 
    {
		String s1="Ram is god";
		String s2=s1.substring(2);
		System.out.println("After converting to substring with one parameter is ->" +s2);
	} */
	
	/* public static void main(String[] args) 
    {
		String s1="Ram is god";
		String s2=s1.substring(2, 8);
		System.out.println("After converting to substring with two parameters is ->" +s2);
	} */
	
	public static void main(String[] args) // equals
    {
		String s1="Ram";
		String a1=s1.toLowerCase();
		System.out.println(a1);
		String s2="mar";
		Boolean s3=a1.equals(s2);
		System.out.println("The output of a1 equals s2 is -> " +s3);
	} 
	
	/* public static void main(String[] args) 
    {
		String s1="Ram is god";
		boolean b1=s1.endsWith("god");
		System.out.println("the value entered and the value present in the string ends with the same word it will give true or else false ->" +b1);
	} */
	
	/* public static void main(String[] args) 
    {
		String s1="Ram is god";
		boolean b1=s1.contains("is");
		System.out.println("the value entered and the value present in the string contains the same word it will give true or else false ->" +b1);
	} */
	
	/* public static void main(String[] args) 
    {
		String s1="Manual";
		char c1[]=s1.toCharArray();
        System.out.println(Arrays.toString(c1));
    } */
}
