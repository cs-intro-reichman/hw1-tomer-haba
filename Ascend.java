// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int lim = Integer.parseInt(args[0]);
	int a = (int)(Math.random() * lim);
	int b = (int)(Math.random() * lim);
	int c = (int)(Math.random() * lim);

	System.out.println(a+ " " + b + " " + c);

    int min_val = Math.min(Math.min(a, b), c);
	int max_val = Math.max(Math.max(a, b), c);
	int mid_val = a + b + c - min_val - max_val;
	System.out.println(min_val + " " + mid_val + " " + max_val);
	}
}
