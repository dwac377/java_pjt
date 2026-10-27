package com.office.arrayex;

public class arrayEx2 {
	public static void main(String[] args) {
		
		int[][] scores = {
				{85, 90, 90}, 
				{90, 80, 85},
				{90, 90, 100},
				{95, 85, 100}
			};
		
		for (int i = 0; i < scores.length; i++) {
			int[] temp = scores[i];
			for (int j = 0; j < temp.length; j++) {
				String str = "";
				switch (j) {
				case 0:
					str = "국어";
					break;
				case 1:
					str = "영어";
					break;
				case 2:
					str = "수학";
					break;
				}
				System.out.printf("%d학기 %s점수: %d \n", i + 1, str, temp[j]);
			}
		}
	}

}
