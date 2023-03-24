import java.util.Scanner;

public class JA2_2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99) : ");
		int num = sc.nextInt();
		if (num/10 == num%10) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		}else {
			System.out.println("NO! 10의 자리와 1의 자리가 같지 않습니다");
		}
		sc.close();
	}

}
