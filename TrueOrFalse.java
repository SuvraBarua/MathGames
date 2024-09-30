import java.util.*;

class TrueOrFalse{
	char operators[] = {'+', '-', '*', '/'};
	char relationalOperator[] = {'=', '>', '<'};
	int numbers[];
	void easy(){
		Random rand = new Random();
		numbers = new int[4];
		numbers[0] = rand.nextInt(20)+1;
		numbers[1] = rand.nextInt(20)+1;
		numbers[2] = rand.nextInt(20)+1;
		numbers[3] = rand.nextInt(20)+1;
	}
	
	void medium(){
		Random rand = new Random();
		numbers = new int[4];
		numbers[0] = rand.nextInt(100)+1;
		numbers[1] = rand.nextInt(100)+1;
		numbers[2] = rand.nextInt(100)+1;
		numbers[3] = rand.nextInt(100)+1;
	}

	void hard(){
		Random rand = new Random();
		numbers = new int[4];
		numbers[0] = rand.nextInt(901)+101;
		numbers[1] = rand.nextInt(901)+101;
		numbers[2] = rand.nextInt(901)+101;
		numbers[3] = rand.nextInt(901)+101;
	}

	void trueFalse(){
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		int points  = 0;
		System.out.println("Do you want to play in easy, medium or hard difficulty: ");
		String difficulty = input.next();
		difficulty = difficulty.toLowerCase();

		while(true){
			if(difficulty.equals("easy")){
				easy();
			}
			else if(difficulty.equals("medium")){
				medium();
			}
			else if(difficulty.equals("hard")){
				hard();
			}

			int operatorSelector1 = ran.nextInt(4);
			int operatorSelector2 = ran.nextInt(4);

			int relationalOperatorSelector = ran.nextInt(3);

			System.out.println("Write true or false");
			System.out.println(numbers[0] + " " + operators[operatorSelector1] + " " + numbers[1] + " " + relationalOperator[relationalOperatorSelector]
			+ " " + numbers[2] + " " + operators[operatorSelector2] + " " + numbers[3]);

			int ansPart1 = ansGen(numbers[0], numbers[1], operatorSelector1);
			int ansPart2 = ansGen(numbers[2], numbers[3], operatorSelector2);
			boolean ans = finalAns(ansPart1, ansPart2, relationalOperatorSelector);
			
			boolean userInput = input.nextBoolean();

			if(userInput & ans){
				System.out.println("Yay, right answer");
				points += 10;
				System.out.println("Your point is" + points);
			}
			else if(!userInput & !ans){
				System.out.println("Yay, right answer");
				points += 10;
				System.out.println("Your point is " + points);
			}
			else{
				System.out.println("Wrong answer!!");
				System.out.println("Your points is " + points);
				break;
			}
		}
	}

	int ansGen(int a, int b, int x){
		if(x == 0){
			return a + b;
		}
		else if(x == 1){
			return a - b;
		}
		else if(x == 2){
			return a * b;
		}
		else if(x == 3){
			return a + b;
		}
		return 0;
	}
	boolean finalAns(int x, int y, int relation){
		if(relation == 0){
			return x == y;
		}
		else if(relation == 1){
			return x > y;
		}
		else if(relation == 2){
			return x < y;
		}
		return false;
	}
}
