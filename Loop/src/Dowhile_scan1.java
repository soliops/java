import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/* ���빮��
		 * ����ڰ� �� 3���� ���ڸ� �Է��մϴ�.
		 * 3�� ���ڸ� ��� ���Ͽ� �� �հ� ���� ����Ͻÿ�.
		 * 123456789 *123456789 *123456789
		 */
		Scanner sc = new Scanner(System.in);
		int user;
		int number=1;
		long total=1;  //long�� �Է½� ����������� -���� �߻���
		do {
			System.out.println(number+"��° ���Ͻ� ���ڸ� �Է��ϼ���.");
			user = sc.nextInt();
			total*=user;
			number++;
		} while (number<4);
		System.out.println("��� ���� �� �հ�: "+total);
		sc.close();
		
	}
}