
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
			msg="정답입니다.";
			System.out.println(msg+" PC 숫자는 "+this.number+"였습니다.");
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
