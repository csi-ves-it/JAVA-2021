class Bike{
	public void break_feature(){
		System.out.println("Breaks");
	}
	public void speed(){
		System.out.println("Speed");
	}
}
class ModifiedBike extends Bike{

	public void engine(){
		System.out.println("Engine");
	}
}
class Inheritance{
	public static void main(String[] args) {
		ModifiedBike obj=new ModifiedBike();
		obj.engine();
		obj.break_feature();
		obj.speed();
	}
}