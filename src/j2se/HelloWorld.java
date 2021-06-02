package j2se;

import java.util.Scanner;

public class HelloWorld {
	private static Scanner s;

	public static void main(String[] args){
		s = new Scanner(System.in);
		
		
		//break练习-百万富翁
		/*第一年投入的钱最终多少钱a(n)
		第二年投入的钱最终多少钱
				.
				.
				.
		最后一年投入的钱最终多少钱
		最后把这些钱加起来
		for(n=1;true;n++){
		total = total+a(n)}*/
		/*int total = 0;
		int firstmoney = 0;
		for(int i=1;true;i++){
			firstmoney = (int)(12000*Math.pow(1.2,i));
			//pow可以通过for循环实现
			//for(i=1;i<=10;i++){
			//	res *= 1.2; 
			//}
			total +=  firstmoney;
			if (total>=1000000){
				System.out.println(i);
				break;
			}
		}*/
		
		//遇偶数中断程序
		/*int num = s.nextInt();
		for(int i=1;i<=num;i++){
			if(0==i%2){
				break;
			}
			System.out.println(i);
		}*/
		//continue练习，忽略3或者5的倍数
		/*int num = s.nextInt();
		for(int i=1;i<=num;i++){
			if(0==i%3||0==i%5){
				continue;
			}else{
				System.out.println(i);
			}
		}*/
		//输出奇数
		/*int num = s.nextInt();
		for(int i=1;i<=num;i++){
			if(0==i%2){
				continue;
			}else{
				System.out.println(i);
			}
		}*/
		//pow实现
		/*System.out.println("底：");
		int res = 1;
		int num = s.nextInt();
		System.out.println("指数:");
		int exp = s.nextInt();
		for(int i=1;i<=exp;i++){
			if(i==1){
				res = num;
			}else{
				res *= num;
			}
		}
		System.out.println(res);*/
		//for练习题，计算等比数列的和
		/*int day = s.nextInt();
		int res = 0;
		for(int i=1;i<=day;i++){
			res = res+(int)Math.pow(2,i-1);
		}
		System.out.println(res);*/
		/*while练习题，N的阶乘 
		System.out.println("input number to calculate:");
		int num = s.nextInt();
		int res = 1;
		while(num>0){
			res = res*num;
			num--;
		}
		System.out.println(res);*/
		
		//swith练习，根据月份判断季节
		/*System.out.println("input month:");
		int month = s.nextInt();
		switch(month){
			case(1):
			case(2):
			case(3):
				System.out.println("Spring");
				break;
			case(4):
			case(5):
			case(6):
				System.out.println("Summer");
				break;
			case(7):
			case(8):
			case(9):
				System.out.println("Autumn");
				break;
			case(10):
			case(11):
			case(12):
				System.out.println("Winter");
				break;
			default:
				System.out.println("What the hell !");
		}*/
		
	}
}
