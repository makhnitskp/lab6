package project6;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		String a, b, c, d, e;
		System.out.println("��� ��������� �������� ������ ����� � 5 ���");
		try(Scanner sc= new Scanner(System.in)){
		System.out.print("������ ����� �����: ");
		if(sc.hasNext()) {
			a = sc.next();
			System.out.print("������ ����� �����: ");
			if(sc.hasNext()) {
			b = sc.next();
				System.out.print("������ ���� �����: ");
				if(sc.hasNext()) {
				c = sc.next();
					System.out.print("������ �������� �����: ");
					if(sc.hasNext()) {
					d = sc.next();
						System.out.print("������ �'��� �����: ");
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