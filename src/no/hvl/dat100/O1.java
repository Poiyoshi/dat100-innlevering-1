package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {
		String a = showInputDialog("Skriv inn inntekten din her:");
		int inntekt = parseInt(a);

		if (inntekt <= 208050) {
			System.out.println("Du betaler ikke trinnskatt.");
		} else if (inntekt > 208050 && inntekt <= 292850) {
			double skatt = inntekt * 0.017;
			System.out.println("Du betaler " + skatt + " i skatt med en inntekt på " + inntekt);
		} else if (inntekt > 292850 && inntekt <= 670000) {
			double skatt = ((292850 - 208050) * 0.017) + ((inntekt - 292850) * 0.04);
			System.out.println("Du betaler " + skatt + " i skatt med en inntekt på " + inntekt);
		} else if (inntekt > 670000 && inntekt <= 937900) {
			double skatt = ((292850 - 208050) * 0.017) + ((670000 - 292850) * 0.04) + ((inntekt - 670000) * 0.136);
			System.out.println("Du betaler " + skatt + " i skatt med en inntekt på " + inntekt);
		} else if (inntekt > 937900 && inntekt <= 1350000) {
			double skatt = ((292850 - 208050) * 0.017) + ((670000 - 292850) * 0.04) + ((937900 - 670000) * 0.136)
					+ ((inntekt - 937900) * 0.166);
			System.out.println("Du betaler " + skatt + " i skatt med en inntekt på " + inntekt);
		} else if (inntekt > 1350000) {
			double skatt = ((292850 - 208050) * 0.017) + ((670000 - 292850) * 0.04) + ((937900 - 670000) * 0.136)
					+ ((1350000 - 937900) * 0.166) + ((inntekt - 1350000) * 0.176);
			System.out.println("Du betaler " + skatt + " i skatt med en inntekt på " + inntekt);
		}

	}

}
