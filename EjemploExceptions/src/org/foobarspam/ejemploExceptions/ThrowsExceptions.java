package org.foobarspam.ejemploExceptions;


import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ThrowsExceptions {
	public static void main(String[] args) {
	try {
	// store the double[] returned by the scanValues() method
	double[] userValues = scanValues();
	// store the double returned by the calculatePayment() method
	double payment = calculatePayment(userValues);
		// create a decimal format with two places after the decimal point
		DecimalFormat df = new DecimalFormat("0.##");
		// print the calculated payment according to the format above
		System.out.println("Monthly payment: $" + df.format(payment));
		} catch (InputMismatchException ime) {
		// scanValues() method throws InputMismatchException
		// if user's entry cannot be parsed into a double
		System.out.println("You must enter double values. "
		+ "Please restart program.");
		// terminate the program
		System.exit(0);
		} catch (ArithmeticException ae) {
		// calculatePayment() method throws ArithmeticException
		// if years == 0
		System.out.println("Years must be greater than 0. "
		+ "Please restart program.");
		// terminate the program
		System.exit(0);
		} catch (IndexOutOfBoundsException ioob) {
		// calculatePayment() method throws IndexOutOfBoundsException
		// if double[] has less than 3 elements
		System.out.println("Three doubles are required. "
		+ "Please restart program.");
		// terminate the program
		System.exit(0);
		}
	}
	// method asks for and scans three doubles:
	// principle, interest rate, and loan years
	public static double[] scanValues() throws InputMismatchException {
		double[] values = new double[3];
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the loan amount: ");
			values[0] = scan.nextDouble();
			System.out.print("Enter the interest rate: ");
			values[1] = scan.nextDouble();
			System.out.print("Enter the loan term (in years): ");
			values[2] = scan.nextInt();
		}
		return values;
	}
	// method takes a double[] with three elements
	// and calculates a monthly payment
	public static double calculatePayment(double[] values)
		throws ArithmeticException, IndexOutOfBoundsException {
		double principle = values[0];
		double rate = values[1];
		double years = values[2];
		double interest = principle * rate * years;
		double total = principle + interest;
		return total / years / 12;
	}
}