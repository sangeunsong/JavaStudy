/*
 * 
 *  1)변수 설정 2)변수 사용법 3)범위 
 *   --------지역변수(멤버변수=전역변수),매개변수(사용자의 입력값을 받는 경우)
 *           ------         
 *                  -----객체변수,공유변수
 *  1)연산자 종류 2)처리방법(결과값 예측) 3)응용=>사용처 확인
 *                                  -------------조건(부정,논리,비교),산술연산자,대입연산자
 *  1)제어문 종류 2)형식 3)동작순서 4)응용(배열)=>코딩테스트(80%)
 *                              ---------------------
 *    
 *  1.제어문의 종류
 *    =조건문(조건문,선택문)
 *     =>단일 조건문(독립적)
 *       형식) if(조건문) (제어문 뒤에는 ; X)
 *            {
 *              수행문장; (조건이 true일때) 
 *            }           
 *     =>선택 조건문:true,false를 나눠서 처리=>아이디 중복 체크, 로그인 여부, 검색어 입력
 *       형식) if(조건문)
 *            {
 *                 조건이 true일때
 *            }
 *            else
 *            {
 *                 조건이 false일때
 *            }
 *            ====================삼항연산자
 *     =>다중 조건문:해당 조건에 맞는 조건문만 실행(1개만 실행) => switch~case
 *        형식)
 *            if(조건문)
 *            {
 *               조건true=>수행문장=>종료
 *                  false=>↓
 *            }
 *            else if(조건문)
 *            {
 *                조건true=>수행문장=>종료
 *                   false=>↓
 *            }
 *            else if(조건문)
 *            {
 *                조건true=>수행문장=>종료
 *                  false=>↓
 *            }
 *            else=>해당 조건이 없는 경우 처리(생략가능)
 *            {
 *               해당 조건이 없는 경우 =>경고문장
 *            }
 *     =>선택문:1개만 실행 가능
 *      -----다중조건문(범위지정가능),선택문(한개 데이터값)
 *      switch(사용자가 보내준 값)=>정수,문자,문자열
 *      {
 *          case 정수:
 *               location.href="/movie/list";
 *          case 정수:
 *               location.href="/movie/detail";
 *          default:
 *               location.href="/main";                        
 *      }
 *    =반복문
 *     =>for ==> 반복횟수를 알고 있는 경우=>이중 for
 *       형식)
 *               1    2 <- 4
 *          for(초기값;범위;증감식)
 *                 3
 *              반복실행문장  
 *                   true
 *              1->2----->3->4
 *                     | false면 종료
 *                    true
 *                 2------>3->4
 *                     | false면 종료
 *                    true
 *                 2------>3->4
 *                       false면 종료
 *                       
 *          예) 1~100
 *             for(int i=1;i<=100;i++)
 *             100~1
 *             for(int i+100;i>=1;i--)
 *             A~Z
 *             for(char c='A';c<='Z';c++)
 *             1~100홀수
 *             for(int i=1;i<=100;i+=2)
 *             5~100 5의배수
 *             for(int i=5;i<=100;i+=5)
 *     =>while ==> 반복횟수를 모르는 경우=>무한루프(네트워크 서버,데이터베이스 값 갖고 올때)=>서버단
 *       형식)
 *           초기값 =========>1
 *           while(조건식)===>2 false종료 =>수행이 안될수 있다
 *           {
 *                 |true
 *              반복 수행문장==>3
 *              증감식=======>4 =========증가된값==>조건식
 *           }
 *             예)
 *               String id="" =>사용자가 id전송
 *        
 *               int i=10;
 *               while(i<10) false =>선 조건
 *              {
 *        
 *              }
 *           
 *     =>do~while ==>후 조건(반드시 한번 이상 수행 가능)=>웹에서 사용빈도X   
 *    =반복제어문                                                     
 *     =>반복 중단:break
 *     =>반복에서 특정 부분을 제외:continue
 *     예)
 *        String id="" =>사용자가 id전송
 *        
 *        int i=10;
 *        while(i<10) false
 *        {
 *        
 *        }
 * 
 */
public class 이중_for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
		System.out.println("\n===while문====");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		i=1;
		System.out.println("\n===do while문====");
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		
	}

}
