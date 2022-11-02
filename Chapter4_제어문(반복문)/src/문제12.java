
public class 문제12 {
//개수:++,누적+=
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count3=0,count5=0;
		for(int i=0;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.println("num="+num);
			
			if(num%3==0)
				count3++;
			if(num%5==0)
				count5++;
		}
		System.out.println("count3="+count3);
		System.out.println("count5="+count5);
	}

}
