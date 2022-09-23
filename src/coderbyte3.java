import java.util.*;

public class coderbyte3 {

   /* Sum Multiplier
    Have the function SumMultiplier(arr) take the array of numbers stored in arr and return the string true
    if any two numbers can be multiplied so that the answer is greater than double the sum of all the elements in the array.
    If not, return the string false. For example: if arr is [2, 5, 6, -6, 16, 2, 3, 6, 5, 3] then the sum of all these elements
    is 42 and doubling it is 84. There are two elements in the array, 16 * 6 = 96 and 96 is greater than 84, so your program
    should return the string true.

    Examples
    Input: new int[] {2, 2, 2, 2, 4, 1}
    Output: false

    Input: new int[] {1, 1, 2, 10, 3, 1, 12}
    Output: true*/

    public static String SumMultiplier(int[] arr) {
        // code goes here

        int çarpým=1;

        int max=0;

        int toplam=0;

        int toplam2=0;

        String sonuc;

        for(int i=0;i<arr.length;i++){
            for(int k=0;k<arr.length;k++){
                if(((çarpým=arr[i]*arr[k]))>max){
                    max=çarpým;
                }
            }
        }

        for(int j=0;j<arr.length;j++){
            toplam+=arr[j];
        }

        toplam2=toplam*2;

        if(çarpým>toplam2){
            sonuc="true";
        }else{
            sonuc="false";
        }
        return sonuc;
    }
}
