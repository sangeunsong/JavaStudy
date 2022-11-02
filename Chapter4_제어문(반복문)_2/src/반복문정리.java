/*
 * 156P 157P 
 *  =>반복횟수를 알고 있음 (화면UI) 
 *  =>형식
 *    =초기값
 *    =조건식
 *     범위 지정=>횟수
 *    =증감식(++,--)=>쿠키에 저장
 *     여러개==>복합 대입연산자 사용 +=,-=
 *              false=>종료
 *                |
 *     초기값 ==> 조건문 ==> 출력 내용 ==> 증가식 ==> 조건문 ==>...
 *     for(;;) ->무한루프(조건식 안줘도 OK)
 * 167P 168P            
 *    =>데이터베이스,횟수 잘 모름
 *    =>조건식 생략 불가       
 *     초기값
 *     while(조건식)
 *     {
 *       반복수행문장
 *       증가식
 *     }
 * ---------------------------
 *   while(true) 
 *   {
 *     반복수행문장
 *     if()
 *     {
 *       종료조건
 *     }
 *   }
 *   }    
 * 175P
 *  break=>switch case,반복문에서만 사용(if문에선 사용X / for문에 소속된 if문에선 가능),break가 있는 반복문만 제어 가능
 *       =>반복문을 종료
 * 176P
 *  continue=>반복문에서만 사용 가능,continue가 있는 반복문만 제어 가능
 *          =>특정 부분을 제외할 때, 처음으로 시작할 때
 *          =>for에서 사용 -> 증가식으로 이동
 *            while/do while -> 조건식으로 이동
 * -------------------------------------------------------------------------------------------------------
 */
public class 반복문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Hello Java";
				System.out.println(msg);
		for(int i=msg.length()-1;i>=0;i--) {
			System.out.print(msg.charAt(i));
		}
	}

}
