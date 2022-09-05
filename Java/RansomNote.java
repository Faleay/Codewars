class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) 
    {
        for (char letter : magazine.toCharArray()){
            System.out.println(ransomNote.contains(Character.toString(letter)));
            if(ransomNote.contains(Character.toString(letter))){
                ransomNote = ransomNote.replaceFirst(Character.toString(letter), "");
            }
        }
        return ransomNote.length() == 0 ? true : false;
    }

    public static void main(String[] args)
    {
        System.out.println(canConstruct("aa", "aab"));
    }
}