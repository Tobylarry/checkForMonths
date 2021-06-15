public class isLeapYear {
    public static void main(String[] args) {
        isLeapYear(2000);
        getDaysInMonth(2, 2000);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year%4 == 0 && year%400 ==0 || year%4 == 0 && year%100 != 0 || year%400 == 0) {
                System.out.println("true");
                return true;
            }
            else{
                return false;
            }
        }
        else { return false; }
    }
    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        else {
            switch(month){
                case 1:
                    System.out.println("31");
                    return 31;

                case 2:
                    if (year%4 == 0 && year%400 ==0 || year%4 == 0 && year%100 != 0 || year%400 == 0){
                        System.out.println("29");
                        return 29;
                    }else{
                        System.out.println(28);
                        return 28;
                    }


                case 3:
                    return 31;

                case 4:
                    return 30;

                case 5:
                    return 31;

                case 6:
                    return 30;

                case 7:
                    return 31;

                case 8:
                    return 31;

                case 9:
                    return 30;

                case 10:
                    return 31;

                case 11:
                    return 30;

                case 12:
                    return 31;

                default:
                    return 40;

            }
        }

    }
}









