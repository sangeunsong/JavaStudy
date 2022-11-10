/*
 *   252p
 *   **메소드
 *     1)인스턴스 메소드:인스턴스 변수를 이용할 때
 *     2)정적 메소드,공유 메소드(static):인스턴스 변수를 이용하지 않을 때
 *     예)
 *       String s="Hello Java!!";
 *       s.substring()
 *       String.valueOf(10)
 *       
 *       class Member
 *       {  
 *          String id,pwd; //Heap에 저장
 *          boolean isLogin(String id,String pwd) //Stack에 저장
 *          {
 *             this.id id (Member가 갖고 있는 변수와 String이 갖고 있는 변수)
 *                  -- --
 *          }
 *          구구단을 출력 (앞과 관련이 없음 =>static사용)
 *          static void gugudan()
 *          {
 *          }
 *       }
 *     
 *     ***static:공유
 *     ***instance:개인
 *     ==================>메소드(static,instance)
 *   1.메소드 선언
 *     1)인스턴스
 *       리턴형 메소드명(매개변수...)
 *       {
 *          return 값; =>생략이 가능 =>결과값(없는 경우=>void사용=>return생략이 가능)
 *       }   
 *     2)정적(static)
 *       static 리턴형 메소드명(매개변수...)
 *       {
 *          return 값;
 *       }
 *       
 *   2.메소드 호출 방식 ==============>메소드도 메모리 저장을 해서 사용 
 *     1)인스턴스:new를 이용해야 메소드가 저장 된다
 *       A a=new A();
 *           ---a가 메모리 주소의 별칭 =>a라는 공간에 메소드,변수가 저장
 *       예)
 *          class A
 *          {
 *             int a;
 *             String name;
 *             
 *             void insert(int age,String name)
 *             {
 *             }
 *             void update(int age,String name)
 *             {
 *             }
 *             void list()
 *             {
 *             }
 *          }
 *          
 *          A a=new A();
 *          
 *           a ==> -----------
 *                    age
 *                 -----------
 *                    name
 *                 -----------
 *                   insert()
 *                 -----------
 *                   update()
 *                 -----------
 *                    list()
 *                 -----------
 *                 
 *             a.age, a.insert(), a.update(), a.list()
 *             -----------------------------------------인스턴스 변수,인스턴스 메소드
 *             
 *     2)정적(static):컴파일러에 의해 메모리가 자동 저장된다
 *       class A
 *       {  
 *          static int a;
 *          static void list(){}
 *          --------------------------저장이 완료
 *       }
 *       클래스명.a, 클래스명.list()
 *       ------------------------클래스 변수,클래스 메소드
 *       
 *       라이브러리 => 클래스명.메소드()
 *                   Math.random(), String.valueOf()
 *                   
 *     3)리턴형/매개변수(사용자가 선언=>클릭,선택,입력:주소창을 통해 값이 넘어감)==>파일명?
 *       ----  ------
 *       화면 출력
 *       //https://movie.naver.com/movie/bi/mi/basic.naver?code=191657
 *       
 *       리턴형:기본형(int,double...),배열,클래스
 *       매개변수:기본형(int,double...),배열,클래스
 *           -------------------  ---------
 *            Call By Value(실제값)  Call By Reference(주소)
 */
class Names{
	String name1;
	String name2;
}
public class 메소드_1 {
	//메소드 선언 => 오버로딩:같은 클래스에서 같은 메소드를 이용해서 새로운 기능을 첨부
	//메소드명이 동일,매개변수의 개수,데이터형이 다르면 =>다른 메소드로 인식한다
	void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swap:a="+a+",b="+b);
	}
	void swap(String name1,String name2)
	{
		String temp=name1;
		name1=name2;
		name2=temp;
		System.out.println("swap:name1="+name1+",name2="+name2);
	}
	void swap(String[] names)
	{
		String temp=names[0];
		names[0]=names[1];
		names[1]=temp;
		
		System.out.println("swap:names[0]="+names[0]+",names[1]="+names[1]);
	}
	void swap(Names name)
	{
		String temp=name.name1;
		name.name1=name.name2;
		name.name2=temp;
		System.out.println("name1="+name.name1+",name2="+name.name2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		메소드_1 m=new 메소드_1();
		//swap =>m에 첨부
		int x=10;
		int y=20;
		System.out.println("main:x="+x+",y="+y);
		m.swap(x, y);
		System.out.println("main:x="+x+",y="+y); //Call By Value(값만 전송)=>메소드 안에서만 변경
		//x,y메모리=>메소드 호출(매개변수 다른 메모리가 생성)=>복사본(원본은 그대로 복사본 안에서만 변경)
		//클래스,배열=>원본이 변경(예외:String)
		//System.out.print;
		String name1="홍길동";
		String name2="박문수";
		m.swap(name1, name2);
		System.out.println("swap:name1="+name1+",name2="+name2);
		
		String[] names= {"이순신","강감찬"};
		m.swap(names);
		System.out.println("main:names[0]="+names[0]+",names[1]="+names[1]);
		
		/*
		 *   값만 변경(메소드 안에서만 변경):일반 데이터값(기본형),String
		 *   자체 변경(주소):클래스(사용자 정의 클래스),배열
		 */
		Names n=new Names();
		n.name1="홍길동";
		n.name2="김두한";
		m.swap(n);
		System.out.println("name1="+n.name1+",name2="+n.name2);
		// 매개변수 =>클래스,배열,일반 데이터
		// 리턴형 =>기본형,배열/클래스(리턴형이 없어도 된다)
	}

}
