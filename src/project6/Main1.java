package project6;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		String a, b, c, d, e;
		System.out.println("ƒл€ виконанн€ програми введ≥ть слово з 5 сл≥в");
		try(Scanner sc= new Scanner(System.in)){
		System.out.print("¬вед≥ть перше слово: ");
		if(sc.hasNext()) {
			a = sc.next();
			System.out.print("¬вед≥ть друге слово: ");
			if(sc.hasNext()) {
			b = sc.next();
				System.out.print("¬вед≥ть третЇ слово: ");
				if(sc.hasNext()) {
				c = sc.next();
					System.out.print("¬вед≥ть четверте слово: ");
					if(sc.hasNext()) {
					d = sc.next();
						System.out.print("¬вед≥ть п'€те слово: ");
						if(sc.hasNext()) {
						e = sc.next();
						System.out.println(a+" ".concat(b)+" ".concat(c)+" ".concat(d)+" ".concat(e));
						}
					}
				}
			}
		}
	}
}
}