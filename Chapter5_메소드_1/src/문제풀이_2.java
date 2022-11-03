import java.util.Scanner;
public class 문제풀이_2 {
	static void binary1(int num)
	{
		int[] arr=new int[16];
		int index=15;
		while(true)
		{
			arr[index]=num%2;
			num=num/2;
			if(num==0) break;
			index--;
	}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" ");
			System.out.print(arr[i]);
		}
	}
				
	static int[] binary2(int num)
	{
		int[] arr=new int[16];
		int index=15;
		while(true)
		{
			arr[index]=num%2;
			num=num/2;
			if(num==0) break;
			index--;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		int[] b=binary2(num);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(" ");
			System.out.print(b[i]);
		}
				System.out.println();
				binary1(num);
	}

}
