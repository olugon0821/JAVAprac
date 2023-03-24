import java.util.Scanner;

public class JA2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원화를 입력하세요(단위 원) >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double dollar = num/1291;
		System.out.println(num+"원은 $"+dollar+"입니다");
		sc.close();

	}

}
