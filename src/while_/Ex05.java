package while_;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		/*
		 1. 아메리카노 2. 라떼 두가지 메뉴가 있는 자판기가 있다. 메뉴를 선택하고 
		 돈을 지불하고 거스름돈까지받는 프로그램을 제작하시오
		 아메리카노 1000원 라떼 1500원
		 */
		Scanner input = new Scanner(System.in);
		int money=0;
		int ame = 1000;
		int rat = 1500;
		int num,num1=0,num2,num3;
		
		while(true) {
			System.out.println("\t메뉴");
			System.out.println("===================");
			System.out.println("1.아메리카노 2.라떼");
			System.out.println("===================");
			System.out.print("메뉴를 입력하세요 : ");
			num = input.nextInt();
			if(num == 1 ) {
				System.out.println("선택하신 메뉴는 아메리카노 입니다.");
				num1 = ame;
			}else if(num == 2) {
				System.out.println("선택하신 메뉴는 라떼 입니다.");
				num1 = rat;
			}else {
				System.out.println("메뉴를 잘못 선택하셨습니다.");continue;
			}
			while(true) {
				System.out.print("잔 수를 입력하세요 : ");
				num2 = input.nextInt();
				if(num2 <= 0) {
					System.out.println("다시 입력해주세요");
				}else {
					break;
				}
			}
			money = num2*num1;
			System.out.println("지불할 금액은 " + money + " 입니다." );
			while(true) {
				System.out.print("금액 입력 : ");
				num3 = input.nextInt();
				if(num3 < money) {
					System.out.println("금액이 부족합니다.");
					continue;
				}else {
					System.out.println("결제 되었습니다.");
					if(num3 - money > 0) {
						System.out.println("거스름돈 " + (num3 - money) + "원입니다.");
					}
					System.out.println("안녕히 가세요~");
					break;
				}
			}
			
			
			
			
		}
		
		
		
	}
}
