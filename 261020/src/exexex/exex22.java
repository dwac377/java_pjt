package exexex;

import java.util.Scanner;

public class exex22 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int loopCnt3 = sc.nextInt();     // 반복 횟수

	      for (int i = 1; i <= loopCnt3; i++) {
	          for (int j = 0; j < loopCnt3 - i; j++) {
	              System.out.print(" ");
	          }
	          for (int j = 0; j < (i + 1) * 2 - 3; j++) {
	              System.out.print("*");
	          }
	          System.out.println();
	      }
	      
	      for (int i = 1; i <= loopCnt3; i++) {
	          for (int j = 0; j < i + loopCnt3; j++) {
	              System.out.print("*");
	          }
	          for (int j = 0; j < loopCnt3 - i; j++) {
	              System.out.print(" ");
	          }
	          System.out.println();
	      }
	   
	      
	      
	      sc.close();
		
	}

}
