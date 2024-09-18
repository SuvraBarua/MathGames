import java.util.*;

class RanNumGen {
  int Genarate(int x) {
    Random rand = new Random();
    return rand.nextInt(x) + 1;
  }
}
