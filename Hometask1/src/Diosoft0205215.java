/**
 * Created by Smart on 2/5/2015.
 */
public class Diosoft0205215 {

    public static void main(String[] args) {
        int[] array = {1, 2, 100, 900, 4, 7,2,10,0,30,1000,10};
        sumDifference(array);
    }
    public static void sumDifference(int[] array) {
        int sum1=0;
        int sum2;
        int count1 = 0;
        int firstZeroNum = 0;
        int notZeroNumbers = 0;
        int result=0;//
        for (int i=0;i< array.length;i++) {
            if (array[i] % 10 == 0) {
                count1++;
                if (count1 == 2) {
                    count1=0;
                    sum1+= array[i];
                }else{
                firstZeroNum+=array[i];
                }
            }else{
                notZeroNumbers+= array[i];
            }
        }
        sum2 = notZeroNumbers+firstZeroNum;
        result = sum1 - sum2;
        System.out.println(result);
        }
}
