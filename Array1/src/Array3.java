import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * {5,10,15,20,25,30,35}
		 */
		int data[] = {5,10,15,20,25,30,35};
		/*
		 * foreach문으로 사용할 때는 index 번호가 필요없이 사용할 경우
		 * for~do-while로 사용할 때는 인덱스 번호가 필요할 때 사용
		 * 
		 * [0] [1] [2] : 인덱스 번호
		 */
		//단순한 배열에서만 주로 사용함
		for(int f : data) { //inf f가 순차적으로 data배열값을 받아서 저장 시킵니다.
			if(f%2==0) {
		//		System.out.println(f);
			}
		}
	
		String pay[] = {"무통장 입금","신용카드","휴대폰","상품권","쿠폰"};
		Scanner sc = new Scanner(System.in);
		System.out.println("결제하고자 하는 형태를 선택해주세요:");
		String pm = sc.next();
		for(String z : pay) { /*배열 데이터가 문자 이므로 
		받는 변수형태 또한 문자형을 사용해야 합니다.*/
			if(pm.equals(z)) {
				if(z.equals("휴대폰")) {
					System.out.println("현재 시스템 점검으로 해당 결제는 사용하실 수 없습니다.");
				}
				else {System.out.println(pm+"로 결제 진행 됩니다.");}
			//	System.out.println(pm+"로 결제 진행 됩니다.");
				
			}
		}
	
		
		/* 응용문제
		 * {"햄버거", "피자", "치킨", "커피"}
		 * Q. "주문하고자 하는 음식을 선택해 주세요.?"
		 * 해당 질문은 총 4번을 물어보게 됩니다.
		 * 단, "주문종료"라고 사용자가 입력시 그 즉시 주문은 종료 되며,
		 * 주문내역을 출력하시면 됩니다. 
		 */
		
		String food[] = {"햄버거","피자","치킨","커피"};
		Scanner sc2 = new Scanner(System.in);
		int c = food.length;
		int f;
		for(f=0;f<c;f++) {
			for(String t : food) {
				System.out.println("주문하고자 하는 음식을 선택해 주세요.?");
				String menu = sc2.next();
				if(menu.equals("주문종료")) {
					System.out.println("주문이 종료되었습니다.");
					break;
			}
				System.out.println(t);
			
		}
		}

		/*
		for(String t : food) {
			}}
			System.out.println(t);
		}
		*/
		sc2.close();
	}

}
