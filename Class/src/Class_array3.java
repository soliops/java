import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * ���� ���� �迭 ������ ���� �ֽ��ϴ�.
		 * a1: ȫ�浿 �̼��� ������ ������ ������
		 * a2: 100 80 39 60 55
		 * 
		 * "�˻��ϰ��� �ϴ� �̸��� �����ּ���." ����ϰ� �˴ϴ�.
		 * �˻�� �̼����̶�� �˻��� �ϰ� �Ǹ�
		 * �̼��Ŵ��� 80�� �Դϴ�. ��� ����� �Ǿ�� �մϴ�.
		 * 
		 */
		
		
		String a1[]= {"ȫ�浿","�̼���","������","������","������"};
		String a2[]={"100","80","39","60","55"};
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���.");
		String usernm = sc.next();
		
		jumsu j = new jumsu();
		j.ck(a1,a2,usernm);  // ->3�� class�� ������ �Ȱ��� 3�� �޾ƾ��Ѵ�.

		sc.close();
		}
	}

class jumsu {
	public void ck(String data1[],String data2[], String user) {
		//System.out.println(Arrays.toString(data2));
		
		}
	}