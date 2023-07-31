package edu.kh.control.practice;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LoopPractice {
	
	
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input<1) { 
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else {
			for(int i=1; i<=input; i++ ) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n-----구분선-----\n");
				
	}
	
	
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else {
			for(int i=input; i>=1; i--) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n-----구분선-----\n");
		
	}
	
	
	
	
	public void practice3() {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=input; i++) {
			sum = sum + i;
			
			if(i<input) {
				System.out.print(i + " + ");
			
			}else {
				System.out.print(i + " = ");
			}
			
		}
		System.out.println(sum);
			
		
		System.out.println("\n-----구분선-----\n");
		
	}
	
	
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();

		if (input1 < 1 || input2 < 1) {
			System.out.println("1 이상의 숫자를 입력해 주세요");
		} else {
			
			if(input1 < input2) {
				for (int i = input1; i<= input2; i++) {
					System.out.print(i+" ");
				}
				
			} else if(input2 < input1) {
				for (int i = input2; i<= input1; i++) {
					System.out.print(i+" ");
				}
			} else { 
				System.out.print(input1);
			}

		} // if

		System.out.println("\n-----구분선-----\n");
		
	} // public void
	
	
	
	
	
	
//	아래로 하면 왜 에러가 뜰까요?
//	
//	public void practice4() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫 번째 숫자 : ");
//		int input1 = sc.nextInt();
//		System.out.print("두 번째 숫자 : ");
//		int input2 = sc.nextInt();
//		
//		if (input1 < 1 || input2 < 1) {
//			System.out.println("1 이상의 숫자를 입력해 주세요");
//		} else {
//			
//			if(input1 < input2) {
//				for (input1; input1<= input2; input1++) {
//					System.out.print(input1+" ");
//				}
//				
//			} else if(input2 < input1) {
//				for (input2; input2<= input1; input2++) {
//					System.out.print(input2+" ");
//				}
//			} else { 
//				System.out.print(input1);
//			}
//								
//		} // if
//		
//		System.out.println("\n-----구분선-----\n");
//		
//	} // public void
	
	
	
	
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		System.out.println("===== " + input+ "단 =====");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", input, i, input * i);
		}
		
		
		System.out.println("\n-----구분선-----\n");
	}
	
	
	
	
	
	
	
//	public void practice6() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자 : ");
//		int num = sc.nextInt();
//		
//		if ( !(2<=num && num<=9) ) {
//			
//			System.out.println("2~9 사이 숫자만 입력해주세요");
//			
//		} else {
//			
//			for (int i =num; i<=9; i++) {
//				System.out.println("===== " + i + "단 =====");
//						
//				
//			} //외부for
//			
//					
//			
//		} //else
//	
//	
//	System.out.println("\n-----구분선-----\n");
//	
//} //public void
//
//
//	
//아래로 수정
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if( !(2<=input && input<=9) ) {
			System.out.println("2~9사이 숫자만 입력해주세요");			
		} else {
			for(int i = input; i<=9; i++) {
				System.out.print("===== " + i + "단 =====\n");
				for (int j = 1; j<=9; j++) {
					System.out.println(i + " x " + j + " = " + i*j);
				}
			}
		}
		
	}
		
	

	
	
	
	
    
    
    
	
	
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		
		int input;
		System.out.print("정수 입력 : ");
		input = sc.nextInt();
		
		for(int x=1; x<=input; x++) {
			
			for(int i=1; i<=x; i++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		} //외부for
		
	
		
		System.out.println("\n-----구분선-----\n");
	} //public void	
	
	
	
	
	
	
    
    
	
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("정수 입력 : ");
		input = sc.nextInt();
		
		for (int x=input; x>=1; x--) {
			
			for(int i = x; i>=1; i--) {
				
				System.out.print("*");
				
			}

		
		System.out.println();
		
			
		} //외부for
		
	
		
		System.out.println("\n-----구분선-----\n");
	} //public void	
	
	
	
	
	
	
	
	
	
	
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("정수 입력 : ");
		input = sc.nextInt();

			
		for (int i=1; i<=input; i++) {
			
			for (int j=(input-i); j>0; j--) {
				
				System.out.print(" ");
				 
			} //내부for1

			
			
			for (int k=1; k<=i; k++) {
				
				System.out.print("*");
							
				
			} //내부for2
			
			System.out.println();
			
		} //외부for
		
	
		
		System.out.println("\n-----구분선-----\n");
	} //public void	
	
	
	
	
	
	
	
	
	
	
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("정수 입력 : ");
		input = sc.nextInt();
		
		for (int i=1; i<=input; i++) {
			
			for (int j=1; j<=i; j++) {		
				
				System.out.print("*");
							
			} //내부for1
			
			System.out.println();
			
		} //외부for1	
		
		for (int k=(input-1); k>=1; k--) {
			
			for (int l=k; l>=1; l--) {		
				
				System.out.print("*");
							
			} //내부for2
			
			System.out.println();
			
		} //외부for2
		
		
		
		System.out.println("\n-----구분선-----\n");
	} //public void		
	
	
	
	
	
	
	
	
	
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("정수 입력 : ");
		input = sc.nextInt();
		
		for(int i = 1; i<=input; i++) {
				
			
			for(int k = input-i; k >= 1; k-- ) {
				
				System.out.print(" ");

				
			} //내부for1
			
			
			
			for(int j = 1; j <= (2*i-1); j++ ) {
				
				System.out.print("*");

				
			} //내부for2
			
			System.out.println();
		
		} //외부for
		
		
		
		
		System.out.println("\n-----구분선-----\n");
	} //public void	
	

	

	
	
	
	
	
	
	
	public void practice12() {
		
//		Scanner sc = new Scanner(System.in);
//		
//		int input;
//		System.out.print("정수 입력 : ");
//		input = sc.nextInt();
//		
//		for(int i = 1; i<=input; i++) {
//			
//			System.out.print("*");
//			
//		} //외부for1
//		System.out.println();
//		
//		
//		
//		
//		
//		for(int k = 1; k<=(input-2); k++) {
//			
//			System.out.println("*   *");
//				
//				
//				
//		
//			
//		} //외부for2
//				
//		
//		
//		
//		
//		for(int j = 1; j<=input; j++) {
//			
//			System.out.print("*");
//			
//		} //외부for3
//		System.out.println();

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1 ; row <= input ; row++) {
			
			for(int col = 1 ; col <= input ; col++) {
				

				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();	
		}	
		
		
		System.out.println("\n-----구분선-----\n");
	} //public void	
	
	
	
	
	
	
	
    
    
	
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i<=input; i++) { 
			
			
			if(i%2==0 || i%3==0) { 
				
				System.out.print(i + " ");
				
				if(i%2==0 && i%3==0) {
					
					count++;
				}
			}
			
				
		} //외부for
		
		System.out.println();
		System.out.println("count : " + count);
		
	
		
		System.out.println("\n-----구분선-----\n");
	} //public void	
	
	
	
	
	
}
