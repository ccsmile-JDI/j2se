package j2se;

import java.util.Scanner;

public class HelloWorld {
	private static Scanner s;

	public static void main(String[] args){
		s = new Scanner(System.in);
		
		
		//break��ϰ-������
		/*��һ��Ͷ���Ǯ���ն���Ǯa(n)
		�ڶ���Ͷ���Ǯ���ն���Ǯ
				.
				.
				.
		���һ��Ͷ���Ǯ���ն���Ǯ
		������ЩǮ������
		for(n=1;true;n++){
		total = total+a(n)}*/
		/*int total = 0;
		int firstmoney = 0;
		for(int i=1;true;i++){
			firstmoney = (int)(12000*Math.pow(1.2,i));
			//pow����ͨ��forѭ��ʵ��
			//for(i=1;i<=10;i++){
			//	res *= 1.2; 
			//}
			total +=  firstmoney;
			if (total>=1000000){
				System.out.println(i);
				break;
			}
		}*/
		
		//��ż���жϳ���
		/*int num = s.nextInt();
		for(int i=1;i<=num;i++){
			if(0==i%2){
				break;
			}
			System.out.println(i);
		}*/
		//continue��ϰ������3����5�ı���
		/*int num = s.nextInt();
		for(int i=1;i<=num;i++){
			if(0==i%3||0==i%5){
				continue;
			}else{
				System.out.println(i);
			}
		}*/
		//�������
		/*int num = s.nextInt();
		for(int i=1;i<=num;i++){
			if(0==i%2){
				continue;
			}else{
				System.out.println(i);
			}
		}*/
		//powʵ��
		/*System.out.println("�ף�");
		int res = 1;
		int num = s.nextInt();
		System.out.println("ָ��:");
		int exp = s.nextInt();
		for(int i=1;i<=exp;i++){
			if(i==1){
				res = num;
			}else{
				res *= num;
			}
		}
		System.out.println(res);*/
		//for��ϰ�⣬����ȱ����еĺ�
		/*int day = s.nextInt();
		int res = 0;
		for(int i=1;i<=day;i++){
			res = res+(int)Math.pow(2,i-1);
		}
		System.out.println(res);*/
		/*while��ϰ�⣬N�Ľ׳� 
		System.out.println("input number to calculate:");
		int num = s.nextInt();
		int res = 1;
		while(num>0){
			res = res*num;
			num--;
		}
		System.out.println(res);*/
		
		//swith��ϰ�������·��жϼ���
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
