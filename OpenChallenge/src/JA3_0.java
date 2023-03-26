import java.util.Scanner;
import java.util.Random;

public class JA3_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r= new Random();
		Scanner sc = new Scanner(System.in);
		int ran;
		
		while (true) {
			int min = 0;
			int max = 99;
			int num = r.nextInt(100);
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			for(int i=1;; i++) {
				System.out.println(min+"-"+max);
				System.out.println(i+">>");
				ran = sc.nextInt();
				if (num>ran) {
					System.out.println("더 높게");
					min = ran;
				} else if(num<ran) {
					System.out.println("더 낮게");
					max = ran;
				} else {
					System.out.println("맞았습니다\n다시 하시겠습니까? (y/n)");
					if(sc.next().equals("y")) {
						break;
					}
					else {
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
					}
					sc.close();
				}
			}
		}

	}

}
