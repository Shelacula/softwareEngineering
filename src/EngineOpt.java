public class EngineOpt implements EngineAPI {

  //default constructor for Engine
  public EngineOpt(){
  }

  @Override
  public String compute(int number) {
    long start = System.currentTimeMillis();
    int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
    long[] table = new long[number + 1];
    table[0] = 1;
    for (int i = 0; i < coins.length; i++) {
      int coinNum = coins[i];
      for (int j = coins[i]; j <= number; j++) {
        long newVal = table[j] + (table[j - coinNum]);
        table[j] = newVal;
    }
  }
  long end = System.currentTimeMillis();
  System.out.println((end-start) + " milliseconds elapsed to calculate number " + number);
  return table[number] + "";
  }
}