/**
 2 Вывести название месяца по его номеру. Написать метод, который будет принимать на вход число и выводить стрингу. Пример: получили 7, вывели July.
 http://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
 */
public class PrintMonthNumber {
    public static void main(String[] args) {
        //int month =1;
        printMonthByNumber(1);
    }
            public static String printMonthByNumber(int month){

                String monthName;
                switch (month) { //оператор многозначного выбора
                    case 1:
                        monthName = "January";
                        break;
                    case 2:
                        monthName = "February";
                        break;
                    case 3:
                        monthName = "March";
                        break;
                    case 4:
                        monthName = "April";
                        break;
                    case 5:
                        monthName = "May";
                        break;
                    case 6:
                        monthName = "June";
                        break;
                    case 7:
                        monthName = "July";
                        break;
                    case 8:
                        monthName = "August";
                        break;
                    case 9:
                        monthName = "September";
                        break;
                    case 10:
                        monthName = "October";
                        break;
                    case 11:
                        monthName = "November";
                        break;
                    case 12:
                        monthName = "December";
                        break;
                    default:
                        monthName = "Invalid month";
                        break;
                }
                System.out.println("The name of the month is " + monthName);
                return monthName;
            }
        }



