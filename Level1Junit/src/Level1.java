/**
 * Created by Smart on 2/7/2015.
 */
public class Level1 {
    public static void main(String[] args) {
//        int findmin1 = 2;
//        int findmin2 = 99;
//        findMinimum(findmin1, findmin2);
//        countSpecificElements();
//        countOfZeronumbersinarray();
//        findWhichIsFirstPositiveorNegative();
//        isArraySorted();
//        createArrayOfEvenNumbers();
//        changeAllElementsToZ();
//        calculateTheNumberOfPositiveNegativeNulls();
 //       changeBiggestWithSmallest(int []array);
//        printOnlyArrayIisLessOrEqualToI();
//        printAllModuleEqualsM(new int[]{23, 12, 2, 1, 4, 1, 17, 11, 44}, 5, 2);
//        changeElementsPlaces(new int[]{25, 12, 2, 1, 4, 1, 4, 11, 44});
//        int[] array = {1, 4, -33, 2, 1, 4, 0, 11, 44};
//        printAllIncludingNull(array); //array for task13
//        findMaxEvenPlusMinOdd(new int[]{4, -34, -21, 2, 1, 4, 0, 11, 41});
//        findMultiplOfNumbersBuggerThenM(new int[]{4, 10, 10, 2, 1, 4, 11, 21}, 10);
//        findbiggestnumberbyModule(new int[]{4, -36, -40, 2, 1, 35, 11, 21});
//        findMultiplOfMinAnMinusNumbers();
//        findFirstMaxElementOfArray();
//       createNewArrayWhenEndsK(new int[]{2, -5, 45, 2, -1, 5, 16, 10, 125, 1015, 45, 5, 12505}, 5);
    }



    // 1 Two numbers are given. Find the minimal one
    public static int findMinimum(int firstNumber, int secondNumber) {
        int minimumNumber;
        if (firstNumber < secondNumber)
            minimumNumber = firstNumber;
        else
            minimumNumber = secondNumber;
        System.out.println(minimumNumber + "-Minimum value");
        return minimumNumber;
    }

    // 2 Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
    public static int countSpecificElements(int[]array) {
        int n = 15; // dimension of array
        int arraySum = 0;// Variable for saving Sum of elements, which is required by findSumDivisibleToK
        int k = 5; //variable which represents that some value(in this case 5) is divisible to integer k
        array = new int[n];
        for (int i = 0; i < array.length; i++) { //for elements from 0 to 15
            array[i] = i; //  assign number to each element of array
        }
        for (int i = 0; i < n; i++) // check if array is divisible to k
            if (array[i] % k == 0)
                arraySum = arraySum + array[i]; // Calculate the sum of array[i] numbers tha are divisible by 5
        System.out.println("Sums is equal to " + arraySum); // print the result
        return arraySum;
    }

    //3 В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
    public static int[] countOfZeronumbersinarray(int[] array) {
       // int[] array = {0, 33, 2, 5, 63, 3, 0, 0, 3, 0, 3, 3, 1, 0};
        int j = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) { //calculate the number of zeros in array
            if (array[i] == 0)
                b++; // b is the variable for counting the number of zeros in array
        }
        int[] array1 = new int[b];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array1[j] = i; //filling in array1 with values
                j++; // incrementally increase
            }
        }
        System.out.println("b is "+b);
        for (int k = 0; k < array1.length; k++) { //printing out the array of k.

            System.out.println("Task3 " +array1[k]);
        }
        return array1;
    }

    //4 Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число встречается раньше – положительное или отрицательное.
    public static String findWhichIsFirstPositiveorNegative(int[] array) {
        // int[] array = {0, 0, -2, -4, 24, 53};
        int firstNumber = 0;
        String result = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                firstNumber = array[i];// taking number from array which is not equal to 0 and assigning it to variable firstNumber
                break; // finding first element which is not equal to zero and breaking the loop
            }
        }
        if (firstNumber > 0) {
            System.out.println("First number is positive and equals to " + firstNumber);// printing number if it's bigger than zero
            result = "First number is positive";
        } else {
            System.out.println("First number is negative and equals to " + firstNumber); // printing number if it's less than zero
            result = "First number is negative";
        }
        return result;
    }


    //5 Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.
    public static String isArraySorted(int[]array) {
      //  int[] array = {7, 8, 12, 22, 33, 51, 63, 64, 55}; //creating array
        boolean isSorted = false;
        String result1=null;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            } else isSorted = true;
        }
        if (isSorted == true) {
            System.out.println("Array is sorted");
            result1 = "Array is sorted";
        } else {
            System.out.println("Array is not sorted");
            result1 = "Array is not sorted";
        }
        return result1;
    }

    // 6 Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести сообщение об этом факте.
    public static int[] createArrayOfEvenNumbers(int[] array) {
       // int[] array = {1, 1, 2, 32, 1, 3, 51, 21};
        int b = 0;
        int j = 0;
        //boolean noEvenNumbers = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                b++;  // b is the variable for counting the number of zeros in array
            }
        }
        int[] array1 = new int[b]; // creating new array1 with b - the number of elements in this array
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array1[j] = array[i]; //filling in array3 with values
                j++; // incrementally increase
            }
        }
        for (int k = 0; k < array1.length; k++) { //printing out the array of k.
            System.out.println(array1[k]);
        }
        if (b == 0) {
            System.out.println("Here are no even number");
        }
        return array1;// доделать для случая если таких чисел нет
    }

    //7. Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать количество замен.
    /*
    Java:
    1) Я могу изменять существующие элементы массива путем присвоения элементу нового значения. Например, array[3]=6 в массиве ниже заменит 4 на 6.
    2) Счетчик. count++ -Подсчитывает количество измененных элементов  цикле for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
    3) Чтоб вывести элементы цикла на экран нужно использовать цикл. В данном случае
     for (int k = 0; k < array.length; k++)
     System.out.println("Row" + k + " " + array[k]);
    4) array[i] -элемент массива
    5) i - индекс элемента массива, array[4]=3- значит 4-й элемент массива равен 3
     */
    public static int changeAllElementsToZ(int[]array) {
       // int[] array = {1, 2, -5, 4, 6, 44, 3, -13, -4, 44};
        int z = 4;
        int count = 0; //variable for counting how many times we interchange values in array with z values
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z; //change elements of array to integer z (one by one)
                count++; //calculates the number of changes
            }
        }
        for (int k = 0; k < array.length; k++) { //printing out the array of k.
            System.out.println("Row" + k + " " + array[k]);
        }
        System.out.println("The number of times z replaces values in array " + count);
        return count;

    }

    //8. Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
    /*
    Java:
    1. (array[i] = 0) это присваивание(инициализация). Это сравнение (array[i] == 0)
     */
    public static String calculateTheNumberOfPositiveNegativeNulls(int[] array) {
        //int[] array = {5, 0, -8, -43, 8, 12, 32, 65, 0, 4, 0, 0};
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        String letter = null;
        String result;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            }
            if (array[i] < 0) {
                negative++;
            }
            if (array[i] == 0) {
                zeros++;
            }
        }
        System.out.println("Number of positive numbers in array " + positive);
        System.out.println("Number of negative numbers in array " + negative);
        System.out.println("Number of zero numbers in array " + zeros);
        result = positive + "," + negative + "," + zeros;
        return result;
    }

    // 9. Дан массив чисел. Поменять местами наибольший и наименьший элементы.
    public static int[] changeBiggestWithSmallest(int[] array) {
       // int[] array = {1, 4, 1, 3, 76, 34, 3, 2, 53, 2, 43, 3, 43, 76};
        int biggest = array[0];
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (biggest < array[i]) {
                biggest = array[i];
            }
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == biggest) {
                array[i] = smallest;
            } else // part of the program started working only after adding else statement. Before it, only the first part worked.
                if (array[i] == smallest) {
                    array[i] = biggest;
                }
        }
        System.out.println("biggest number " + biggest);
        System.out.println("smallest number " + smallest);
        for (int i = 0; i < array.length; i++)
            System.out.println("New array with replaced numbers " + array[i]);
        return array;
    }

    //10. Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i]<=i. (array[1]=2- значит 1-й элемент массива равен
    public static int[] printOnlyArrayIisLessOrEqualToI(int[] array) {
       // int[] array = {25, 1, 2, 1, 2, 1, 4, 11, 44};
        int count=0;
        int count1=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= i) {
                System.out.println("10Task " +array[i]);
                count++;
            }
        }
        int[]array1=new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= i){
               array1[count1]=array[i];
                count1=count1+1;
            }
        }
        return array1;
    }

    //11. Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равно L.
    public static int[] printAllModuleEqualsM(int[] array, int m, int l) {
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % m == l) {  // тут я делю по модулю числа из массива array[i] на m и сравниваю остаток с L
                System.out.println("New array,11task " + array[i]);
                count++;
            }
        }
        System.out.println("New count " + count);
        int[] array1 = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % m == l) {  // тут я делю по модулю числа из массива array[i] на m и сравниваю остаток с L
                array1[count1] = array[i];
                count1 = count1 + 1;
            }
        }
        return array1;
    }

    //12. Дан массив чисел.  Поменять местами соседние элементы (аrray[0] и аrray[1], аrray[2] и аrray[3], …)
    public static int[] changeElementsPlaces(int[] array) {
        int b = 0; //variable for saving temporal values of new array
        for (int i = 0; i < array.length - 1; i++) { // for all array indexes from zero to the last-1
            b = array[i]; //переменная b равняется i-му элементу из массива b
            array[i] = array[i + 1]; //index i from array gets  the value of index i+1
            array[i + 1] = b;// сохраняю значение элемента i+1 в переменную b
            i = i + 1; // element i gets the value of element i+1
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(" " + array[i]);
        }
        return array;
    }

    //13. Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно до нуля.
    public static int[] printAllIncludingNull(int []array) {
       // int[] array = {1, 4, -33, 2, 1, 4, 0, 11, 44};
        int i = 0;
        int count = 0;
        int count1 = 0;
        int i1=0;
        while (array[i] != 0)//!=  is not equal to
        {   //for such case DO WHILE is used. It looks at all elements of array, until while condition is finished.
           // System.out.println("New array is " + array[i]); //Printing out the last number till 0 is found. Additionally, 0 is printed
            i++;
            count++;
        }
       // System.out.println("New array is " + array[i]);//printing out zero number of array.
        count=count+1;
        int[] array1 = new int[count];
        System.out.println("count " + count);
        while (array[i1] != 0) {
            array1[count1] = array[i1];
            i1++;
            count1 = count1+1;
        }
        for (int temp = 0; temp < array1.length; temp++) {
            System.out.println("13 array1 " + array1[temp]);
        }
        return array1;//1. посчитать количество элементов до нуля(count) плюс сам ноль и записать эти значения в новый массив. Его вернуть

    }

    //14. Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).
    public static int findMaxEvenPlusMinOdd(int[] array) {
        //int[] array = {4, -34, -21, 2, 1, 4, 0, 11, 41};
        int biggestEven = array[0];
        int smallestOdd = array[1];
        int sumOfBiggestEvenAndSmallestOdd;
        for (int i = 0; i < array.length; i++) {  // [находим наибольшее парное число (biggest<array[i]) biggest=array[i];
            if ((i % 2 == 0) && (array[i] > biggestEven)) {
                biggestEven = array[i]; //Finding the biggest element in array (i-index)
            }
            if (i % 2 == 0 && array[i] < smallestOdd) {
                smallestOdd = array[i]; //Finding the smallest element
            }
        }
        sumOfBiggestEvenAndSmallestOdd = biggestEven + smallestOdd;
        System.out.println("The biggest Even number of array is " + biggestEven);
        System.out.println("The Smallest Odd number of array is " + smallestOdd);
        System.out.println("The Sum of the biggest Even and smallest Odd " + sumOfBiggestEvenAndSmallestOdd);
        return sumOfBiggestEvenAndSmallestOdd;
    }

    //15 Дан массив целых положительных чисел. Найти произведение только тех чисел, которые больше заданного числа М. Если таких нет, то выдать сообщение об этом.
    public static int findMultiplOfNumbersBuggerThenM(int[] array, int m) {
        //int[] array = {4, 10, 10, 2, 1, 4, 11, 21};// задаем массив
        // int m = 10; // m- переменная, с которой мы сравниваем числа в массиве
        int multiplOfnumbers = 1; //переменная для хранения умноженных чисел, которые больше числа m.
        int counter = 0;// переменная, для хранения количества чисел, которые больше числа m
        String result;
        for (int i = 0; i < array.length; i++) { //цикл со счетчиком (для всех чисел массива от 0-го по порядку до последнего)
            if (array[i] > m) { // если какое-то число из массива больше заданной переменной m
                multiplOfnumbers *= array[i]; //то  multiplOfnumbers равняется умножению каждого чилса из массива, которое больше числа m
                counter++; //подсчет чисел, которые больше числа m
            }
        }
        if (counter == 0) { // если чисел, больших числа m нет, то
            System.out.println("Here are no such numbers"); // выводим сообщение что таких чисел нет
            result = "Here are no such numbers";
        } else
            System.out.println("15Task:The multoplication of numbers is: " + multiplOfnumbers); //если есть - то выводим все эти числа умноженные
        result = "Result: " + multiplOfnumbers;
        return multiplOfnumbers;
    }

    //16 Дан массив положительных и отрицательных чисел. Заменить нулями те числа, величина которых по модулю больше максимального числа (|a[i]| > max{ a[0], a[1], ..., a[n]})
    public static int[] findbiggestnumberbyModule(int[] array) {
        // int[] array = {4, -36, -40, 2, 1, 35, 11, 21}; // задаем массив
        int biggest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (biggest < array[i]) {
                biggest = array[i];//нашел наибольшее число
            }
        }
        System.out.println("Biggest number is " + biggest);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = array[i] * (-1);
                if (array[i] > biggest) {
                    array[i] = 0;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array with changed by module numbers " + array[i]);
        }
        return array; //
    }

    //17 Дан массив чисел с положительными и отрицательными элементы. Вычислить произведение отрицательных элементов P1 и произведение положительных элементов Р2. Сравнить модуль Р2 с модулем Р1 и указать, какое из произведений по модулю больше.
    public static String findMultiplOfMinAnMinusNumbers(int[] array) {
        // int[] array = {2, -5, -450, 2, -1, 5, 10, 10};
        int multiplofMinusNumbers = 1;
        int multiplofPlusNumbers = 1;
        String result = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                multiplofMinusNumbers *= array[i];
            }
            if (array[i] > 0) {
                multiplofPlusNumbers *= array[i];
            }
        }
        if (multiplofMinusNumbers < 0) {
            multiplofMinusNumbers = multiplofMinusNumbers * (-1);
        }
        System.out.println("Minus numbers multiplied " + multiplofMinusNumbers);
        System.out.println("Plus numbers multiplied " + multiplofPlusNumbers);
        if (multiplofMinusNumbers > multiplofPlusNumbers) {
            System.out.println("Multiplication of minus numbers is bigger");
            result = "Multiplication of minus numbers is bigger";
        } else {
            System.out.println("Multiplication of plus numbers is bigger");
            result = "Multiplication of plus numbers is bigger";}
            return result;

    }

    // 18 Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и заменить его нулем.
    public static int[] findFirstMaxElementOfArray(int [] array) {
       // int[] array = {2, -5, 45, 2, -1, 5, 10, 10, 45, 5};
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];// нашли наибольшее число
            }
        }
        System.out.println("Max. Element is " + maxElement);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxElement) {
                array[i] = 0;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("18New array " + array[i]);
        }
        return array;
    }

    //19 Дан массив чиcел. Образовать новый массив, элементами которого будут элементы исходного, оканчивающиеся на цифру k.
    public static int[] createNewArrayWhenEndsK(int[] array, int k) {
        // int[] array = {2, -5, 45, 2, -1, 5, 16, 10, 125, 1015, 45, 5, 12505};
        // int k=5; //  2%5=0.4. Значит что результат будет 4.
        int[] array1;
        int count = 0;
        int count1=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == k) { // делю по модулю на 10 чтоб найти остаток от деления. Если остаток от деления равен 5, то это значит что число заканчивается на 5. В данном случае на 5 нельзя делить, так как 10/5 будет равно 5
                System.out.println("19 New array is " + array[i]); //выводим результат
                count++;
            }
        }
        array1 = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == k) {
                array1[count1] = array[i];
                count1++;
            }
        }
        return array1;
    }
}





