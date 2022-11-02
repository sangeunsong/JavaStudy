/*
 *  반복제어문
 *  =>반복문 종료:break;
 *  =>특정 부분 제거:continue;
 *  **주의점
 *    break;
 *    continue; ==>다음에는 소스 코딩 불가
 *    
 *    break ==>반복문,선택문(switch~case)에서만 사용 가능 =>제어문 종료
 *    continue ==>반복문이 있는 경우에만 사용 가능 =>제외하고 다음 반복문 수행
 *    
 *    while()
 *    {
 *      break; =>중단
 *    }
 *    for()
 *    {
 *      break; =>중단
 *    }
 *    
 *    while()
 *    {
 *      continue; =>조건식으로 이동
 *    }
 *    for(초기값;조건식;증가식)
 *    {
 *      continue; =>증가식으로 이동
 *    }
 */
//break; 1~100출력,5까지 출력 후 for 중단
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) //입력값 q,Q나오면 종료,게임 ESC누르면 종료
		{
			System.out.print(i+" "); //출력을 하고 5가되면 종료해라(위치 중요)
			if(i==5)
			{
				break;
			}
			  //System.out.print(i+" "); =>4까지만 출력 //if 소속문장 아니기 때문에 수행 가능
		}
		System.out.println();
		int i=1;
		while(i<=100)
		{
			System.out.print(i+" ");
			if(i==5)
				break; //System.exit(0)=>모든 프로그램 종료
			i++;
		}
	}

}
