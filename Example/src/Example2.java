
public class Example2 {
private int number;
private int user;
private String msg;
	public static void main(String[] args) {
		
		Example1.main(args);
		
	
	
	}
	public void result(int pc_num,int user_num) {
		this.number = pc_num;
		this.user = user_num;
		if(this.number==this.user) {
			msg="�����Դϴ�.";
			System.out.println(msg+" PC ���ڴ� "+this.number+"�����ϴ�.");
			System.exit(0);
			System.gc();
		}else if(this.number>this.user) {
			msg="UP";
			System.out.println(msg);
		}else if(this.number<this.user) {
			msg="DOWN";
			System.out.println(msg);
		}
	}
}
