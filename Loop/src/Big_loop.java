import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		/*1~100������ ��ü ���� ����ϴ� for���� �����Ͻÿ�
		 */
		/*int a;
		int total=0;
		for(a=1;a<=100; a++) {
			total+=a;
		}
		System.out.println(total);
		*/
		/* 1~100���� ���� �������?	*/
		
		int f;
		//BigInteger : java���� ��� ������ ���� ������ �� �ִ� ������ �ڷ��� �Դϴ�.
		BigInteger aa = new BigInteger("1"); 
		//�հ迡 ����� �ڷ��� ���� 1�� ���ʰ����� ���� ��, ""�� ������ �����ؾ� �մϴ�.
		for(f=1;f<=100;f++) {
			/* multiply : ��Ģ���� ���ϱ⸦ �����.
			 * add 		: ��Ģ���� ���ϱ⸦ �����.
			 * subtract : ��Ģ���� ���⸦ �����.
			 * divide 	: ��Ģ���� �����⸦ �����.
			*/
			aa=aa.multiply(BigInteger.valueOf(f));
		}
		System.out.println(aa);
		
	}

}