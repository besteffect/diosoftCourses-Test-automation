import java.util.ArrayList;
import java.util.List;

public class Level1Collections {

    public static void main(String[] args) {
        //  changeAllElementsToZ(new ArrayList<>(Arrays.asList(1, 2, -5, 4, 6, 44, 3, -13, -4, 44)), 4);
        //  System.out.println("Before changed: 1, 4, 1, 3, 76, 34, 3, 2, 53, 2, 43, 3, 43, 76");
        //  changeBiggestWithSmallest(new ArrayList<>(List.of(1, 4, 1, 3, 76, 34, 3, 2, 53, 2, 43, 3, 43, 76)));
        //  printOnlyArrayIisLessOrEqualToI(new ArrayList<>(Arrays.asList(0, 3, 1, 1, 3, 6, 4, 11, 3, 39, 7)));
        //  printAllModuleEqualsM(new ArrayList<>(List.of(23, 12, 2, 1, 4, 1, 17, 11, 44)), 5, 2);
        // changeElementsPlaces(new ArrayList<>(List.of(25, 12, 2, 1, 4, 1, 4, 11, 44)));
        // printAllIncludingNull(List.of(1, 4, -33, 2, 1, 4, 0, 11, 44));
        findFirstMaxElementOfArray(new ArrayList<>(List.of(2, -5, 45, 2, -1, 5, 10, 10, 45, 5)));
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
    public static List<Integer> changeBiggestWithSmallest(List<Integer> list) {
        int biggest = list.get(0);
        int smallest = list.get(0);
        //find the biggest and the smallest
        for (int i = 0; i < list.size(); i++) {
            if (biggest < list.get(i)) {
                biggest = list.get(i);
            }
            if (smallest > list.get(i)) {
                smallest = list.get(i);
            }
        }
        System.out.println("biggest number " + biggest);
        System.out.println("smallest number " + smallest);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                list.set(i, biggest);
            } else if (list.get(i) == biggest) {
                list.set(i, smallest);
            }
        }
        System.out.println(list);
        return list;
    }

    //10. Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i]<=i.
    // With given array of int, print only numbers which qualify the condition arr[i]<=i
    //   int[] arrayI = {0, 3, 1, 1, 3, 6, 4, 11, 3, 39, 7}; //expected [0,1,1,3,4,3,7]
    public static List<Integer> printOnlyArrayIisLessOrEqualToI(List<Integer> list) {
        int count = 0; //count of integers in a new array
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= i) {
                count++;
            }
        }
        System.out.println("Count: " + count);
        List<Integer> finalList = new ArrayList<>(count);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= i) {
                finalList.add(index, list.get(i));
                index++;
            }
        }
        System.out.println(finalList);
        return finalList;
    }

    //11. Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равно L.
    //11. Array of int is given. Print numbers, where remainder of division by M equals to L.
    //(23, 12, 2, 1, 4, 1, 17, 11, 44) Expected: 12, 2, 17
    public static List<Integer> printAllModuleEqualsM(List<Integer> list, int m, int l) {
        int counter = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % m == l) {
                counter++;
            }
        }
        List<Integer> finalList = new ArrayList<>(counter);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % m == l) {
                finalList.add(index, list.get(i));
                index++;
            }
        }
        System.out.println(finalList);
        return finalList;
    }

    //12. Дан массив чисел.  Поменять местами соседние элементы (аrray[0] и аrray[1], аrray[2] и аrray[3], …)
    //12. Array of integers s given. Interchange the position of adjacent elements (аrray[0] and аrray[1], аrray[2] and аrray[3], …)
    public static List<Integer> changeElementsPlaces(List<Integer> list) {
        int temp = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
            i = i + 1;
        }
        System.out.println("List after modification:" + list);
        return list;
    }

    //13. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа, включительно до нуля.
    //13 Array of integers has 0. Print all elements up to 0.
    public static List<Integer> printAllIncludingNull(List<Integer> list) {
        int i = 0;
        int j = 0;
        int count = 0;
        int count1 = 0;
        while (list.get(i) != 0) {
            i++;
            count++;
        }
        //  count = count + 1;
        System.out.println(count);
        List<Integer> list1 = new ArrayList<>(count);
        while (list.get(j) != 0) {
            list1.add(count1, list.get(j));
            j++;
            count1++;
        }
        list1.add(0);

        System.out.println(list1);
        return list1;
    }

    //14. Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).
    //14. Array of integers is given. Find mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).
    //int[] array = {4, -34, -21, 2, 1, 4, 0, 11, 41};
    public static int findMaxEvenPlusMinOdd(List<Integer> list) {
        int sum = 0;
        int biggestEven = 0;
        int biggestOdd = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0 && list.get(i) > biggestEven) {
                biggestEven = list.get(i);
            }

            if (list.get(i) % 2 == 1 && list.get(i) > biggestOdd) {
                biggestOdd = list.get(i);
            }
            sum = biggestEven + biggestOdd;
        }
        System.out.println("Biggest even: " + biggestEven);
        System.out.println("Biggest odd " + biggestOdd);
        return sum;
    }

    //15 Дан массив целых положительных чисел. Найти произведение только тех чисел, которые больше заданного числа М. Если таких нет, то выдать сообщение об этом.
    //15. Given an array of positive integers. Find a product onlyof numbers which are begger than a given M. If there are no such numbers show error message
    public static int findMultiplOfNumbersBuggerThenM(List<Integer> list, int m) {
        int integer = 1;
        int numbersQuantity = 0;
        for (Integer value : list) {
            if (value > m) {
                integer *= value;
                numbersQuantity++;
            }
        }
        if (numbersQuantity == 0) {
            System.out.println("There are not numbers greater than " + m);
        }
        return integer;
    }


    //16 Дан массив положительных и отрицательных чисел. Заменить нулями те числа, величина которых по модулю больше максимального числа (|a[i]| > max{ a[0], a[1], ..., a[n]})
    //16. Given an array of positive and negative numbers. Replace with 0 those numbers whose magnitude is greater than the maximum number (|a[i]| > max{ a[0], a[1], ..., a[n]})
    public static List<Integer> findbiggestnumberbyModule(List<Integer> list) {
        int maxNumber = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxNumber) {
                maxNumber = list.get(i);
            }
        }
        System.out.println("Max number: " + maxNumber);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.set(i, list.get(i) * (-1));
                if (list.get(i) > maxNumber) ;
                list.set(i, 0);
            }
        }
        return list;
    }

    /*17. Дан массив чисел с положительными и отрицательными элементами. Вычислить произведение отрицательных элементов
    P1 и произведение положительных элементов Р2. Сравнить модуль Р2 с модулем Р1 и указать, какое из произведений по модулю больше.
    17 An array of numbers with positive and negative elements is given. Calculate the product of negative elements P1
    and the product of positive elements P2. Compare the module P2 with the module P1 and indicate which of the products modulo is bigger.
     */
    public static String findMultiplOfMinAnMinusNumbers(List<Integer> list) {
        int positiveNumbers = 1;
        int negativeNumbers = 1;
        String result = "Negative numbers multiplication is bigger";
        String result1 = "Positive numbers multiplication is bigger";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                positiveNumbers *= list.get(i);
            }
            if (list.get(i) < 0) {
                negativeNumbers *= list.get(i);
            }
        }
        if (negativeNumbers < 0) {
            negativeNumbers = -negativeNumbers;
        }
        System.out.println("Positive numbers multiplication: " + positiveNumbers);
        System.out.println("Negative numbers multiplication: " + negativeNumbers);
        if (negativeNumbers > positiveNumbers) {

            return result;
        } else return result1;
    }

    // 18 Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и заменить его нулем.
    //18. An array of numbers is given. Among them are equal numbers. Find the first maximum element of the array and replace it with zero.
    public static ArrayList<Integer> findFirstMaxElementOfArray(ArrayList<Integer> list) {
        int firstMax = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > firstMax) {
                firstMax = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == firstMax) {
                list.set(i, 0);
                break;
            }
        }
        System.out.println(firstMax);
        System.out.println(list);
        return list;
    }

    //19. Дан массив чиcел. Образовать новый массив, элементами которого будут элементы исходного, оканчивающиеся на цифру k.
    //19. An array of numbers is given. Create a new array, the elements of which will be the elements of the original, with k in the end.
    public static List<Integer> createNewArrayWhenEndsK(List<Integer> list, int k) {
        int elementsNumber = 0;
        int list1Indexes = 0;
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i) % 10;
            if (a < 0) {
                a = -a;
            }
            if (a == k) {
                elementsNumber++;
            }
        }
        List<Integer> list1 = new ArrayList<>(elementsNumber);
        for (int i = 0; i < list.size(); i++) {
            int b = list.get(i) % 10;
            if (b < 0) {
                b = -b;
            }
            if (b == k) {
                list1.add(list1Indexes, list.get(i));
                list1Indexes++;
            }
        }
        return list1;
    }
}


