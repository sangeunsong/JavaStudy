/*
 *  for(157p)
 *  ---반복문
 *  ---반복횟수 알고 있는 경우(Front-End)
 *  1)초기값=>처음 시작값 지정
 *  2)조건식=>범위(몇번 수행)
 *  3)증감식=>i++,i+=2,i+=3
 *              ---------복합대입연산자
 *  ==>for(초기값;조건식;증감식)
 *     {
 *      수행하는 문장
 *      이미지 출력
 *      제목 출력
 *      조회수...
 *     }
 *     
 *     실행 순서
 *               ↑false(종료)
 *          ①    ②  ←  ④
 *     for(초기값;조건식;증가식)
 *     {         ↓true
 *         실행문장 ③
 *     }  
 *    ========================
 *    while:반복횟수 모르는 경우
 *          데이터베이스 프로그램,네트워크(서버/클라이언트)=>무한루프(서버)
 *          
 *           초기값,조건식,증가식(=for)=>형식만 조금 다름
 *           
 *    초기값 ① (1.조건식에 대입(true/false))
 *    while(조건식) ② ====================> false종료
 *    {
 *          ↓true
 *       반복실행문장 ③
 *       증가식 ④ =========> ②로 이동
 *    }   
 *           
 */  
//1~10=>1씩 증가,출력
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("");	//다음줄에 출력		
		int i=1;
		while(i<=10) 
		{
			System.out.print(i+" ");
			i++;
			 
		}
	}

}
