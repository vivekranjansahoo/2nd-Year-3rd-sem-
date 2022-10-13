 import java.util.*;
 import java.lang.Math;
 
  class Armstrong  {
	  
    public static void main(String args[]){
		
        int num,sum=0,digit=0,temp,last=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		num=sc.nextInt();
		
		temp=num;
		
		while(temp>0)
		{
			temp=temp/10;
			digit++;
		}
		
		temp=num;
		
		
        while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digit));
            temp=temp/10;
        }
		
		if(num==sum)
        System.out.println("The number is Armstrong ");
	    else 
			System.out.println("The number is not Armstong");
    }

}
