//Just uncomment the code as required because both the interface and abstraction were covered in the same file


// abstract class Bank{
// 	abstract void rateOfInterest();
// 	void agreement(){
// 		System.out.println("Agreement");
// 	}

// }
// class xyzBank extends Bank{
//    void rateOfInterest(){
//    	 System.out.println("Rate of interest xyzbank:5");
//    }
// }
interface RBIBank{
	public void rateOfInterest();
	public void agreement();
}
class xyzBank implements RBIBank{
   public void rateOfInterest(){
   	 System.out.println("Rate of interest xyzbank:5");
   }
   public void agreement(){
   	System.out.println("Agreement");
   }
}
class Main{
	public static void main(String[] args) {
		xyzBank obj=new xyzBank();
		obj.rateOfInterest();
		obj.agreement();
		
	}
}