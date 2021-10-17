class WhileLoops{
	public static void main(String[] args) {
		int i=11, sum = 0;

		while(i<=10){
			sum = sum + i;
			i++;
		}

		System.out.println("Sum "+sum);

		i=11;
		sum=0;

		do{
			sum = sum + i;
			i++;
		}while(i<=10);

		System.out.println("Sum "+sum);
	}
}