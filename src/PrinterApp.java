
public class PrinterApp {

	public static void main(String[] args) {
		int number1 = 5;
		//int number2 = 3;
		int number2 = 2;
		int multiplication = number1*number2;
		int addition = number1+number2;
		int substraction = number1-number2;
		double division = number1/number2;
		
		System.out.println("Printer App");
		
	    String creator = "Kushani";
		
	    System.out.println("This app is made by: " + creator);
		
		//System.out.println(number1);
		
		System.out.println("The value of number1 is " + number1);
		
		System.out.println("The value of number2 is " + number2);

		System.out.println(number1 + " * " + number2 + " = " + multiplication);
		
		System.out.println(number1 + " + " + number2 + " = " + addition);
		
		System.out.println(number1 + " - " + number2 + " = " + substraction);
		
		System.out.println(number1 + " / " + number2 + " = " + division);
		


	}

}
