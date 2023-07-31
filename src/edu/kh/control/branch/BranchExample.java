package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	
	public void ex1() {
		
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		// 단, 5를 출력하면 반복문 종료
		// 1 2 3 4 5
		
		 for(int i =1; i <=10; i++) {
			 
			 System.out.print(i + " ");
			 
			 if ( i == 5 ) {
				 
				 break;
			 }
			 
//			 System.out.print(i + " ");  //여기하면 결과값 1 2 3 4 됨.
		 }
			
	}
	
	
	
	
	
	
	public void ex2() {
		// 5가 입력될때 까지의 모든 정수의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		
		// while문을 처음에 무조건 수행하고, 특정 조건에 종료하는 방법
		// 1) input에 초기값을 5가 아닌 다른값 while (input != 5)
		//
		// 2) do~while문 사용
		//
		// 3) 무한 루프 상태의 while문을 만들고
		//    내부에 break 조건 작성
		
		while(true) {  // 무한루프
			
			System.out.println("정수 입력 : ");
			input = sc.nextInt();  // 입력
			
						
//			sum += input; // 3입력후 5입력시 결과 값 8
			
			if(input == 5) {
				break;
			
				// sum += input; // 여기는 안되므로, 적으면 에러남.
			}
			
			
			
			sum += input; // 3입력후 5입력시 결과값 3
			
		}
		
		System.out.println("합계 : " + sum);
			
	}
	
	
	
	
	
	
	public void ex3() {
		
		// 입력받은 모든 문자열을 누적
		// 단, "exit@"입력 시 문자열 누적을 종료하고 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		String str = ""; // 빈 문자열
						// 쌍따옴표("")라는 기호를 이용해 String 리터럴임을 지정
						// 하지만 내용은 없음.
		
//		String str = null;
//		String str;
//		
//		위2개와 아래1개는 다름
//		
//		String = "";
		
		while(true) {
			
			System.out.print("문자열 입력(exit@ 입력 시 종료) : ");
			
			String input = sc.nextLine();
			// next() : 다음 한 단어 (띄어쓰기 포함X)
			// nextLine() : 다음 한 줄 (띄어쓰기 포함O)
			
//			if(input == "exit@") {
//				break;
//			}
//			input String 기본자료형이 아닌 참조형이므로 == 사용안됨
			
			if( input.equals("exit@") ) {
				// String 자료형은 비교연산자(==)로 같은 문자열인지 판별할 수 없다.
				//
				// 비교 연산자는 보통 기본자료형끼리의 연산에서만 사용 가능하다.
				// -> String은 기본자료형이 아닌 참조형
				//
				// ** 해결방법 : 문자열1.equals(문자열2) 으로 비교 가능 **
				
				break;
			}
			
			str += input + "\n";
			
		}
		
		System.out.println("==============================");
		System.out.println(str);
		
	}
	
	
	
	
	
	
	
	public void ex4() {
		
		
//		2 x 1 =  2   2 x 2 =  4
//		3 x 1 =  3   3 x 2 =  6   3 x 3 =  9
//		...
//		9 x 1 =  9   9 x 2 = 18   9 x 3 = 27 ... 9 x  9 = 81
		
		// 중첩 반복문 내부에서 break 사용하기
		// 구구단 2~9단
		// 단, 2단은 *2까지, 3단은 *3까지, 4단은 *4까지... 9단은 *9까지 출력
		
	
		for(int dan=2; dan<=9; dan++) {
			
			for(int num=1; num<=9; num++) {
				
				System.out.printf( "%d x %d = %2d   ", dan, num, dan * num);
				
				if( num == dan ) {
					break;
				}
				
				
			}
			System.out.println();	
							
		}
			
	}
	

	
	
	
	
	// ** 여기서부터 continue문 **
	
	public void ex5() {
		
		// break : 반복문을 바로 멈춤
		// continue : (반복문 내에서) 다음 반복으로 넘어감
		//
		// 1 ~ 10까지 1씩 증가하며 출력
		// 단, 3의 배수 제외
		
		for(int i =1; i<=10; i++) {
			
			if(i % 3 == 0) {
				continue; //아래(print)하지말고 바로 다음반복으로 넘어가라
				
			}
			
			System.out.print(i+ " ");
			
		}
		
				
	}
	
	
	
	
	
	
	
	public void ex6() {
		// 1~100까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을 때 반복을 멈춤
		// (39까지 출력)
		//
		// 1
		// 2
		// 3
		// ...
		// 39
		
		
		for (int i=1; i<=100; i++) {
			
//			System.out.print(i+" ");	(40까지 나오게 하려면)	

			
			if( i == 40 ) {
				break;
			}
			
			
			if( i % 5 == 0 ) {
				continue;
			}
			
			// 여기서 break와 continue 순서를 바꾸면 40이 5의 배수이므로 
			// 생략되어 결과값이 바뀜
			
			System.out.println(i);
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void RSPGame() {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[가위 바위 보 게임~!!]");
		System.out.print("몇 판? : ");
		int round = sc.nextInt();
		
		// 승패 기록용 변수
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		for(int i = 1; i <= round; i++ ) { //입력 받은 판 수 만큼 반복
			
			System.out.println("\n" + i + "번째 게임");
			
			System.out.print("가위/바위/보 중 하나를 입력 해주세요 : ");
			
			String input = sc.next();
			
			// Math.random();
			// 난수 생성 -> 0.0이상 1.0미만의 난수 생성
			//
			// 1) 1~3 사이 난수 생성
			// 2) 1이면 가위, 2이면 바위, 3이면 보 지정 (switch)
			
			int random = (int)(Math.random() * 3 + 1);
			// 0.0 <= x < 1.0 (난수를 x라 할때)
			// 0.0 <= x * 3 < 3.0
			// 1.0 <= x * 3 + 1 < 4.0
			// 1 <= (int)(x*3+1) < 4
			// == 1이상 4미만 정수 -> 1, 2, 3
			
			String com = null; 
			//초기화 null이라도 해줘야함 
			// 컴퓨터가 선택한 가위/바위/보를 저장하는 변수
			// null : 아무것도 참조하고 있지 않음.
			
			switch(random) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			}
			
			// 컴퓨터는 [바위]를 선택했습니다.
			
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", com);
			
			//컴퓨터와 플레이어 가위 바위 보 판별
			
			if( input.equals(com) ) {
				System.out.println("비겼습니다.");
				draw++;
				
			} else {
				
				boolean win1 = input.equals("가위") && com.equals("보"); 
				boolean win2 = input.equals("바위") && com.equals("가위"); 
				boolean win3 = input.equals("보") && com.equals("바위"); 
				
				if(win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
				} else {
					System.out.println("졌습니다 ㅜㅜ");
					lose++;
				}
				
			} //외부 if문
			
			
			System.out.printf("현재 기록 : %d승 %d무 %d패\n", win, draw, lose);
			
			
		} //외부 for문
		
		
		
	} //public void
	
	
	
	
	
	
	
	
	
}
