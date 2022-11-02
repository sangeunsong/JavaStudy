/*
 * AAAAA
 * ------5개
 * BBBBB
 * CCCCC
 * DDDDD
 * EEEEE
 * -------1~5줄
 * 변수?
 * for(int i=1;i<=5;i++)
 * {
 *     변수?
 *     for(int j=1;j<=5;j++)
 *     {
 *        변수?
 *     }
 *     System.out.println();
 * }
 */
public class 반복문_중첩for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(c);
			}
			c++;
			System.out.println();
		}
	}

}
