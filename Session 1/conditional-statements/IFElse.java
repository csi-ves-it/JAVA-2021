import java.util.Scanner;

class IFElse{
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner sc = new Scanner(System.in);

		int no = sc.nextInt();

		if (no > 0) {
			System.out.println(no + " is positive");
		}else if(no < 0){
			System.out.println(no + " is negative");
		}else{
			System.out.println(no + " is zero");
		}
	}
}