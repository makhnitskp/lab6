package project6;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		String a, b;
		try(Scanner sc= new Scanner(System.in)){
		System.out.print("Введіть кілька символів: ");
		if (sc.hasNext()) {
			a = sc.next();
			System.out.print("Введіть ще кілька символів: ");
			if (sc.hasNext()) {
				b = sc.next();
				int i,j;
				i=a.length();
				j=b.length();
				if (i>j) {
					System.out.println("У першому рядку більше символів");
				}
				else if(i==j) {
					System.out.println("Кількість символів рівна");
				}
				else{ 
					System.out.println("У другому рядку більше символів");
				}
			}
		}
		}
	}
}