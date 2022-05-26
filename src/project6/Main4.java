package project6;

import java.util.Scanner;

public class Main4{

		public static void main(String[] args) {
			String a, b;
			try(Scanner sc= new Scanner(System.in)){
			System.out.print("¬вед≥ть перше ≥м'€: ");
			if (sc.hasNext()) {
				a = sc.next();
				System.out.print("¬вед≥ть друге ≥м'€: ");
				if (sc.hasNext()) {
					b = sc.next();
					System.out.println(a.compareToIgnoreCase(b));
				}
				}
			}
		}
}