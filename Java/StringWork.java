import java.util.HashMap;
import java.util.Map;

class StringWork{

    public static String getClearString(String str){
        return str.trim().replaceAll(" +", " ");
    }

    public static int getSumOfChars(String str){
        return str.length();
    }

    public static int getSumOfWords(String str){
        String[] data = str.split(" ");
        return data.length;
    }

    public static HashMap<Character, Integer> getMapOfLetters(String str){
        HashMap<Character, Integer> map =  new HashMap<Character, Integer>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '\s'){
                continue;
            }
            if(!map.containsKey(str.toLowerCase().charAt(i))){
                map.put(str.toLowerCase().charAt(i), 1);
            }
            else{
                int temp = map.get(str.toLowerCase().charAt(i));
                temp++;
                map.put(str.charAt(i), temp);
            }
        }
        return map;
    }

    public static void percentOfEachLetter(HashMap<Character, Integer> map, int len){
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + String.format("%.3f", (float)entry.getValue() / len * 100f) + "%");
        }
    }

    public static void getAllData(String str){
        str = getClearString(str);
        int sumOfChars = getSumOfChars(str);
        int sumOfWords = getSumOfWords(str);
        HashMap<Character, Integer> map = getMapOfLetters(str);
        percentOfEachLetter(map, sumOfChars);

        System.out.println("Количество символов в строке: " + sumOfChars);
        System.out.println("Количество слов в строке: " + sumOfWords);
    }

    public static void main(String[] args){
        String test = "Это тестовая   строка";
        getAllData(test);
    }

}