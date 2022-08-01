import java.util.Arrays;

class Kata {
  public static int findEvenIndex(int[] arr) {
    int rightSum = Arrays.stream(arr).sum() - arr[0];
    int leftSum = 0;
    if(leftSum == rightSum) return 0;
    for(int i = 1; i<arr.length; i++){
      leftSum += arr[i-1];
      rightSum -= arr[i];
      if(leftSum == rightSum) return i;
    }
    return -1;
  }
}