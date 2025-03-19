public class DataType{
	public static void main(String[] args) {
		//Integer type (byte, short, int, long)
        byte age = 50;
		System.out.printf("You are %d years old%n",age);
		
		short quantity = 20000;
		System.out.printf("i bought %d quantity of bags for my business %n", quantity);
		
		int populationInNigeria = 1000000;
		System.out.printf("Population in Nigeria is %d", populationInNigeria);
		
		//float-point number (float aand double)
		float weight = 5.6F;
		System.out.printf("The bag of rice is %fkg%n",weight);
		
		double accBalance = 46438.98443;
		System.out.printf("Your account balance is %c%.2f%n", '$', accBalance);
		
		//Boolean
		boolean isJavaFun = true;
		System.out.printf("is java fun?%n", isJavaFun);
		
		//charater
		char alpha = '@';
		System.out.printf("my email is myeamil%cgmail.com%n",alpha);
	}
}