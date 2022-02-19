
import java.util.Arrays;
import java.util.HashMap;

    public class AnagramProblem {
        public static void main(String[] args) {
            subString("ovo");
            subString("ifailuhkqq");


        }

        static void subString(String str){
            HashMap<String, Integer> map= new HashMap<>();

            for(int i = 0; i < str.length(); i++){
                for(int j = i; j < str.length(); j++){
                    char[] valC = str.substring(i, j+1).toCharArray();
                    Arrays.sort(valC);
                    String val = new String(valC);
                    if (map.containsKey(val))
                        map.put(val, map.get(val)+1);
                    else
                        map.put(val, 1);
                }
            }
            int pareAnagramCount = 0;
            for(String key: map.keySet()){
                int n = map.get(key);
                pareAnagramCount += (n * (n-1))/2;
            }
            System.out.println(pareAnagramCount);
        }

}
