public class NextDayCaculator {

    public static final int FIRSTOFMONTH = 1;
    public static final int LASTMONTH = 12;

    public static String findNextDay(int day, int month, int year) {

        int LASTOFMONTH = getLastofmonth(month,year);

        if (day == LASTOFMONTH && month== LASTMONTH){
            day = FIRSTOFMONTH;
            month= FIRSTOFMONTH;
            year++;
        }else if(day==LASTOFMONTH){
            month ++;
            day= FIRSTOFMONTH;
        }else {
            day++;
        }
        String result = (day + "/" + month + "/" + year);
        return result;
    }

    private static int getLastofmonth(int month,int year) {
        int LASTOFMONTH=0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                LASTOFMONTH = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                LASTOFMONTH =30;
                break;
            case 2:
                if(isLeapYear(year)){
                        LASTOFMONTH =29;
                    }
                else {
                    LASTOFMONTH = 28;
                }
        }
        return LASTOFMONTH;
    }
    public static boolean isLeapYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivsibleBy400 = year % 400 == 0;
                if (isDivsibleBy400)
                    return true;
            } else {
                return true;
            }
        }
        return false;
    }
}
