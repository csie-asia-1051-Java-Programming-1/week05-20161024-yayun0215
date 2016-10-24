package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入一正整數n");
		int n=scn.nextInt();
		int sum=1;
		int i;
		for(i=1;i<=n;i++){
			sum=sum*i;
			
		}
		System.out.println(sum);

	}

}
