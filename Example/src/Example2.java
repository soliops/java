import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		/* ���빮��
		 * ����ڰ� �Է��� ���ڿ� ���� �������� �۵��ϸ�,
		 * ������ ����� ����Ͽ� ¦�� ���� Ȧ�� ������ ����Ͻÿ�.
		 * "�����ܿ� ���� ���ڸ� �Է��ϼ���?"��� �޼����� ��µǸ�
		 * �ش� ���ڿ� ���缭 ��� ����� ���ϸ�,
		 * ���� ���� ���� ¦�� ���� Ȧ�� ������ ����Ͻø� �˴ϴ�.
		 * ��, �ش� �ݺ����� for~do while������
		 * �Ѱ����� �����ؼ� �ۼ��Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int user;
		int number=1;
		int total=0;
		System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���?");
		user = sc.nextInt();
			do {
				total+=(user*number);
				number++;
			}while(number<=9);
				if(total%2==0) {
					System.out.printf("�ش� ������ �հ�� %d�̸� ¦���Դϴ�.", total);
				}
				else if(total%2==1) {
					System.out.printf("�ش� ������ �հ�� %d�̸� Ȧ���Դϴ�.", total);
				}
				sc.close();
		
				
	}

}
