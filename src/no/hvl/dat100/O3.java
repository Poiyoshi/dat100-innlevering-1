package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		String a = showInputDialog("Skriv inn et heltall større enn null: ");
		int x = parseInt (a);
		int t = 1;
		for(int i = 1; i <= x; i++) {
				t = i * t;
		} System.out.println(x + "! = " + t);
}
}