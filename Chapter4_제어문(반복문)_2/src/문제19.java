/*
 *    *
 *   ***         i      j            ==> i+j => j=4-i
 *  *****   ==> 줄 수   공백   별표           i*2-1 =>j
 * *******       1      3     1
 *               2      2     3
 *               3      1     5
 *               4      0     7 
 */
public class 문제19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{	
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int a=1;a<=i*2-1;a++) 
			{
				System.out.print("★");
						
			}
			System.out.println();
		}
	}

}
