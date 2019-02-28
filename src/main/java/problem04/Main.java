package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num1 = rnd.nextInt(9)+1;
		int num2 = rnd.nextInt(9)+1;
		int cnt = 0;
		int second = 0;
		boolean endFlag = false;
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			cnt++;	
			if(endFlag==false) {
				second++;
			}
			if(cnt==18) {
				int problem = num1*num2;
				int answer = sc.nextInt();
				endFlag = true;
				break;
			}
		
		}
		

	}
}