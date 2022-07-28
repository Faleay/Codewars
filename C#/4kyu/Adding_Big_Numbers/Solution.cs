using System;

public class Kata
{
  public static string Reverse( string s )
        {
            char[] charArray = s.ToCharArray();
            Array.Reverse( charArray );
            return new string( charArray );
        }

        public static string Add(string a, string b)
        {
            string res = "";
            string aArr = Reverse(a);
            // Array.Reverse(aArr);
            string bArr = Reverse(b);
            // Array.Reverse(bArr);
            int counts = aArr.Length > bArr.Length ? aArr.Length : bArr.Length;
            int sum = 0;
            int adding = 0;

            for(int j = 0; j<=counts; j++){
                sum = 0;
                if(j >= aArr.Length && j >= bArr.Length){
                    sum = adding;
                    if(sum >= 10){
                        res = res + Convert.ToString(sum-10);
                        adding = 1;
                    }
                    else{
                        res = res + Convert.ToString(sum);
                        adding = 0;
                    }
                    continue;
                }
                else if(j >= aArr.Length){
                    sum = int.Parse(Convert.ToString(bArr[j])) + adding;
                    if(sum >= 10){
                        res = res + Convert.ToString(sum-10);
                        adding = 1;
                    }
                    else{
                        res = res + Convert.ToString(sum);
                        adding = 0;
                    }
                    continue;
                }
                else if(j >= bArr.Length){
                    sum = int.Parse(Convert.ToString(aArr[j])) + adding;
                    if(sum >= 10){
                        res = res + Convert.ToString(sum-10);
                        adding = 1;
                    }
                    else{
                        res = res + Convert.ToString(sum);
                        adding = 0;
                    }
                    continue;
                }
                else{
                    sum = int.Parse(Convert.ToString(aArr[j])) + int.Parse(Convert.ToString(bArr[j])) + adding;
                    if(sum >= 10){
                        res = res + Convert.ToString(sum-10);
                        adding = 1;
                    }
                    else{
                        res = res + Convert.ToString(sum);
                        adding = 0;
                    }
                    continue;
                }
            }
            if(res[res.Length-1] == '0'){
                res = res.TrimEnd('0');
            }
            string resArr = Reverse(res);
            // Array.Reverse(resArr);
            string newRes = resArr.ToString() + "";

            return newRes;
        }
}