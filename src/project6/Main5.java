package project6;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		String a, b;
		try(Scanner sc= new Scanner(System.in)){
		System.out.print("������ ����� �������: ");
		if (sc.hasNext()) {
			a = sc.next();
			System.out.print("������ �� ����� �������: ");
			if (sc.hasNext()) {
				b = sc.next();
				int i,j;
				i=a.length();
				j=b.length();
				if (i>j) {
					System.out.println("� ������� ����� ����� �������");
				}
				else if(i==j) {
					System.out.println("ʳ������ ������� ����");
				}
				else{ 
					System.out.println("� ������� ����� ����� �������");
				}
			}
		}
		}
	}
}