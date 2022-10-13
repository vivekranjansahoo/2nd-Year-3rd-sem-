import java.util.*;
 
  class Pailndrome {
	  
    public static void main(String args[]){
		
        int num,reverse=0,temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		num=sc.nextInt();
		
		temp=num;
		
        while(num>0){
            int rem=num%10;
            reverse=reverse*10 + rem;
            num=num/10;
        }
		
		if(temp==reverse)
		      System.out.println("The numbe  is paildrome");
	    else
			 System.out.println("The number is not a paildome");
    }  

}
