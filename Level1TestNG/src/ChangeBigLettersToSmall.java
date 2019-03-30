/**
 3 Дан массив букв. Вывести массив, где все большие буквы будут заменены на маленькие. Пример: получили {‘a’, ‘Z’, ‘E’, ‘d’}, вывели {‘a’, ‘z’, ‘e’, ‘d’}.
 */
public class ChangeBigLettersToSmall {
    public static void main(String[] args) {
       // changeBigLettersToSmall(array); //calling changeBigLettersToSmall from the method main
    }
    public static char[] changeBigLettersToSmall(char[] array) { //creating method changeBigLettersToSmall
       // char[] array = {'A', 'n', 'b', 'v', 'F', 'F', 'v', 'K'};
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'A' && array[i] <= 'Z') {
                array[i] += 32;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("New array is " + array[i]);// Я сделал для частного лсучая где мне известны буквы. Как сделать если элементы массива не заданы явно - еще не разобрался
        }
        return array;
    }
}

