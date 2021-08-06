package P11_Interfaces;

import java.util.Scanner;

public class E03_InterfaceHeritage {

	public static void main(String[] args) {

		try(Scanner console = new Scanner(System.in)) {
			
			System.out.print("NUM1 : ");
			double num1 = Double.parseDouble(console.nextLine());
			System.out.print("NUM2 : ");
			double num2 = Double.parseDouble(console.nextLine());
			
			IOperation[] operations = new IOperation[4];
			
			operations[0] = new Addition();
			operations[1] = new Substraction();
			operations[2] = new Multiplication();
			operations[3] = new Division();
			
			for(IOperation oper : operations) {
				System.out.println(oper.getName() + " : " + oper.calculate(num1, num2));
			}
			
		}

	}
	
	interface IStaticNomrable {
		
		default String getName() {
			return this.getClass().getName().split("[$]")[1];
		}
		
	}

	@FunctionalInterface
	interface IOperation extends IStaticNomrable {
		
		public double calculate(double num1, double num2);
				
	}

	static class Addition implements IOperation {

		@Override
		public double calculate(double num1, double num2) {
			return num1 + num2;
		}
		
	}

	static class Substraction implements IOperation {

		@Override
		public double calculate(double num1, double num2) {
			return num1 - num2;
		}
		
	}

	static class Multiplication implements IOperation {

		@Override
		public double calculate(double num1, double num2) {
			return num1 * num2;
		}
		
	}

	static class Division implements IOperation {

		@Override
		public double calculate(double num1, double num2) {
			return num1 / num2;
		}
		
	}

}

