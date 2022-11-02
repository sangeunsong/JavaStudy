/*
 *    aBCDE
 *    AbCDE
 *    ABcDE
 *    ABCdE
 *    ABCDe
 *    
 *    주사위 2개 던져 합이 5가 나오는 경우의 수 출력
 *    [1,4]
 *    [2,3]
 *    [3,2]
 *    [4,1]
 */
import java.util.Scanner;
public class 반복문_중첩for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i=1;i<=5;i++)
		{
			char c='A';
			for(int j=1;j<=5;j++)
			{
				if(i==j)
				{
					System.out.print((char)(c+32));
				}
				else
				{
					System.out.print(c);
				}
				c++;
			}
			System.out.println();
		}*/
		
		Scanner scan=new Scanner(System.in);
		System.out.print("2~12사이의 정수를 입력:");
		int hap=scan.nextInt();
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i+j==hap)
				{
					System.out.printf("[%d,%d]\n",i,j);
				}
			}
		}
				
	}

}
