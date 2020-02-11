import java.util.*;


class melon{
public static void main(String[] args)
		{
	
				Scanner weight=new Scanner(System.in);
				System.out.print("Enter the weight of melon = ");
				int mweight = weight.nextInt();
				
				System.out.println("weight of melon  = "+mweight);
				
				
				
				int even = mweight%2;
				int half=mweight/2;
				int i=1,j=0;
				
				
				if (even==0){
					
							for (int k=1; k<=half;k++)
							{
								System.out.print("weight of share1  = "+(mweight-k));
								System.out.print(" "+ "weight of share2  = "+k);
								System.out.println(" ");
																					
							}
					
				}
				
			
				
	
		}

}


