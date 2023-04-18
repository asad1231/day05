package for_;

public class Ex03 {
	public static void main(String[] args) {
		int n1, n2;
		for(n1 = 1; n1 < 5; n1++) {
			for(n2 = 1; n2 < 5; n2++) {
				System.out.println("n1 : " + n1 + ", n2 : " + n2);
			}
		}
		for(n1 = 2; n1 < 10; n1++) {
			for(n2 = 1; n2 < 10; n2++) {
				System.out.println(n1 + " * " + n2 + " = " + n1*n2);
			}
		}
	}
}
