package hw;
import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�@�����n");
		int n=scn.nextInt();
		int i;
		int j;
		for(i=n;i>0;i--){
			for(j=n;j>0;j--){
				System.out.print("*");
			}
					System.out.println();
		}


	}

}
