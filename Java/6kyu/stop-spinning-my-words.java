class SpinWords {
    public String spinWords(String sentence) {
      String res = "";
      String[] strArr = sentence.split(" ");
      for(String str : strArr){
        if(str.length() >= 5) res+= new StringBuilder(str).reverse().toString()+" ";
        else res += str+" ";
      }
      return res.trim();
    }
  }