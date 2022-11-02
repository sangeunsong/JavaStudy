//continue=>제외
//1~10출력 5,9제외
public class 반복제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==9)
				continue;
			System.out.print(i+" ");
		}
		System.out.println();
		//무한루프시에 주로 사용
		int i=1;
		while(i<=10)
		{
			if(i==5 || i==9)
				continue;
			System.out.print(i+" ");
			i++;
		}
			
	}

}
