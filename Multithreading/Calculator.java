public class Calculator extends Thread {
	MinMax mm;
	double[] arr;

	public Calculator(double[] arr, MinMax mm) {
		this.mm = mm;
		this.arr = arr; //Testing pull request
	}

	@Override
	public void run() {
		for(double e : arr) {
			if (e > mm.getMax())
				mm.setMax(e);
			if (e < mm.getMin())
				mm.setMin(e);
		}
	}
}
