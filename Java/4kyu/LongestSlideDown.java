// This kata was really easy ... But!
// On the middle of my solution I stuck with a little mistake. 
// So, when I found this I got this kata :p

public class LongestSlideDown {

    public static int longestSlideDown(int[][] pyramid) {
      // 0 -> 0, 1
      // 1 -> 1, 2
      // 2 -> 2, 3
      // 3 -> 3, 4
      int[][] result = pyramid;
      for(int i = pyramid.length - 2; i >= 0; i--){
        for(int j = 0; j < pyramid[i].length; j++){
          result[i][j] = pyramid[i][j] + Math.max(pyramid[i+1][j], pyramid[i+1][j+1]);
        }
      }
      return result[0][0];
    }
}