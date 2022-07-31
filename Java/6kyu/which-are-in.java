import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class WhichAreIn { 
  
  public static String[] inArray(String[] array1, String[] array2) {
    List<String> r = new ArrayList<String>();
      for(String str : array1){
        for(String check : array2){
          if(check.contains(str)){
            r.add(str);
            break;
          } 
        }
      }
    String[] res = new String[r.size()];
    res = r.toArray(res);
    Arrays.sort(res);
    return res;
  }
}