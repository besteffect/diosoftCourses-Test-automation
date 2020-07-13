public class Level2 {
    /*

2. Вывести название месяца по его номеру. Написать метод, который будет принимать на вход число и выводить стрингу.
Пример: получили 7, вывели July.
3. Дан массив букв. Вывести массив, где все большие буквы будут заменены на маленькие.
Пример: получили {‘a’, ‘Z’, ‘E’, ‘d’}, вывели {‘a’, ‘z’, ‘e’, ‘d’}.
4. Дано число. Вывести все простые числа в диапазоне от 2 до этого числа включительно.
5. Дано две строки. Определить является ли вторая строка подстрокой в строке.
Для написания метода НЕ ИСПОЛЬЗОВАТЬ стандартные методы по работе с подстрокой Java. Пример: “abcdef” и “bcd”, метод
должен ввернуть true.
6.  Дана строка с набором операций. Написать метод, который будет рассчитывать результат выполнения всех операций,
учитывая приоритет операций. Операции только +,-,*,/.  Например: получаем на вход «2+5+9*10+10/5-12», возвращаем 87.
     */
    public static void main(String[] args) {
        sortArrayByIncrease(new int[]{0, -1, 4, 1, 52, 2, 5, 6, -4, 67, 0, 0, -33});
        writeMonth(3);
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

}
