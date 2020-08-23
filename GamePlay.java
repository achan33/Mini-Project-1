public class GamePlay {
	public static void main(String[] args) {

//start game
		System.out.println("And they're off!");

		int positionSteps = 1;
		int stepsGain = 0;

//creating a hare and tortoise object
		Hare oneHare = new Hare();
		Tortoise oneTort = new Tortoise();

		oneHare.setHare(positionSteps);
		oneTort.setTort(positionSteps);

//base for steps or start of steps
		for (int x = 1; x <= 50; x++) {
			if (x == 1) {
				System.out.print("T/H");
			}

			System.out.print(" _ ");

		}
		System.out.println();

//this will generate a random number between 1 and 10 with condition of hare and tortoise step beng less than 50
		while (oneHare.currHare() <= 50 & oneTort.currTort() <= 50) {
			int stepsGen;
			stepsGen = (int) (Math.random() * 10 + 1);

//class for conditions of steps
			switch (stepsGen) {
			case 1:
				oneHare.bigHop();
				oneTort.fastPlod();
				break;

			case 2:
				oneHare.bigHop();
				oneTort.fastPlod();
				break;

			case 3:
				oneHare.smallHop();
				oneTort.fastPlod();
				break;

			case 4:
				oneHare.smallHop();
				oneTort.fastPlod();
				break;

			case 5:
				oneHare.smallHop();
				oneTort.fastPlod();
				break;

			case 6:
				oneHare.bigSlip();
				oneTort.slowPlod();
				break;

			case 7:
				oneHare.smallSlip();
				oneTort.slowPlod();
				break;

			case 8:
				oneHare.smallSlip();
				oneTort.slowPlod();
				break;

			case 9:
				oneHare.asleepZZ();
				oneTort.slipPlod();
				break;

			case 10:
				oneHare.asleepZZ();
				oneTort.slipPlod();
				break;
			default:
				System.out.print("Invalid input of data has been made");
				break;
			}

			if (oneTort.currTort() == oneHare.currHare()) {
				for (int track = 1; track <= 50; track++) {

					if (oneTort.currTort() == track) {
						System.out.print("Ow");
					}
					System.out.print(" _ ");
				}
			} else {
				for (int x = 1; x <= 50; x++) {
					// Turtle position
					if (oneTort.currTort() == x) {// if position of turtle ==x
						System.out.print("T");
					}
					// hare position
					else if (oneHare.currHare() == x) {
						System.out.print("H");
					}
					System.out.print(" _ ");
				}
			}
//new line to show who won
			System.out.println();
			System.out.println();

		}

		if (oneHare.currHare() >= 50) {
			System.out.print("HARE HAS WON");
		} else if (oneTort.currTort() >= 50) {
			System.out.print("Tortoise has won!");
		} else if (oneHare.currHare() >= 50 && oneTort.currTort() >= 50) {
			System.out.print("It's a tie!");
		}
	}
}