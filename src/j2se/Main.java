package j2se;

import java.util.Scanner;

public class Main {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		//数组：长度固定的统一类型的元素的容器
		//声明数组的时候
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
		//练习一：寻找黄金分割点
		/*1、分子分母不能同时为偶数
		2、分子分母取值范围是[1,20]*/
		/*思路：分子分母可以使用两层循环外层为分母，内层为分子，
		 * 短路与判断分子分母不能同时为偶数，符合条件continue
		 * 中间值记录与黄金分割点的差的绝对值和对应的分子分母，逐一比较直至最后*/
		/*int fenzi = 1;//分子初始结果值
		int fenmu = 1;//分母初始结果值
		double delta = 1;//与黄金分割点差的绝对值的初始值
		for(int i=1;i<=20;i++){
			for(int j=1;j<=i;j++){
				if(0==i%2 && 0==j%2){
					continue;
				}else{
					 if(delta>=Math.abs(0.618-((float)j/(float)i))){//不能先运算后转换，(float)(j/i)的结果是0.0
						 delta = Math.abs(0.618-((float)j/(float)i));
						 fenzi = (int)j;
						 fenmu = (int)i;
					 }else{
						 continue;
					 }
				}
			}
		}
		System.out.println("分子："+fenzi+",分母："+fenmu+",结果为："+((float)fenzi/(float)fenmu));
		*/
		//跳出外部循环
		//方法一：使用boolean变量控制
		/*int num = s.nextInt();
		boolean breakout = false;
		for(int i=1;i<=num;i++){
			//System.out.println("i="+i);
			for(int j=1;j<=i;j++){
				if(i+j>5){
					breakout = true;//外部循环跳出的判断标志
					break;//跳出内部循环
				}else{
					System.out.println("j+i="+(j+i));
				}
			}
			if(breakout){
				break;
			}
			
		}*/
		//方法二：使用标签
		/*int num = s.nextInt();
		outloop://外部循环标签
			for(int i=1;i<=num;i++){
				for(int j=1;j<=i;j++){
					if(5<i+j){
						break outloop;//结束内部循环和外部循环
					}else{
						System.out.println("i+j="+(i+j));
					}
				}
			}*/
	}
}
