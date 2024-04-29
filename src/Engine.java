


public class Engine implements EngineAPI {

  //default constructor for Engine
  public Engine(){
  }

  @Override
  public String compute(int number) {
    //create a matrix to contain coin values + final values, set the first value of each with 1 (only one way to make it with single coins)
    long start = System.currentTimeMillis();
    long[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
    long[][] table = new long[number + 1][coins.length];
    for (int i = 0; i <= number; i++) {
      table[i][0] = 1;
    }

    //determine how many ways to make the target value by figuring out how many ways to make each preceding value
    for (int i = 0; i <= number; i++) {
      for (int j = 1; j < coins.length; j++) {
        table[i][j] = table[i][j - 1];
        if (coins[j] <= i) {
          table[i][j]+= table[i - (int)coins[j]][j];
        }
      }
    }
    long end = System.currentTimeMillis();
    System.out.println((end-start) + " milliseconds elapsed to calculate number " + number);
    //return the last value in the matrix, which is the final answer
    return table[number][coins.length - 1] + "";
  }
}