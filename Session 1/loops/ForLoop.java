class ForLoop{
	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {
			System.out.println(i);

			if(i==8){
				break;
			}

			if(i==5){
				continue;
			}

			System.out.println("Hello");
		}
	}
}