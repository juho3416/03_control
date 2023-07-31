package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1() {
		
		int num1;
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		num1 = sc.nextInt();
		
		String result1=null;
		
		if(num1>0) {
		
			switch(num1%2) {
			
			case 0 : result1 = "짝수입니다"; break;
			case 1 : result1 = "홀수입니다"; break;
			}
						
		} else {
			result1 = "양수만 입력해주세요.";
		}
			
		System.out.println(result1);
			
	}
	
	
	
	
	public void practice2() {
		
		int input1;
		int input2;
		int input3;
		
		System.out.print("국어 점수 : ");
		input1 = sc.nextInt();
		System.out.print("영어 점수 : ");
		input2 = sc.nextInt();		
		System.out.print("수학 점수 : ");
		input3 = sc.nextInt();		
		
		String result2 = null;
		int sum = (input1 + input2 + input3);
		double average= (double)(input1 + input2 + input3)/3;
		
		if (input1 >= 40 && input2 >=40 && input3 >=40 && average>=60) {
			result2 = "축하합니다, 합격입니다!"; 
			System.out.printf("국어 : %d\n", input1);
			System.out.printf("수학 : %d\n", input2);		
			System.out.printf("영어 : %d\n", input3);			
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %.1f\n", average);
			System.out.println(result2);
			
		} else {
			result2 = "불합격입니다.";
			System.out.println(result2);
		}
		
		
		
	}
	
	
	

	public void practice3() {	
		
		int month;
		System.out.print("달 입력하시면 달의 일수 출력(2월 윤달은 계산하지 않습니다) : ");
		month = sc.nextInt();
		
		String result3 = null;
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : result3="월은 31일까지 있습니다."; break;
		
		case 4 : case 6 : case 11 : result3="월은 30일까지 있습니다.";	break;
		
		case 2 : result3 = "월은 28일까지 있습니다."; break;
		
		default : result3 = "월은 잘못 입력된 달입니다.";
		}
		
		System.out.println (month + result3);
		
	}
	
	
	
	
	
	
	public void practice4() {
		
		double height;
		double weight;
		
		System.out.print("키(m)를 입력해 주세요 : ");
		height = sc.nextDouble();
				
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		weight = sc.nextDouble();
		
		String result4 = null;
		double bmi = weight / (height * height);
		
		
		if(bmi<18.5) {
			result4 = "저체중";
		} else if(18.5<=bmi && bmi<23.0) {
			result4 = "정상체중";
		} else if(23.0<=bmi && bmi<25.0) {
			result4 = "과체중";
		} else if(25.0<=bmi && bmi<30.0) {
			result4 = "비만";
		} else { result4 = "고도 비만"; 
		
		}
		
		System.out.printf("BMI 지수 : %.14f\n", bmi);
		System.out.println(result4);		
				
	}
	
	
	
	
	public void practice5() {
		
		double mExam;
		double fExam;
		double assignments;
		double attendance;
		
		
		System.out.print("중간 고사 점수(20) : ");
		mExam = sc.nextDouble();
		
		System.out.print("기말 고사 점수(30) : ");
		fExam = sc.nextDouble();
		
		System.out.print("과제 점수(30) : ");
		assignments = sc.nextDouble();
		
		System.out.print("출석 점수(20) : ");
		attendance = sc.nextDouble();
		
		double mExamR = 0.2 * mExam;
		double fExamR = 0.3 * fExam;
		double assignmentsR = 0.3 * assignments;
		double attendanceR = attendance;
		double attendanceP = (attendance / 20) * 100;
		
		double sumR = mExamR+fExamR+assignmentsR+attendanceR;
		
		String result5 = null;
		
//			총점 70 이상일떄 : 
//			(비출석률 30 이상일때 =) 출석률 70초과일때
//			==> 합격
//
//			이상일때 : 
//			이하일때 : 
//			==> 출석 횟수 부족
//
//			미만일때 : 
//			초과일때 :  
//			==> 점수 미달
//
//			미만일때 :
//			이하일때 : 
//			==> 출석 횟수 부족

		if (sumR >=70 && attendanceP >70) {
			result5 = "PASS" ;
			System.out.println("================= 결과 =================");
			System.out.printf("중간 고사 점수(20) : %.1f\n",mExamR); 	
			System.out.printf("기말 고사 점수(30) : %.1f\n",fExamR);
			System.out.printf("과제 점수(30) : %.1f\n",assignmentsR); 
			System.out.printf("출석 점수(20) : %.1f\n",attendanceR); 
			System.out.printf("총점 : %.1f\n",sumR);
			System.out.println(result5);
			
		} else if (sumR < 70 && attendanceP >=70) {
			result5 = "Fail [점수 미달]" ;
			System.out.println("================= 결과 =================");
			System.out.printf("중간 고사 점수(20) : %.1f\n",mExamR); 	
			System.out.printf("기말 고사 점수(30) : %.1f\n",fExamR);
			System.out.printf("과제 점수(30) : %.1f\n",assignmentsR); 
			System.out.printf("출석 점수(20) : %.1f\n",attendanceR); 
			System.out.printf("총점 : %.1f\n",sumR);
			System.out.println(result5);
			
		} else {
			result5 = "Fail [출석 횟수 부족 (" + (int)attendance + "/20)]";
			System.out.println(result5);
		
		}

		
		
	}
		
	
}
