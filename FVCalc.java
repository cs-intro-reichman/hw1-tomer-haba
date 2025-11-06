// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]);
		double interestRate = Double.parseDouble(args[1]) / 100;
		double years = Double.parseDouble(args[2]);
		
		double base = 1.0 + interestRate;
		double FutureValueDouble = currentValue * Math.pow(base, years);

		int futureValueInt = (int) FutureValueDouble;
		double ratePercent = interestRate * 100;

		System.out.println(
			"After " + (int) years + " years, $" + (int)currentValue + " saved at " 
			+ ratePercent + "% will yield $" + futureValueInt);
}}