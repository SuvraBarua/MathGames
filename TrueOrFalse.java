import java.util.*;

class TrueOrFalse{
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
	int[] trueFalse(){
    easy();
    return numbers;
  }
}
