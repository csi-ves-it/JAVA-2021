import java.util.Scanner;

class InputOutput{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breadth = Integer.parseInt(args[0]);

		int area = length * breadth;

		System.out.print("Length "+ length);
		System.out.println("Breadth "+ breadth);
		System.out.printf("Area: %d",area);
	}
}