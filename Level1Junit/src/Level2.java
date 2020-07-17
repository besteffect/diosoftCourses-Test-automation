public class Level2 {
    /*
5. Дано две строки. Определить является ли вторая строка подстрокой в строке.
Для написания метода НЕ ИСПОЛЬЗОВАТЬ стандартные методы по работе с подстрокой Java. Пример: “abcdef” и “bcd”, метод
должен ввернуть true.
6.  Дана строка с набором операций. Написать метод, который будет рассчитывать результат выполнения всех операций,
учитывая приоритет операций. Операции только +,-,*,/.  Например: получаем на вход «2+5+9*10+10/5-12», возвращаем 87.
     */
    public static void main(String[] args) {
        //  sortArrayByIncrease(new int[]{0, -1, 4, 1, 52, 2, 5, 6, -4, 67, 0, 0, -33});
        // writeMonth(3);
        // makeLowerCase(new String[]{"d", "f", "F", "A", "a", "v", "W"});
        //  printPrimeNumbers(47);
        System.out.println(defineSubstring("Hi name is", "name"));
    }

    // 1. Дан массив чисел. Отсортировать массив по возрастанию.
    // Sort array by increase
    public static int[] sortArrayByIncrease(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int item : array) {
            System.out.print(item + " ");
        }
        return array;
    }

    // 2. Вывести название месяца по его номеру. Написать метод, который будет принимать на вход число и выводить стрингу.
    public static String writeMonth(int number) {
        String month;
        switch (number) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Incorrect input";
        }

        System.out.println("\n" + month);
        return month;
    }

    // 3. Дан массив букв. Вывести массив, где все большие буквы будут заменены на маленькие.
    //        Пример: получили {‘a’, ‘Z’, ‘E’, ‘d’}, вывели {‘a’, ‘z’, ‘e’, ‘d’}.
    public static char[] makeLowerCase(String[] input) {

        StringBuilder builder = new StringBuilder();
        for (String s : input) {
            builder.append(s);
        }
        String fullString = builder.toString();
        char currentCharacter = 0;
        char[] output = new char[fullString.length()];
        for (int i = 0; i < fullString.length(); i++) {
            currentCharacter = fullString.charAt(i);
            if (Character.isUpperCase(currentCharacter)) {
                output[i] = Character.toLowerCase(currentCharacter);

            } else {
                output[i] = currentCharacter;
            }
        }
        for (int j = 0; j < output.length; j++) {
            System.out.println(output[j]);
        }
        return output;
    }

    //4. Дано число. Вывести все простые числа в диапазоне от 2 до этого числа включительно.
    public static int[] printPrimeNumbers(int input) {
        int[] array = new int[input + 1]; //create array with input number of indexes+number itself
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < array.length; i++) { //fill array with numbers
            array[i] = i;
            count++;
        }
        for (int item : array) {
            System.out.print(" " + item); //print array
        }


        int[] finalArray = new int[input + 1];
        System.out.println("\n" + "Number of elements in our array: " + count);
//check if number if divisions by j is not bigger than 2
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1) {
                boolean isPrime = true;
                for (int j = 0; j < i; j++) {
                    if (array[j] > 1 && array[i] % array[j] == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    finalArray[count1++] = array[i];
                }

            }
        }
        for (int item : finalArray) {
            if (item != 0)
                System.out.print(item + " ");
            else {
                break;
            }
        }
        return finalArray;
    }

    //    5. Дано две строки. Определить является ли вторая строка подстрокой в строке.
//    Для написания метода НЕ ИСПОЛЬЗОВАТЬ стандартные методы по работе с подстрокой Java. Пример: “abcdef” и “bcd”, метод
//    должен ввернуть true.
/*    public static boolean defineSubstring(String mainString, String substr) {
        int k = 0;
        if (mainString.length() < substr.length()) {
            return false;
        }
        boolean isSubstring = false;
        char[] mainArChar = mainString.toCharArray();
        char[] subArChar = substr.toCharArray();
        for (int i = 0; i < mainArChar.length - 1; i++) {
            if (mainArChar[i] == subArChar[k] && k < subArChar.length - 1) {
                k++;
                isSubstring = true;
                if (k == subArChar.length - 1) {
                    isSubstring = true;
                    break;
                }
            } else {
                isSubstring = false;
                //break;
                //System.out.print(isSubstring);

            }
        }
        System.out.print(isSubstring);
        return isSubstring;
    }
*/
     static boolean defineSubstring(String mainString, String substr) {
        int matchCount = 0;
        boolean isSubString=true;
        if (mainString.length() < substr.length()) {
            return false;
        }
        char[] mainArChar = mainString.toCharArray();
        char[] subArChar = substr.toCharArray();
        for (int i = 0; i < mainArChar.length; i++) {
            if (mainArChar[i] == subArChar[matchCount]) {
                ++matchCount;
            } else matchCount = 0;

            if (matchCount == subArChar.length) {
                return true;
            }
        }
        return false;
    }
}
