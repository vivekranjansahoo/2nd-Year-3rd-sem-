class Account{
	int id;
	String name;
	float amount;
	
	// insert the amout 
	
	void insert(int i,String n,float amt){
		id=i;
	    name=n;
		amount=amt;
	}
	
	//deposit
	
	void deposit(float amt){
		amount=amount+amt;
		System.out.println(amt+"deposit succesfully");
	}
	
	//withdraw
	
	void withdraw(float amt){
		if(amount<amt){
			System.out.println("Insufficient amount");
		}
		else
		{
			amount=amount-amt;
			System.out.println(amt+"has been debited");
		}
	}
	
	//check balance
	
	void checkbal(){
		System.out.println("The amount is "+amount);
	}
	
	//display the infomation
	
	void checkinfo(){
		System.out.println(id+" "+name+" "+amount);
	}
	
}

class TestAccount
{
	public static void main(String args[]){
		Account a=new Account();
		a.insert(1,"Vivek",1);
		a.checkinfo();
		a.checkbal();
		
		a.deposit(1000);
		a.checkbal();
		
		a.withdraw(500);
		a.checkbal();
	}
}
