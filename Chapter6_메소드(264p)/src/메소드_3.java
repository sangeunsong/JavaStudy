
public class 메소드_3 {
	static void aaa()
	{
		//static에서는 인스턴스변수,메소드 호출 시 반드시 메모리 할당을 한 후에 사용한다
		메소드_3 m=new 메소드_3();
		m.first(); // => static안에서 intance호출 불가능
	}
	void first() 
	{
		aaa(); //static,instance 둘 다 호출이 가능
		System.out.println("first() 진입...");
		second();
		System.out.println("first() 종료...");
	}	
	void second()
	{
		System.out.println("second() 진입...");
		last();
		System.out.println("second() 종료...");			
	}
	void last()
	{
		System.out.println("last() 진입...");
		System.out.println("last() 종료...");
	}
	/* 
	 *    last      
	 *   ------    
	 *   second    second
	 *   ------    ------
	 *   first      first      first  
	 *   ------    ------     ------     ------
	 *    main      main       main       main     => -----
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드가 메모리에 저장이 안됨
		System.out.println("main() 진입...");
		메소드_3 m=new 메소드_3(); //메모리 안에 메소드가 저장
		System.out.println("메모리 제작 m="+m);
		System.out.println(m+" 메모리 주소에 메소드가 전체 저장");
		m.first();
		System.out.println("main() 종료...");
	}
	

}
