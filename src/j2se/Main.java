package j2se;

import java.util.Scanner;

public class Main {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		//���飺���ȹ̶���ͳһ���͵�Ԫ�ص�����
		//���������ʱ��
		/*int[] a ;
		a = new int[5];
		for(int i=0;i<5;i++){
			a[i] = (int)(Math.random()*100);
			System.out.println(a[i]);
		}
		int min = a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]<=min){
				min = a[i];
			}
		}
		System.out.println(min);*/
		//��ϰһ��Ѱ�һƽ�ָ��
		/*1�����ӷ�ĸ����ͬʱΪż��
		2�����ӷ�ĸȡֵ��Χ��[1,20]*/
		/*˼·�����ӷ�ĸ����ʹ������ѭ�����Ϊ��ĸ���ڲ�Ϊ���ӣ�
		 * ��·���жϷ��ӷ�ĸ����ͬʱΪż������������continue
		 * �м�ֵ��¼��ƽ�ָ��Ĳ�ľ���ֵ�Ͷ�Ӧ�ķ��ӷ�ĸ����һ�Ƚ�ֱ�����*/
		/*int fenzi = 1;//���ӳ�ʼ���ֵ
		int fenmu = 1;//��ĸ��ʼ���ֵ
		double delta = 1;//��ƽ�ָ���ľ���ֵ�ĳ�ʼֵ
		for(int i=1;i<=20;i++){
			for(int j=1;j<=i;j++){
				if(0==i%2 && 0==j%2){
					continue;
				}else{
					 if(delta>=Math.abs(0.618-((float)j/(float)i))){//�����������ת����(float)(j/i)�Ľ����0.0
						 delta = Math.abs(0.618-((float)j/(float)i));
						 fenzi = (int)j;
						 fenmu = (int)i;
					 }else{
						 continue;
					 }
				}
			}
		}
		System.out.println("���ӣ�"+fenzi+",��ĸ��"+fenmu+",���Ϊ��"+((float)fenzi/(float)fenmu));
		*/
		//�����ⲿѭ��
		//����һ��ʹ��boolean��������
		/*int num = s.nextInt();
		boolean breakout = false;
		for(int i=1;i<=num;i++){
			//System.out.println("i="+i);
			for(int j=1;j<=i;j++){
				if(i+j>5){
					breakout = true;//�ⲿѭ���������жϱ�־
					break;//�����ڲ�ѭ��
				}else{
					System.out.println("j+i="+(j+i));
				}
			}
			if(breakout){
				break;
			}
			
		}*/
		//��������ʹ�ñ�ǩ
		/*int num = s.nextInt();
		outloop://�ⲿѭ����ǩ
			for(int i=1;i<=num;i++){
				for(int j=1;j<=i;j++){
					if(5<i+j){
						break outloop;//�����ڲ�ѭ�����ⲿѭ��
					}else{
						System.out.println("i+j="+(i+j));
					}
				}
			}*/
	}
}
