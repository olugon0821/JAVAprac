import java.util.Scanner;

public class oc2 {
	
	public static void main(String args[]) {
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("철수 >> ");
		String user1 = sc.next();
		
		System.out.println("영희 >> ");
		String user2 = sc.next();
		
		if (user1.equals("가위")) {
			if(user2.equals("가위"))
				System.out.println("비겼습니다");
			else if (user2.equals("바위"))
				System.out.println("영희가 이겼습니다");
			else
			System.out.println("철수가 이겼습니다");
			
		}
		if (user1.equals("바위")) {
			if(user2.equals("바위"))
				System.out.println("비겼습니다");
			else if (user2.equals("보"))
				System.out.println("영희가 이겼습니다");
			else
			System.out.println("철수가 이겼습니다");
			
		}
		if (user1.equals("보")) {
			if(user2.equals("보"))
				System.out.println("비겼습니다");
			else if (user2.equals("가위"))
				System.out.println("영희가 이겼습니다");
			else
			System.out.println("철수가 이겼습니다");
			
			sc.close();
			
		}
		
	}

}
