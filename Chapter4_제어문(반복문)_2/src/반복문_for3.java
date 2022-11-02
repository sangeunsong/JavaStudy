/*
 * 1~10=>홀수만 출력
 */
public class 반복문_for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(int i=1;i<=10;i+=2) =>홀수
		for(int i=2;i<=10;i+=2) //짝수
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i+=2; 
		}
	}

}
