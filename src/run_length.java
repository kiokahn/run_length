public class run_length {
	public static void print_current_code(char code, int count) {
		
		switch(count) {
			case 0: 
				System.out.println("Encoding Error!");
				System.exit(0);
				break;
			case 1:
				System.out.print(code); //한 개만 있는경우 숫자를 출력하지 않음, 압출율 강화
										//연산량을 늘리더라도 1바이트라도 더 줄이려는 노력
				break;
			default :
				System.out.print(count);
				System.out.print(code);
		}
		
	}
	
	public static void run_length_encoding(String screen) {
		
		int str_size=screen.length();
		int count = 1;
		char prevChar = screen.charAt(0);//초기 로딩
		char curChar = '~';//오류로 인식 가능한 문자로 초기화
		
		//문자열 인덱스에 따른 탐색 범위
		//0: 초기 로딩
		//1~(str_size) : 탐색 문자열
		for( int i=1 ; i<str_size ; i++ ) 
		{
			curChar=screen.charAt(i); //screen에서 i번째 문자 하나를 읽기
			
			if(prevChar==curChar) { //이전문자와 비교하여 같은 경우
				count ++; //문자 갯수를 증가
			}else { //다른 경우
				
				print_current_code(prevChar,count); //이전까지 읽었던 문자와 그 수를 출력
				count=1; //문자 갯수를 초기화	
			}
			prevChar = curChar; //이전 문자 저장공간에 현재 문자를 저장
		}
		print_current_code(curChar,count); //문자열의 마지막까지 읽은경우 마지막으로 센 문자와 개수를 출력
		
	}
	
	public static void main(String[] args) {
		String screen = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW";
		System.out.println("Run-length encoding(RLE) Test");
		System.out.println("Input data : " + screen);
		
		System.out.print("Encoding result :");
		run_length_encoding(screen);	
	}
}