package tops.accounts;

import java.util.Random;
import java.util.Scanner;

public class Stonegame {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int userInput=sc.nextInt();
		
		Random random=new Random();
		int computerInput=random.nextInt();
		
		if(userInput==computerInput) {
			System.out.println("Draw");
		}
		else if(userInput==0&&computerInput==2|| userInput==2&&computerInput==1 
				||userInput==0&&computerInput==1) {
			System.out.println("You won!");
		}
		else {
			System.out.println("Computer won!");
		}
	}
}
