import java.util.*;


class distribution{
public static void main(String[] args)
		{
	
				Scanner choco=new Scanner(System.in);
				System.out.print("Enter the number of chocolate = ");
				int chocono = choco.nextInt();
				
				
				
				int i,j=0;
				Scanner children=new Scanner(System.in);
				System.out.print("Enter the number of children = ");
				int childno = children.nextInt();
				for (i=1; i<=childno;i++ )
				{
				for (j= chocono;j>i;j=j-i)
				{
					chocono=chocono-i;
				 break;
			
				}
				
				
				
				}
				
				System.out.println("chocolate left = " +j);
				
				
			
				
							
				
				
	
	
	
       }
	
	

}


