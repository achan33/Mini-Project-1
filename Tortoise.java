public class Tortoise {

	private int stepsAmt;

//getters and setters
	public static int setTort(int stepsAmt) {
		return stepsAmt;
	}

//shows current steps
	public int currTort() {
		return stepsAmt;
	}

	public int fastPlod() {
		stepsAmt += 3;
		return stepsAmt;
	}

	public int slowPlod() {
		stepsAmt += 1;
		return stepsAmt;
	}

	public int slipPlod() {
		if (stepsAmt > 6) {
			stepsAmt -= 6;
		} else {
			stepsAmt = 1;
		}
		return stepsAmt;

	}

}// end class