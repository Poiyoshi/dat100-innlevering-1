package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class O2 {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			String x = showInputDialog("Skriv inn poengsum: ");
			int p = parseInt(x);
			
			while(p>100 || p<0) {
				String u = showInputDialog("Ugyldig poengsum, skriv inn på nytt: ");
				p = parseInt(u);
			}
			
				if(p >= 90 && p <= 100) {
					System.out.println("Karakter A");
				} else if(p >= 80 && p < 90) {
					System.out.println("Karakter B");
				}else if(p >= 60 && p < 80) {
					System.out.println("Karakter C");
				}else if(p >= 50 && p < 60) {
					System.out.println("Karakter D");
				}else if(p >= 40 && p < 50) {
					System.out.println("Karakter E");
				}else if(p < 40 && p >= 0) {
					System.out.println("Karakter F, stryk");
			}
			}

		}
	}