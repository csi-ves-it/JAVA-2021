public class OneDimensionalArray {
	public static void main(String[] args) {
		
		// declare an array
		int arr[];
		// allocate memory
		arr = new int[3];
		// In a single statment
		//int[] arr = new int[3];
		// Adding values to an array
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		//   //declare and initialize and array
		//int[] arr = {1, 2, 3};
		//  // access each array elements
		System.out.println("Accessing Elements of Array:");
		System.out.println("First Element: " + arr[0]);
		System.out.println("Second Element: " + arr[1]);
		System.out.println("Third Element: " + arr[2]);

		// loop through the array
		// System.out.println("Using for Loop:");
		// for(int i = 0; i < arr.length; i++) {
		//    System.out.println(arr[i]);
		// }

		// loop through the array
		// using for each loop
		// System.out.println("Using for-each Loop:");
		// for(int a : arr) {
		//   System.out.println(a);
		// }
	


		//Passing array to a method
	// 	largest(arr);
	// }
	// public static void largest(int arr[]) {
	// 	int largest = arr[0];
	// 	for( int i=1; i<arr.length; i++ ) {
	// 		if( arr[i] > largest )
	// 			largest = arr[i];
	// 	} 
	// 	System.out.println("Largest Number "+largest);

		//Multidimensional Arrays

// 		int[][] a = new int[3][3];

// 		//Static data
// 		for(int i = 0; i<3; i++) {
// 			for(int j = 0; j<3; j++) {
// 				a[i][j] = 0;
// 			}
// 		}
// 		display(a);
// 	}

// 	public static void display(int arr[][]) {
// 		for( int i=0; i<3; i++ ) {
// 			for( int j=0; j<3; j++) {
// 				System.out.print(arr[i][j] + " ");
// 			}
// 			System.out.println();
// 		} 
	}
}
