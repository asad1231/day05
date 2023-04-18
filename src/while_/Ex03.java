package while_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, sum=0;
		while(true) {
			System.out.println("10 ~ 20 사이의 수 입력");
			num = input.nextInt();
			if(num < 10 || num > 20) {
				System.out.println("잘못 입력...");
				continue;
			}
			break;
		}
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + num + "까지의 합 : " + sum);
		
		boolean bool = true;
		int n = 1;
		while(bool) {//bool == true
			System.out.println("bool 종속문장 실행");
			n++;
			if(n == 2) {
				//bool = false;
				break;
			}
			System.out.println("while 종료");
		}
	}
}
