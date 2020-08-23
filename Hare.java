public class Hare {

	private int stepsAmt;

	public static int setHare(int stepsAmt) {
		return stepsAmt;
	}
//shows current steps

	public int currHare() {
		return stepsAmt;
	}

	public int bigHop() {
		stepsAmt += 9;
		return stepsAmt;
	}

	public int smallHop() {
		stepsAmt += 1;
		return stepsAmt;
	}

	public int bigSlip() {
		if (stepsAmt > 12) {
			stepsAmt -= 12;
		} else {
			stepsAmt = 1;
		}
		return stepsAmt;

	}

	public int smallSlip() {
		if (stepsAmt > 2) {
			stepsAmt -= 2;
		} else {
			stepsAmt = 1;
		}
		return stepsAmt;
	}

	public int asleepZZ() {
		stepsAmt += 0;
		return stepsAmt;

	}

}// end class
