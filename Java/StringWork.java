import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StringWork{

    public static String userString = "test";

    public static Scanner scan = new Scanner(System.in);

    public static boolean sumOfCharsOn = true;

    public static boolean countSpaces = true;

    public static boolean sumOfWordsOn = true;

    public static boolean percentOfEachLetterOn = true;

    public static String onOff(boolean bool){
        if(bool) return "on";
        else return "off";
    }

    public static void choose(String str){
        System.out.println("\n\n==================================================== \n");
        switch(str){
            case "1": countSpaces = !countSpaces; break;
            case "2": sumOfCharsOn = !sumOfCharsOn; break;
            case "3": sumOfWordsOn = ! sumOfWordsOn; break;
            case "4": percentOfEachLetterOn = !percentOfEachLetterOn; break;
            case "5": 
                System.out.println("Insert your string: ");
                userString = scan.nextLine();
                break;
            case "6": getAllData(userString);
            case "ext": System.exit(0);
            default: break;
        }
        greatings();
    }

    public static void greatings(){
        System.out.println("================================================\n");
        System.out.println("Welcome to the PROJECT_NAME\nThis project gives you sum of chars and words in your string\nand percent of each letter used");
        System.out.println("Options: \n1. Spaces count: "+onOff(countSpaces)+"\n2. Enable sum of characters: "+onOff(sumOfCharsOn)+"\n3. Enable sum of words: "+onOff(sumOfWordsOn)+"\n4. Enable percents of each letter: "+onOff(percentOfEachLetterOn)+"\n5. Edit or enter your string (default \"test\")\n6. Start\next. Program exit");
        String option = scan.nextLine();
        choose(option);
    }
    
    public static String getClearString(String str){
        return str.trim().replaceAll(" +", " ");
    }

    public static int getSumOfChars(String str){
        if(countSpaces){
            return str.length();
        }
        else{
            str = str.replaceAll(" ", "");
            return str.length();
        }
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
                map.put(str.toLowerCase().charAt(i), temp);
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
        if(percentOfEachLetterOn) percentOfEachLetter(map, sumOfChars);

        if(sumOfCharsOn) System.out.println("Count of chatacters in string: " + sumOfChars);
        if(sumOfWordsOn) System.out.println("Count of words in string: " + sumOfWords);
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ex){}
        greatings();
    }

    public static void main(String[] args){
        greatings();

        // String test = "Это тестовая   строка";
        // getAllData(test);
    }

}