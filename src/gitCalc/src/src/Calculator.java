package gitCalc.src.src;

import java.io.*;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {


		int luku3;
		int luku4;
		Scanner input = new Scanner(System.in);
		System.out.println("Anna 3. luku");
		luku3 = input.nextInt();
		System.out.println("Anna 4. luku");
		luku4 = input.nextInt();
		System.out.println("Summa on "+(luku3+luku4));
		


	}

}
