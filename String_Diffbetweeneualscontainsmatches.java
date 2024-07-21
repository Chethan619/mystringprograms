package stringfunctionsprograms;

public class String_Diffbetweeneualscontainsmatches 
{
   /* public static void main(String[] args) // equals
   {
			String s1="Ram";
			String a1=s1.toLowerCase();
			System.out.println(a1);
			String s2="mar";
			Boolean s3=a1.equals(s2);
			System.out.println("The output of a1 equals s2 is -> " +s3);
   } */
   
   /* public static void main(String[] args) //contains is used to check/search a character or word in the given string
   {
		String s1="Rama is god";
		boolean b1=s1.contains("R");
		System.out.println("the value entered and the value present in the string contains the same word it will give true or else false -> " +b1);
	} */
	
	public static void main(String[] args) //matches is used to check/search a character or word in the given string at the same position
    {
		String name="Rama is god";
		boolean name1=name.matches("(.*)is(.*)");
		System.out.println(name1);
	}
}
