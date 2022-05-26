package project6;

import java.util.Scanner;

public class Main3{

		public static void main(String[] args) {
			double a, b, c, moda, modb, modc, max;
			try(Scanner sc= new Scanner(System.in)){
			System.out.print("¬вед≥ть перше дробове число: ");
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
				System.out.print("¬вед≥ть друге дробове число: ");
				if (sc.hasNextDouble()) {
					b = sc.nextDouble();
					System.out.print("¬вед≥ть третЇ дробове число: ");
					if (sc.hasNextDouble()) {
						c = sc.nextDouble();
						moda = Math.abs(a);
						modb = Math.abs(b);
						modc = Math.abs(c);
						if (moda >= modb && moda >= modc) {
							max = a;
						} else if (modb >= moda && modb >= modc) {
						max = b;
						} else {
						max = c;
					    }
						System.out.println(max);
					}else {
					System.out.println("¬и ввели ц≥ле число");
					}
				} else {
				System.out.println("¬и ввели ц≥ле число");
				}
			} else {
			System.out.println("¬и ввели ц≥ле число");
		    }	
		}
		}
}