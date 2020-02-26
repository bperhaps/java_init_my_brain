package blesk011.lecture2;

public class LongExample {
	public static void main(String[] args) {
		
		// long 타입의 변수를 초기화 할때는 정수값 뒤에 소문자 l 또는 대문자 L이 붙어있어야 함.
		// 이것은 4byte의 정수가 아니라  8byte의 정수임을 컴파일러에게 알려주기 위한 것임.
		
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000;		//컴파일 에러
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
