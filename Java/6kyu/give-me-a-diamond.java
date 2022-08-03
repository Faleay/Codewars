class Diamond {
    public static String print(int n) {
      int odd = 1, numberOfSpaces = n/2;
      String res = "";
      for(int i = 1; i<=n; i++){
        for(int j = numberOfSpaces; j >= 1; j--){
          res+=" ";
        }
        for(int k = 1; k <= odd; k++){
          res+="*";
        }
        res+="\n";
        if(i < n/2+1){
          odd += 2;
          numberOfSpaces -= 1;
        }
        else{
          odd -= 2;
          numberOfSpaces += 1;
        }
      }
      return (n <= 0 || n%2 == 0) ? null : res;
    }
  }