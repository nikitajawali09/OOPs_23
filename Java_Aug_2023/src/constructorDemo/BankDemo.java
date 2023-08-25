package constructorDemo;

public class BankDemo {
	
	public int id;
	public String type;
	public double bal;
	public int accNo;
	
	public BankDemo() {
		id=979;
		type="Current";
		bal = 60000.0;
		accNo=6869696;
	}
	
	public BankDemo(int id, String type, double bal, int accNo) {
		super();
		this.id = id;
		this.type = type;
		this.bal = bal;
		this.accNo = accNo;
	}


	public void dis() {
		System.out.println("Bank Type:"+type);
		System.out.println("Bank Id :"+id);
		System.out.println("Bank bal:"+bal);
		System.out.println("Bank account no:"+accNo);
	}

	public static void main(String[] args) {
		
		BankDemo b = new BankDemo();
		b.dis();
		System.out.println();
		BankDemo b1 = new BankDemo(779,"Saving", 68688.0, 58888);
		b1.dis();
	}

}
