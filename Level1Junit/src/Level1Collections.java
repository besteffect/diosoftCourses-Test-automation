import java.util.ArrayList;
import java.util.List;

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

    //3 В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
    //3 Array of integers has elements with 0 values. Create an array with numbers of these elements
    public static List<Integer> countOfZeronumbersInArray(ArrayList<Integer> list) {
        int numberOfZeros = 0;
        int newListIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                numberOfZeros++;
            }
        }
        List<Integer> newList = new ArrayList<>(numberOfZeros); //creating ArrayList with numberOfZeros size
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                newList.add(newListIndex, i);
                newListIndex++;
            }
        }
        return newList;
    }
}
