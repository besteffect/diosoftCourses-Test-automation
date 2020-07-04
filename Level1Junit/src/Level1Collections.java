import java.util.ArrayList;

public class Level1Collections {

    public static void main(String[] args) {

    }

    // 2 Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
    // 2 Array of integers is given. Find sum of its elements that are divisable by a given K.
    public static int countSpecificElements(ArrayList<Integer> list, int k) {
        int arraySum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 10 == k) {
                arraySum = arraySum + list.get(i);
            }
        }
        return arraySum;
    }
}
