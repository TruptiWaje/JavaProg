package demoProject;

public class MethodsSample {

	public static void main(String[] args)
	{
		int result = add1(2,3); //method calling statement step 1... step 4 to store return value
		System.out.println(result); //step 5 gives the output
	}
	/* public static void add(int a, int b) //void means returning nothing to the calling method
    // return type is void
	{
		int sum = a+b;
		System.out.println("Answer: " +sum);
	}*/
	public static int add1(int a, int b) // return type in int, have to return something
	{
		int sum = a+b; //step 2
		//System.out.println("Answer: " +sum);
		return sum; //step 3
	}
}
