package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入一正整數n");
		int n=scn.nextInt();
		int i=1;
		int a=0;
		for(i=1;i<=n;i++){
		int c=(int) (Math.pow(2,i));
		a=a+c;
		}
		System.out.println(a);

	}

}
