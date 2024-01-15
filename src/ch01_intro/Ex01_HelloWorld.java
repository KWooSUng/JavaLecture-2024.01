package ch01_intro;

// class 이름은 대문자로 시작, 숫자가 먼저 올 수 없음.
public class Ex01_HelloWorld {	

	/**
	 * document 주석 - API document를 만들 때 사용.
	 * @param args
	 */
	// method 이름 main은 소문자로 시작.
	public static void main(String[] args) {
		// sysout or syso 를 타이핑 후 Ctrl + Space 치면 System.out.println() 자동완성.
		System.out.println("Hello World!!!");	// 문장 끝에는 반드시 세미콜론(;)을 붙여야 함.
		/*
		 * 여러줄의 주석
		 */
		System.out.println("안녕하세요? " + "여러분!!!");		// 하나의 문자열만 올 수 있음. (두 개 이상일 경우에는 + 연산자로 연결)
		System.out.println();	// Ctrl + / : 문장을 주석 처리 (토글)
		// ,는 불가 +는 가능.
		
	}
	// main() -> 시작점

}
