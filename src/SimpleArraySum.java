public class SimpleArraySum {
  
    /*
     * Complete the simpleArraySum function below.
     */
    public int simpleArraySum(int[] ar) {

      int result = 0;

      for (int i = 0; i < ar.length; i++) {
        result = result + ar[i];
      }
      return result;
    }


}
