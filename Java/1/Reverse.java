 import java.util.*;
 
  class Reverse {
	  
    public static void main(String args[]){
		
        int num,reverse=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		num=sc.nextInt();
		
        while(num!=0){
            int rem=num%10;
            reverse=reverse*10 + rem;
            num=num/10;
        }
		
        System.out.println("The reverse is "+reverse);
    }

}
