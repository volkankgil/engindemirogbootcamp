/*Find Intersection
        Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements:
        the first element will represent a list of comma-separated numbers sorted in ascending order, the second element will
        represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated string
        containing the numbers that occur in elements of strArr in sorted order. If there is no intersection, return the
        string false.

        Examples

        Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
        Output: 1,4,13

        Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
        Output: 1,9,10
*/

import java.util.*;
public class coderbyte5 {

        public static String FindIntersection (String[]strArr){

            // code goes here
            String str1[] = strArr[0].split(", ");
            String str2[] = strArr[1].split(", ");


            StringBuilder newStr = new StringBuilder();

            for (int i = 0; i < str1.length; i++) {
                for (int j = 0; j < str2.length; j++) {
                    if ((Integer.parseInt(str1[i])) == (Integer.parseInt(str2[j]))) {
                        newStr.append(str1[i] + ",");
                    }
                }
            }
            if (newStr.length() == 0) {
                strArr[0] = "false";
            } else {
                String word = newStr.substring(0, newStr.length() - 1);
                strArr[0] = word;
            }
            return strArr[0];
        }

    public static void main(String[] args) {
        String arr[]={"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        System.out.println(FindIntersection(arr));
    }
    }