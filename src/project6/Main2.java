package project6;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		String a, b, c, d, e;
		System.out.println("��� ��������� �������� ������ 5 ���");
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
						System.out.println(a.substring(0,1));
						System.out.println(b.substring(0,1));
					System.out.println(c.substring(0,1));
				System.out.println(d.substring(0,1));
			System.out.println(e.substring(0,1));
		}
					}
				}
			}
		}
		}
	}
}