public class MinMax {
	private double min, max;

	public MinMax() {
		min = Double.MAX_VALUE;
		max = Double.MIN_VALUE;
	}

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}

	public void setMin(double a) {
		min = a;
	}

	public void setMax(double a) {
		max = a;
	}
}