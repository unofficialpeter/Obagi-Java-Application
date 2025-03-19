public class TypeCasting{
	public static void main(String[] args){
		//widening
		double weight = 678;
		System.out.printf("Your weight is %f%n", weight);
		
		//Narrowing
		char alpha = '?';
		
		int asciiCode = (char)alpha;
		System.out.printf("The ascii code for '?' i s%d%n", asciiCode);
	}
}