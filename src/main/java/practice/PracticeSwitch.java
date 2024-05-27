package practice;

public class PracticeSwitch {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 1, 5, 5, 2, 1, 3, 1 };

		for (int number : numbers)
			switch (number) {
			case 1:
				System.out.println(number + ": 勇者");
				break;
			case 2:
				System.out.println(number + ": バトルマスター");
				break;
			case 3:
				System.out.println(number + ": パラディン");
				break;
			case 4:
				System.out.println(number + ": 海賊");
				break;
			case 5:
				System.out.println(number + ": 魔法剣士");
				break;
			}

	}

}