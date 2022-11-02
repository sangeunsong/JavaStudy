/*
 *  난수 6개 추출 =>합
 *  ---1~100
 */
public class 반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		/*int a=(int)(Math.random()*100)+1;
		sum+=a;
		a=(int)(Math.random()*100)+1;
		sum+=a;
		a=(int)(Math.random()*100)+1;
		sum+=a;
		a=(int)(Math.random()*100)+1;
		sum+=a;
		a=(int)(Math.random()*100)+1;
		sum+=a;
		a=(int)(Math.random()*100)+1;
		sum+=a;
		System.out.println("sum="+sum); */
		int i=1;
		while(i<=6)
		{
			int a=(int)(Math.random()*100+1);
			//a변수는 while 한번 수행 시마다 =>새로운 변수다
			sum+=a;
			i++;
		} //a는 메모리에 의해서 자동 삭제
		System.out.println("sum="+sum);

	}

}
