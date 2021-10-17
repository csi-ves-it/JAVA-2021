class Bank{
	private int acc_no;
    public void setAcc(int acc){
      this.acc_no=acc;
    }
    public int getAcc(){
    	return this.acc_no;
    }
}
class Encapsulation{
	public static void main(String[] args) {
		Bank obj=new Bank();
		// obj.acc_no=12345;
		obj.setAcc(12345);
		System.out.println(obj.getAcc());
        
	}
}