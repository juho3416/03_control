package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExampleAnswer {

	public void ex1() {
		
		// if문
		// 조건식이 true 일때만 내부 코드 수행
		
		/*
		 *  [작성법]
		 *  if(조건식) {
		 *  	조건식이 true일 때 수행할 코드
		 *  }
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 입력된 정수가 양수인지 검사
		if(input > 0) {
			System.out.println("양수 입니다.");
		}
		
		if(input <= 0) {
			System.out.println("양수가 아닙니다.");
		}

	}
	
	
	public void ex2() {
		
		// if - else문
		// 조건식 결과가 true면 if문, 
		// false면 else 구문이 수행됨.
		
		/*
		 * if (조건식) {
		 *		조건식이 true일 때 수행될 코드
		 * } else {
		 * 		조건식이 false일 때 수행될 코드
		 * }
		 * 
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
				
		// 홀짝 검사
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if( input % 2 != 0) {
			System.out.println("홀수 입니다.");
			
		} else { //짝수 또는 0 입력 시 수행
			
			//중첩 if문
			if( input==0 ) {
				System.out.println("0 입니다.");					
			} else {
				System.out.println("짝수 입니다.");
			}
			
		}
		
	}
	
	
	
	public void ex3() {
		
		//양수, 음수, 0 판별
		
		// if - else if - else
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) { // input이 양수일 경우
			System.out.println("양수 입니다.");
					
		} else if(input < 0) { //input이 음수일 경우
			// 바로 위에 있는 if문이 만족되지 않은 경우 수행
			System.out.println("음수 입니다.");
		} else {
			System.out.println("0 입니다.");
			
		}
		
	}

	
	
	public void ex4() {
		
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 단, 겨울일때 온도가 -15이하 "한파 경보", -12이하 "한파 주의보"
		// 여름에는 온도가 35도 이상 "폭염 경보", 33도 이상 "폭염 주의보"
		// 1~12 사이가 아닐땐 "해당하는 계절이 없습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		System.out.print("섭씨온도 입력 : ");
		int temperature = sc.nextInt();
		
		String season; // 아래 조건문 수행 결과를 저장할 변수 선언
		
		if(month == 1 || month ==2 || month ==12) {
			season = "겨울";
			
			if(temperature <= -15) {
				//season = "겨울 한파 경보"; 
				//또는 
				season += " 한파 경보";
				// season = season + "한파 경보"
			} else if ( temperature <=-12)
				season += " 한파 주의보";
				// else 가 아닌 이유는 
				// -15도 초과인 것이 한파 주의보가 되기 때문.
				// 또한, <=-12부터 하고 <=-15하면 안됨. 
				// 위에서 아래로 순서대로 되기 때문에
				// -12부터 하면 -15도인 경우에도 한파 주의보가 나옴.
				// 무엇을 먼저하는지가 중요.
			
			
		} else if ( month >= 3 && month <= 5) {
			season = "봄";
		} else if ( month >= 6 && month <= 8) {
			season = "여름";
			
			if(temperature >= 35) {
				season += " 폭염 경보";
			} else if(temperature >= 33 ) {
				season += " 폭염 주의보";
			}
			
			
		} else if ( month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다.";
		}
		
		System.out.println(season);

	
	}
	
	
	
	
	
	public void ex5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result5 = null;
		
		if(age <= 13) {
			System.out.println("어린이 입니다.");
		} else if(age>19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("청소년입니다.");
		}
		
		System.out.println(result5);
	}
	
	
	
	
	public void ex6() {  //번호옆에 (-)버튼 클릭하면 접었다 폈다 가능
		
		Scanner sc = new Scanner(System.in); 
		// 메소드 내가 아닌 클래스 레벨 내에(처음) 1번만 적으면
		// 메소드에서 계속 안적어도 된다.
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
			
		String result6 = null;
		
		if ( score < 0 || score > 100) {
			result6 = "잘못 입력하셨습니다!";
			
		} else if (score >= 90) {
			result6 = "A";
					
		} else if (score >= 80) {
			result6 = "B";
					
		} else if (score >= 70) {
			result6 = "C";
					
		} else if (score >= 60) {
			result6 = "D";
					
		} else {
			result6 = "F";
		}
		
		
		System.out.println(result6);
		
	}

	
	
	
	public void ex7() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");		
		int age = sc.nextInt();
		
//		System.out.print("키 : ");
//		double height = sc.nextDouble();
//		이때 받으면 나이를 받고 키도 받는데, 적절하지 않음.
//		나이 잘못 입력한 경우에는 키를 입력 하는 경우 없어야 함.
		
		String result7 = null; 
		
		if(age < 0 || age > 100) {
			result7 = "잘못 입력하셨습니다!";
		} else { 
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			if(age < 12) {
				result7 = "적절 연령이 아닙니다";
			} else if (height < 140.0) {
				result7 = "적정 키가 아닙니다";
			} else {
				result7 = "탑승 가능";
			}
		}
		
		System.out.println(result7);	
		
	}		

	
	
	
	
	public void ex8() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
				
		String result8 = null;
		
		if ( age < 0 || age > 100) {
			result8 = "나이를 잘못 입력하셨습니다.";
			
		} else {
			
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			if(height < 0 || height > 250) {
				result8 = "키를 잘못 입력하셨습니다.";
				
			} else {
				
				if(age < 12 && height >= 140.0) { // 나이X, 키O
					result8 = "키는 적절하나, 나이가 적절치 않음";
					
				} else if( age >= 12 && height < 140.0) { // 나이O, 키X
					result8 = "나이는 적절하나, 키가 적절치 않음";
				} else if ( age <12 && height < 140.0) { 
					result8 = "나이와 키 모두 적절치 않음";
				} else {
					result8 = "탑승 가능";
				}
			}
					
		}
		
		System.out.println(result8);
		
	}	
		
		
		
//		if(age<0 || age>100) {result8 = "나이를 잘못 입력 하셨습니다.";}
//		if(height<0 || height>250.0) {result8 = "키를 잘못 입력 하셨습니다.";}
//		
//		if ((0<= age && age <=100) && (0<= height && height <=250.0)) {
//			if (age>=12) {
//				if (height<140.0) {result8 = "나이는 적절하나, 키가 적절치 않음";}
//				if (height>=180.0) {result8 = "탑승 가능";}
//			}
//			if (age<12) {
//				if (height>=180.0) {result8 = "키는 적절하나, 나이는 적절치 않음";}
//				if (height<140.0) {result8 = "나이와 키 모두 적절치 않음";}
//			}
//					
//		}
//				
//		System.out.println(result8);
//				
//	}
		
	
	
	
}
