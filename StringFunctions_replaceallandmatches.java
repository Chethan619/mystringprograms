package stringfunctionsprograms;

public class StringFunctions_replaceallandmatches 
{
    /* public static void main(String[] args) //In the given name remove all a's present in it
    {
		String name="ram";
		String name1=name.replaceAll("a", "");
		System.out.println(name1);
	} */
    
	/* public static void main(String[] args) //In the given name replace a with r
    {
		String name="ram";
		String name1=name.replaceAll("a", "r");
		System.out.println(name1);
	} */
	
	/* public static void main(String[] args) //In the given string remove all the space
    {
		String name="my name is ram";
		String name1=name.replaceAll(" ", "");
		System.out.println(name1);
	} */
	
	/* public static void main(String[] args) //In the given string remove all the capital letters
    {
		String name="RaM";
		String name1=name.replaceAll("[A-Z]", "");
		System.out.println(name1);
	} */
	
	/* public static void main(String[] args) //In the given string remove all the small letters
    {
		String name="RaM";
		String name1=name.replaceAll("[a-z]", "");
		System.out.println(name1);
	} */
	
	/* public static void main(String[] args) //In the given string replace all the numeric values
    {
		String name="Ram roll no is 12";
		String name1=name.replaceAll("[0-9]", "");
		System.out.println(name1);
	} */
	
	/* public static void main(String[] args) //Check if the given string has 4 letters in it
    {
		String name="Rama";
		boolean name1=name.matches("....");
		System.out.println(name1);
	} */
	
	/* public static void main(String[] args) //Check if the given string ends with a
    {
		String name="Rama";
		boolean name1=name.matches("(.*)a");
		System.out.println(name1);
	} */
	
	/* public static void main(String[] args) //Check if the given string starts with r
    {
		String name="Rama";
		boolean name1=name.matches("R(.*)");
		System.out.println(name1);
	} */
	
	/* public static void main(String[] args) //Check in the given string m is present
    {
		String name="Rama";
		boolean name1=name.matches("(.*)m(.*)");
		System.out.println(name1);
	} */
	
	/* public static void main(String[] args) //Check in the given string z is present
    {
		String name="Rama";
		boolean name1=name.matches("(.*)z(.*)");
		System.out.println(name1);
	} */
	
	/* public static void main(String[] args) //Check in the given string a is present in the second place or not
    {
		String name="Rama";
		boolean name1=name.matches(".a(.*)");
		System.out.println(name1);
	} */
	
	public static void main(String[] args) //Check in the given string m is present in the second place or not
    {
		String name="Rama";
		boolean name1=name.matches(".m(.*)");
		System.out.println(name1);
	}
}
