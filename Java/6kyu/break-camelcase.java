// My solution was:
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
  public static String camelCase(String input) {
    String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    List<Character> result = new ArrayList<Character>();
    char[] inputArray = input.toCharArray();
    for(char chr : inputArray){
      if(upperChars.contains(String.valueOf(chr))) result.add(' ');
      result.add(chr);
    }
    return result.stream().map(String::valueOf).collect(Collectors.joining());
  }
}

// But thats not great solutions
// I just realy bad with strings now