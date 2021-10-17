import java.util.Scanner;

class SwitchCase{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();

		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();

		System.out.print("Enter operation: ");
		char operation = sc.next().charAt(0);

		switch(operation){
			case '+':
				System.out.println("Addition: "+(num1+num2));
				break;
			case '-':
				System.out.println("Subtraction: "+(num1-num2));
				break;
			default:
				System.out.println("Operation not found");
		}
	}
}