import java.util.Scanner;


 public class UserInput{
	public static void main(String[] args){
	//fuck the police!!! the earth is not flat you fool.
		Scanner input = new Scanner(System.in);
	
	    System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your Address: ");
		String address = input.nextLine();
		
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		
		System.out.print("Enter your account balance: ");
		float accbal = input.nextFloat();
		
		System.out.print("Are you fucked?(True/False): ");
		boolean isJava = input.nextBoolean();
		System.out.println();
		
		System.out.printf("Hello %s you are welcome to first bank%n", name);
		
		System.out.printf("You are living in %s %n", address);
	
		System.out.printf("You are %d years old%n", age);
		
		System.out.printf("Welcome to your dreams, your account balance is %c%f.2 %n", '$', accbal);
		
		System.out.printf("%s do you love java? %b%n", isJava);
	
	}
 } 