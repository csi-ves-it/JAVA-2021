// class Shape{
// 	public int area(int l,int b){
//         return l*b;
// 	}
// 	public double area(int r){
// 		return 3.14*r*r;
// 	}
// }
class Parent{
	public void show(){
		System.out.println("In parent class");
	}
}
class Child extends Parent{
   public void show(){
		System.out.println("New feature");
	}
}

class Polymorphism{
	public static void main(String[] args) {
		Child c=new Child();
		c.show();
	}
}