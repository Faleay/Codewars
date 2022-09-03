class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
          for(int j = 0; j < numbers.length; j++){
            if(j == i)
              continue;
            if(numbers[j] + numbers[i] == target)
              return new int[]{i, j};
          }
        }
        return null;
    }
}