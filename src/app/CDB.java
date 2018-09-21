package app;

public class CDB {

	public static double redimento_bruto(int n, double p, double i) {
		double result = ((n/365)*p*(i/100));
		return result;
	}

}
