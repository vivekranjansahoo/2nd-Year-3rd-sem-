 import java.util.*;
 
  class PrimeNumber {
	  
    public static void main(String args[]){
		
        int num,m=0,flag=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		num=sc.nextInt();
		
		m=num/2;
		
		if(num==0 || num==1){
			System.out.println("The number is not prime number");
		}
		else
		{
			for(int i=2;i<=m;i++){
				if(num%i==0)
				{
					System.out.println("The number is not prime number");
					flag=1;
					break;
				}

			}
			
			if(flag==0){
				System.out.println("The NUmber is prime number ");
			}
		}
        
    }

}
