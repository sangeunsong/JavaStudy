import java.util.Scanner;

/*
 *   ★
 *   ★★    => 줄 수 = 별 수 
 *   ★★★       i   =  j 
 *   ★★★★
 *   
 *   ★★★★
 *   ★★★      5-줄 수 = 별 수
 *   ★★
 *   ★
 *   
 *   A
 *   BC
 *   DEF
 *   GHIJ
 *   
 *   A
 *   AB
 *   ABC
 *   ABCD
 */
import java.util.Scanner;
public class 반복문_중첩4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan=new Scanner(System.in);
		//System.out.print("정수 입력:");
		//int n=scan.nextInt();
		char c='A';
		for(int i=1;i<=4;i++) // 정렬,빈도수,통계,순위결정 =>밑으로 간다
		{			
			for(int j=1;j<=i;j++) // =>옆으로 간다
			{
					System.out.print(c++);
			}
			System.out.println();		
		}
	}

}
