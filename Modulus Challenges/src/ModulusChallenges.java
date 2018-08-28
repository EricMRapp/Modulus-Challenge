import java.util.Scanner;

public class ModulusChallenges {

	public static void main(String[] args) {
		challengeOne();
		challengeTwo();
	}

	
//did it work
	private static void challengeOne() {
		System.out.println("Please input a year and I will tell you if it is a leap year");
		Scanner s1 = new Scanner(System.in);
		int number = s1.nextInt();
		if( number%400 == 0 && number%100 != 0)
		{
			System.out.println("This is not a leap year");
		}
		else if(number%4 == 0)
		{
			System.out.println("This is a leap year");
		}	
		else {
			System.out.println("This is not a leap year");
		

	}
}
	private static void challengeTwo() {
		Scanner s2 = new Scanner(System.in);
		for(int i = 1; i <= 100; i++)
		{
		if((i % 3 == 0) && (i % 5 == 0))
		{
			System.out.println("FizzBuzz");
		}
		else if(i%3 == 0)
		{
			System.out.println("Fizz");
		}
		else if(i%5 == 0)
		{
			System.out.println("Buzz");
		}
		else {
			System.out.println(i);
		}
		}
	}
}
