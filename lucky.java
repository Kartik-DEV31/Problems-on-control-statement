import java.util.*;


class lucky{
public static void main(String[] args)
		{
	
				Scanner bill=new Scanner(System.in);
				System.out.print("Enter the Bill no. = ");
				int num = bill.nextInt();
				
				System.out.println("Bill no. = "+num);
				
				
				Scanner date=new Scanner(System.in);
				System.out.print("Enter the date = ");
				int day = date.nextInt();
				
				System.out.println("Date = "+day);
				
				int c = num%day;
				int d = (num-day)%10;
				
				
				if (day<=31 && day>0){
				
				
				
				if(d==0 || c==0 ){
					
					System.out.println("You are Lucky Customer");
					
					
					
				}
				else{
					
					System.out.println("Sorry you missed");
					
				}
				
				}
				
				else {
					
					System.out.println("Check your date...");
				}
	
	
	
       }
	
	

}


