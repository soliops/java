import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * {5,10,15,20,25,30,35}
		 */
		int data[] = {5,10,15,20,25,30,35};
		/*
		 * foreach������ ����� ���� index ��ȣ�� �ʿ���� ����� ���
		 * for~do-while�� ����� ���� �ε��� ��ȣ�� �ʿ��� �� ���
		 * 
		 * [0] [1] [2] : �ε��� ��ȣ
		 */
		//�ܼ��� �迭������ �ַ� �����
		for(int f : data) { //inf f�� ���������� data�迭���� �޾Ƽ� ���� ��ŵ�ϴ�.
			if(f%2==0) {
		//		System.out.println(f);
			}
		}
	
		String pay[] = {"������ �Ա�","�ſ�ī��","�޴���","��ǰ��","����"};
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϰ��� �ϴ� ���¸� �������ּ���:");
		String pm = sc.next();
		for(String z : pay) { /*�迭 �����Ͱ� ���� �̹Ƿ� 
		�޴� �������� ���� �������� ����ؾ� �մϴ�.*/
			if(pm.equals(z)) {
				if(z.equals("�޴���")) {
					System.out.println("���� �ý��� �������� �ش� ������ ����Ͻ� �� �����ϴ�.");
				}
				else {System.out.println(pm+"�� ���� ���� �˴ϴ�.");}
			//	System.out.println(pm+"�� ���� ���� �˴ϴ�.");
				
			}
		}
	
		
		/* ���빮��
		 * {"�ܹ���", "����", "ġŲ", "Ŀ��"}
		 * Q. "�ֹ��ϰ��� �ϴ� ������ ������ �ּ���.?"
		 * �ش� ������ �� 4���� ����� �˴ϴ�.
		 * ��, "�ֹ�����"��� ����ڰ� �Է½� �� ��� �ֹ��� ���� �Ǹ�,
		 * �ֹ������� ����Ͻø� �˴ϴ�. 
		 */
		
		String food[] = {"�ܹ���","����","ġŲ","Ŀ��"};
		Scanner sc2 = new Scanner(System.in);
		int c = food.length;
		int f;
		for(f=0;f<c;f++) {
			for(String t : food) {
				System.out.println("�ֹ��ϰ��� �ϴ� ������ ������ �ּ���.?");
				String menu = sc2.next();
				if(menu.equals("�ֹ�����")) {
					System.out.println("�ֹ��� ����Ǿ����ϴ�.");
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
		
		
		
		/* ���빮��
		 * �迭
		 * ����ڰ� ��ٱ��Ͽ� ������ ���� �ϰ� �˴ϴ�.
		 * ��, �ش� �ݾ� ����Ʈ�� ������� ����, ���� ��ü ���� �ݾ׸� 
		 * ��� �ǵ��� �մϴ�.
		 * 1500 22000 13000 14500 113800 45000
		 */
		
		
		
		
	}

}
