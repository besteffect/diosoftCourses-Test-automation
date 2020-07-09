import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level1Collections {

    public static void main(String[] args) {
        changeAllElementsToZ(new ArrayList<>(Arrays.asList(1, 2, -5, 4, 6, 44, 3, -13, -4, 44)), 4);
        System.out.println("Before changed: 1, 4, 1, 3, 76, 34, 3, 2, 53, 2, 43, 3, 43, 76");
        changeBiggestWithSmallest(new ArrayList<>(List.of(1, 4, 1, 3, 76, 34, 3, 2, 53, 2, 43, 3, 43, 76)));
    }

    // 2 Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
    // 2 Array of integers is given. Find sum of its elements that are divisible by a given K.
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

    //4 Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число встречается раньше – положительное или отрицательное.
    //4 Array of integers is given (positive and negative numbers). Define which number appears first - positive or negative.
    public static String findWhichIsFirstPositiveorNegative(List<Integer> list) {
        int firstNumber = 0;
        String result = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                firstNumber = list.get(i);
                break;
            }
        }
        if (firstNumber > 0) {
            result = "First number is positive";
        }
        if (firstNumber < 0) {
            result = "First number is negative";
        }
        return result;
    }

    //5 Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.
    //  int[] array = {7, 8, 12, 22, 33, 51, 63, 64, 55};
    // 5 Array of int is given. Find out if it is ascending
    public static boolean isArraySorted(List<Integer> list) {
        boolean isSorted = false;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                isSorted = true;
            } else isSorted = false;
        }
        return isSorted;
    }

    // 6 Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести сообщение об этом факте.
    // 6 Array of int is given. Create an array with even numbers of this array. If there are no such numbers, print a message about it
    public static List<Integer> createArrayOfEvenNumbers(List<Integer> list) {
        int elementsNumber = 0;
        int arrayCounter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                elementsNumber++;
            }
        }
        ArrayList<Integer> finalList = new ArrayList<>(elementsNumber);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                finalList.add(list.get(i));
            }
        }
        if (elementsNumber == 0) {
            System.out.println("Here are no even number");
        }
        System.out.println("Task6 " + finalList);
        return finalList;
    }

    //7. Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать количество замен.
    public static int changeAllElementsToZ(List<Integer> list, int z) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > z) {
                list.set(i, z);
                counter++;
            }
        }
        System.out.println("7: Z=4. " + "LIST: " + list + " Number of Z: " + counter);
        return counter;
    }


    //8. Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
    //8. Array of int is given. Calculate the number of negative, positive and 0 elements.

    public static String calculateTheNumberOfPositiveNegativeNulls(List<Integer> list) {

        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeros = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                positiveNumbers++;
            }
            if (list.get(i) < 0) {
                negativeNumbers++;
            }
            if (list.get(i) == 0) {
                zeros++;
            }
        }
        return "Positive: " + positiveNumbers + " Negative: " + negativeNumbers + " Zeros: " + zeros;
    }

    // 9. Дан массив чисел. Поменять местами наибольший и наименьший элементы.
    // 9 Array of integers ig given. Reverse the biggest and the smallest elements
    public static List<Integer> changeBiggestWithSmallest(ArrayList<Integer> list) {
        int biggest = list.get(0);
        int smallest = list.get(0);
        //find the biggest and the smallest
        for (int i = 0; i < list.size(); i++) {
            if (biggest<list.get(i)) {
                biggest =list.get(i);
            }
            if (smallest>list.get(i)) {
                smallest=list.get(i);
            }
        }
        System.out.println("biggest number " + biggest);
        System.out.println("smallest number " + smallest);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                list.set(i,biggest);
            }else if (list.get(i) == biggest) {
                list.set(i,smallest);
            }
        }

        System.out.println(list);
        return list;

    }
}


