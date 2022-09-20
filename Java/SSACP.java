import java.util.HashMap;

class SSACP{

    public static void Ssacp(String str){
        String correctString = str.trim().replaceAll(" +", " ");
        String[] data = correctString.split(" ");
        int sumOfChars = correctString.length();
        int sumOfWords = data.length;
        HashMap<Character, Integer> map =  new HashMap<Character, Integer>();
        for(int i = 0; i < correctString.length(); i++){
            if(correctString.charAt(i) == '\s'){
                continue;
            }
            if(!map.containsKey(correctString.toLowerCase().charAt(i))){
                map.put(correctString.toLowerCase().charAt(i), 1);
            }
            else{
                int temp = map.get(correctString.toLowerCase().charAt(i));
                temp++;
                map.put(correctString.charAt(i), temp);
            }   
        }
        System.out.println(map);

        System.out.println("Количество символов в строке: " + sumOfChars);
        System.out.println("Количество слов в строке: " + sumOfWords);
    }

    public static void main(String[] args){
        String test = "Это тестовая   строка";
        Ssacp(test);
    }

}