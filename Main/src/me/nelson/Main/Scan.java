package me.nelson.Main;

import java.util.Scanner;

public class Scan {
	
	@SuppressWarnings("resource")
	public void read() {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		System.out.println("Que numero quieres SUMAR Billy, Feria, Ulloa?");
		x = scan.nextInt();
		System.out.println();
		System.out.println("Dame otro numero");
		System.out.println();
		y = scan.nextInt();
		System.out.println("Gracias! Sumando en proceso!");
		z = x + y;
		System.out.println();
		System.out.println("Tu repuesta es: " + z);
		System.out.println("Buenas Noches!");
	}

}
