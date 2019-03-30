/**
 2 Вывести название месяца по его номеру. Написать метод, который будет принимать на вход число и выводить стрингу. Пример: получили 7, вывели July.
 http://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
 */
public class PrintMonthNumber {
    public static void main(String[] args){
        printMonthByNumber();}
public static void printMonthByNumber(){
    int month = 5;
    String monthNmae;
    switch (month) { //оператор многозначного выбора
        case 1:  monthNmae = "January";
            break;
        case 2:  monthNmae = "February";
            break;
        case 3:  monthNmae = "March";
            break;
        case 4:  monthNmae = "April";
            break;
        case 5:  monthNmae = "May";
            break;
        case 6:  monthNmae = "June";
            break;
        case 7:  monthNmae = "July";
            break;
        case 8:  monthNmae = "August";
            break;
        case 9:  monthNmae = "September";
            break;
        case 10: monthNmae = "October";
            break;
        case 11: monthNmae = "November";
            break;
        case 12: monthNmae = "December";
            break;
        default: monthNmae = "Invalid month";
            break;
    }
    System.out.println("The name of the month is "+monthNmae);
}
}


