import java.util.Scanner;

public class zuoye01 {
	public static void main(String[] args) {
		System.out.println("weicome to the bank of mitchell.");
		Scanner in = new Scanner(System.in);    //Scanner类
		  System.out.println("Enter Our PiN:");
		  float a = in.nextFloat();    //接收float数据
		  for(a=0;a<5;a++){
			  if(a==12345){
				  System.out.println("PiN Accepted.You now have access to your account");
			  }else{
				  System.out.println("Enter Our PiN:");
			  }
		  }

	}
}
