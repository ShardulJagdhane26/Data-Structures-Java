package DY_O_DLL;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Methods m = new Methods();
		Scanner sc = new Scanner (System.in);
		while(true) {
			System.out.println();
			System.out.println("...........DLL...........");
			System.out.println();
			System.out.println("Operations on DLL:");
			System.out.println("1.Insert Elements");
			System.out.println("2.Delete Elements");
			System.out.println("3.Display Elements");
			System.out.println("4.Exit");
			System.out.println();
			System.out.print("Enter ur choice : ");
			int ch = sc.nextInt();
			switch (ch) {
				case 1:{
					m.Insert();
					break;
				}
				case 2:{
					m.Delete();
					break;
				}
				case 3:{
					m.Display();
					break;
				}
				case 4:{
					System.out.println("Exit");
					return;
				}
				default:
					System.out.println("Invalid Input : " + ch );
					break;
				}
		}
	}
}
