import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCaculatorTest {

    @Test
    @DisplayName("case 1/1/2018")
    void findNextDay1month1year2018() {
        int day = 1;
        int month =1;
        int year = 2018;
        String expect = "2/1/2018";
        String result = NextDayCaculator.findNextDay(day,month,year);
        assertEquals(expect,result);
    }
    @Test
    @DisplayName("case 31/1/2018")
    void findNextDay31month1year2018() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expect = "1/2/2018";
        String result = NextDayCaculator.findNextDay(day, month, year);
        assertEquals(expect, result);
    }
    @Test
    @DisplayName("case 30/4/2018")
    void findNextDay30month4year2018() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expect = "1/5/2018";
        String result = NextDayCaculator.findNextDay(day, month, year);
        assertEquals(expect, result);
    }
    @Test
    @DisplayName("case 28/2/2018")
    void findNextDay28month2year2018() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expect = "1/3/2018";
        String result = NextDayCaculator.findNextDay(day, month, year);
        assertEquals(expect, result);
    }
    @Test
    @DisplayName("case 29/2/2020")
    void findNextDay29month2year2020() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expect = "1/3/2020";
        String result = NextDayCaculator.findNextDay(day, month, year);
        assertEquals(expect, result);
    }
    @Test
    @DisplayName("case 31/12/2018")
    void findNextDay31month12year2018() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expect = "1/1/2019";
        String result = NextDayCaculator.findNextDay(day, month, year);
        assertEquals(expect, result);
    }


}