public class MThread {
	public static void main(String[] args) {
		long start = System.nanoTime();

		double[][] array = MkData.generateRandomData(20,10000);
		long elapsedTime = System.nanoTime() - start;

		System.out.println("Time to generate array: " + elapsedTime + "ns");

		start = System.nanoTime();    
		double min = 5000000, max = -6;

		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < min)
					min = array[i][j];
				if (array[i][j] > max)
					max = array[i][j];
			}
		}

		elapsedTime = System.nanoTime() - start;

		System.out.println("Main's min: " + min + "\nMain's max: " + max + "\nTime elapsed: " + elapsedTime + "ns");

		start = System.nanoTime();
		MinMax mm = new MinMax();

		Thread[] calc = new Thread[10];

		for(int i = 0; i < array.length; i++) {
			calc[i%10] = new Calculator(array[i], mm);
			calc[i%10].start();
		}

		for(Thread t : calc){
			try {
				t.join();
			} catch (Exception e) {

			}
		}	

		elapsedTime = System.nanoTime() - start;

		System.out.println("Minimum value: " + mm.getMin() + "\nMaximum value: " + mm.getMax() + "\nTime elapsed: " + elapsedTime + "ns");
	}
}