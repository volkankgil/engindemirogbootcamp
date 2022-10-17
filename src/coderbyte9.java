import java.util.*;

public class coderbyte9 {

    public static int BracketMatcher(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("(", 0);
        map.put(")", 0);

        if (!str.contains("(") && !str.contains(")")) {
            return 1;
        }

        for (char c : str.toCharArray()) {
            if (("" + c).equals("(")) {
                map.put("(", map.get("(") + 1);
            }
            else if ((""+c).equals(")")){
                map.put(")", map.get(")") + 1 );
            }
        }
        return map.get("(") == map.get(")") ? 1 : 0;
    }


   /* String a = "the color re(d))()(()";

    public static String BracketMatcher(String str) {
        // code goes here
        int a = 0;

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                a+=1;
            } else if (str.charAt(i) == '('){
                a-=1;
            }
        }

        if (a == 0) {
            result = "1";
        } else {
            result = "0";
        }
        return result;
    }*/

    public static void main(String[] args) {

            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(BracketMatcher(s.nextLine()));
        }

    }
