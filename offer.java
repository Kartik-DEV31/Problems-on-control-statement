import java.util.*;


class offer{
public static void main(String[] args)
		{
	
				Scanner product1=new Scanner(System.in);
				System.out.print("Enter the cost of Product 1 = ");
				int cost1 = product1.nextInt();
				
				
				
				Scanner product2=new Scanner(System.in);
				System.out.print("Enter the cost of product2 = ");
				int cost2 = product2.nextInt();
				
				Scanner product3=new Scanner(System.in);
				System.out.print("Enter the cost of product3 = ");
				int cost3 = product3.nextInt();
				
				System.out.println("cost of product 1 = " +cost1);
				System.out.println("cost of product 2 = " +cost2);
				System.out.println("cost of product 3 = " +cost3);
				
				
				int cost=0;
				int tcost = cost1+cost2+cost3;
				int tdisc = (int)(tcost * 0.2);
				int discprice =  tcost - tdisc;

  
					if ((cost1>=0)&&(cost2>=0)&&(cost3>=0)){

				if ((cost1>cost2)&&(cost1>cost3)){
				 cost = cost1+cost2;
				
				}
				else if ((cost1 > cost3)&&(cost1 > cost2))
				{
				cost=cost1+cost3;
				}
				else if ((cost1<cost2)&&(cost1<cost3))
				{
				cost=cost2+cost3; 
				}
				else {
				System.out.println("Cost cant be equal...");
				}
				}
				else{
				  System.out.println("Cost cant be negative");
				};
				
				
				
				
				
				
				
				if(cost >= discprice ){
					
					System.out.println("Go for offer 1 and pay rs"+discprice);
					
					
					
				}
				else{
					
					System.out.println("Go for offer 2 and pay rs"+cost);
					
				};
				
				
				
				
	
	
	
       }
	
	

}


