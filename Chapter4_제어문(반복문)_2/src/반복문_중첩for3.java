/*
 * 1####
 * #2###
 * ##3##
 * ###4#
 * ####5
 * 
 * ★☆☆☆☆
 * ☆★☆☆☆
 * ☆☆★☆☆
 * ☆☆☆★☆
 * ☆☆☆☆★
 * 
 * ☆☆☆☆★
 * ☆☆☆★☆
 * ☆☆★☆☆
 * ☆★☆☆☆
 * ★☆☆☆☆
 * 
 * i      j   ↓=>i+j
 * 1      5    =  6
 * 2      4    =  6
 * 3      3    =  6   =>  j=6-i  수열(방정식)
 * 4      2    =  6
 * 5      1    =  6
 * 
 * ★☆☆☆★
 * ☆★☆★☆
 * ☆☆★☆☆
 * ☆★☆★☆
 * ★☆☆☆★
 * 
 */

public class 반복문_중첩for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++)
			{
				if((6-i==j) || (i==j))
					System.out.print("★");
				else
					System.out.print("☆");
			}
				
				System.out.println();
		}	
		
    }
}