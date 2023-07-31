package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPracticeAnswers {

	
	Scanner sc = new Scanner(System.in);
	
	
//강사님 풀이	

	public void practice3() {	
		
		int month;
		System.out.print("달 입력하시면 달의 일수 출력(2월 윤달은 계산하지 않습니다) : ");
		month = sc.nextInt();
		
	
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			System.out.println(month + "월은 31일까지 있습니다");
			break;
		
		case 4 : case 6 : case 11 :
			System.out.println(month + "월은 31일까지 있습니다");
			break;
		case 2 : 
			System.out.println(month + "월은 28일까지 있습니다");
			break;
		
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
		
	}
	
	
	
	
	
	
	public void practice4() {
		
		double height;
		double weight;
		
		System.out.print("키(m)를 입력해 주세요 : ");
		height = sc.nextDouble();
				
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		weight = sc.nextDouble();
		
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		
		String result4 = null;
		
		if(bmi < 18.5) {
			result4 = "저체중";
		} else if(bmi < 23.0) {
			result4 = "정상체중";
		} else if(bmi < 25.0) {
			result4 = "과체중";
		} else if(bmi < 30.0) {
			result4 = "비만";
		} else { 
			result4 = "고도 비만"; 
				}
		
		System.out.println(result4);		
				
	}
	
	
	


	public void practice5() {
		
		
		
		System.out.print("중간 고사 점수 : ");
		double midTerm = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		double finalTerm = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		double report = sc.nextInt();	
		
		System.out.print("출석 : ");
		double attendance = sc.nextInt();
		
		
		//각각의 점수를 비율에 맞게 변경
		midTerm *= 0.2; //  midTerm = mdTerm * 0.2
		finalTerm *= 0.3;
		report *= 0.3;
		// attendance *= 1 //생략가능
		
		System.out.println("================= 결과 =================");
		
		if(attendance <= 20 * (1 - 0.3)) { // 14번 이하 출석 했을 경우
			System.out.println("Fail [출석 횟수 부족] (" + (int) + attendance + "/20)");
		
		} else { //출석 만족 시
			System.out.printf("중간 고사 점수(20) : %.1f\n",midTerm); 	
			System.out.printf("기말 고사 점수(30) : %.1f\n",finalTerm);
			System.out.printf("과제 점수(30) : %.1f\n",report); 
			System.out.printf("출석 점수(20) : %.1f\n",attendance); 
			
			double sum = midTerm + finalTerm + report + attendance;
			
			System.out.printf("총점 : %.1f\n",sum);
			
			if( sum >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		
		}
		
		
// 내가 푼 것
//
//		double mExam;
//		double fExam;
//		double assignments;
//		double attendance;
//		
//		
//		System.out.print("중간 고사 점수(20) : ");
//		mExam = sc.nextDouble();
//		
//		System.out.print("기말 고사 점수(30) : ");
//		fExam = sc.nextDouble();
//		
//		System.out.print("과제 점수(30) : ");
//		assignments = sc.nextDouble();
//		
//		System.out.print("출석 점수(20) : ");
//		attendance = sc.nextDouble();
//		
//		double mExamR = 0.2 * mExam;
//		double fExamR = 0.3 * fExam;
//		double assignmentsR = 0.3 * assignments;
//		double attendanceR = attendance;
//		double attendanceP = (attendance / 20) * 100;
//		
//		double sumR = mExamR+fExamR+assignmentsR+attendanceR;
//		
//		String result5 = null;
//		
////			총점 70 이상일떄 : 
////			(비출석률 30 이상일때 =) 출석률 70초과일때
////			==> 합격
////
////			이상일때 : 
////			이하일때 : 
////			==> 출석 횟수 부족
////
////			미만일때 : 
////			초과일때 :  
////			==> 점수 미달
////
////			미만일때 :
////			이하일때 : 
////			==> 출석 횟수 부족
//
//		if (sumR >=70 && attendanceP >70) {
//			result5 = "PASS" ;
//			System.out.println("================= 결과 =================");
//			System.out.printf("중간 고사 점수(20) : %.1f\n",mExamR); 	
//			System.out.printf("기말 고사 점수(30) : %.1f\n",fExamR);
//			System.out.printf("과제 점수(30) : %.1f\n",assignmentsR); 
//			System.out.printf("출석 점수(20) : %.1f\n",attendanceR); 
//			System.out.printf("총점 : %.1f\n",sumR);
//			System.out.println(result5);
//			
//		} else if (sumR < 70 && attendanceP >=70) {
//			result5 = "Fail [점수 미달]" ;
//			System.out.println("================= 결과 =================");
//			System.out.printf("중간 고사 점수(20) : %.1f\n",mExamR); 	
//			System.out.printf("기말 고사 점수(30) : %.1f\n",fExamR);
//			System.out.printf("과제 점수(30) : %.1f\n",assignmentsR); 
//			System.out.printf("출석 점수(20) : %.1f\n",attendanceR); 
//			System.out.printf("총점 : %.1f\n",sumR);
//			System.out.println(result5);
//			
//		} else {
//			result5 = "Fail [출석 횟수 부족 (" + (int)attendance + "/20)]";
//			System.out.println(result5);
//		
//		}

		
		
	}
		
	
}
