// Oh my goodness! It's not my best solution, because I did an empty job...

// Sorry for my English. I'm trying to not use translator

class GreedIsGood {

    public static int greedy(int[] dice) {
        int result = 0;
        int countDices[] = { 0, 0, 0, 0, 0, 0 };
        for (int number : dice) {
            countDices[number - 1]++;
        }
        for(int number : countDices){
            System.out.print(number+"; ");
        }
        for (int i = 0; i < countDices.length; i++) {
            while (countDices[i] > 0){
                if(countDices[i] >= 3){
                    if(i == 0){
                        result += 1000;
                    }
                    else{
                        result += (i+1) * 100;
                    }
                    countDices[i] -= 3;
                }
                if(countDices[i] >= 1){
                    if(i == 0){
                        result += 100;
                    }
                    if(i == 4){
                        result += 50;
                    }
                    countDices[i] -= 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(greedy(new int[]{2,4,4,5,4}));
    }

}

// 100 + 100 + 30 + 40 + 50