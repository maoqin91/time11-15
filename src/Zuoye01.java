import java.util.Scanner;

public class Zuoye01 {  //类的字母大写
	public static void main(String[] args) {
		System.out.println("WEICOME TO THE BANK OF MITCHELL.");
		Scanner in = new Scanner(System.in);    //Scanner类
		System.out.print("ENTER OUR PIN:");

		for(int i = 0; i < 5; i++){
			int a = in.nextInt(); //接收整数类型
			if(a==12345){
				System.out.println("PiN Accepted.You now have access to your account");
				break;
			}else{
				System.out.println("输入错误，请重新输入:");
				System.out.print("Enter Our PiN:");
			  }
		  }
		in.close();//关闭
	}
}
