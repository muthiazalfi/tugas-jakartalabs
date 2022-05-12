/*Muthia Zahra Zalfi
 *Tugas 2  
 */

import java.util.Scanner;

public class CalculatorTask {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		char operator;
		Integer number1, number2, result;
		
		
		Scanner input = new Scanner(System.in);
		
		//Tanya pengguna untuk memasukan operator
		System.out.println("Choose an operator: +, -, *, or / ");
		operator = input.next().charAt(0);
		
		//Tanya pengguna untuk memasukan angka
		System.out.println("Enter first number:");
		number1 = input.nextInt();
			
		System.out.println("Enter second number:");
		try {
			number2 = input.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("You entered the wrong data");
		}
	
		
		switch (operator) {
		
		//Penjumlahan diantara angka s
		case '+':
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break; 
		
		//Pengurangan diantara angka
		case '-':
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;
			
		//Perkalian diantara angka 
		case '*':
			result = number1 * number2; 
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;
		
		//Pembagian diantara angka 
		case '/':
			result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);
			break;
		
		default: 
			System.out.println("Invalid operator!");
		break;
		
		}
		
		input.close();
		

	}

}
