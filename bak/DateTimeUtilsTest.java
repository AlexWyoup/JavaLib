package com.fengwenyi.javalib;

import com.fengwenyi.javalib.constant.DateTimeFormat;
import com.fengwenyi.javalib.util.DateTimeUtils;
import com.fengwenyi.javalib.util.PrintUtils;
import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author Erwin Feng
 * @since 2019-05-29 18:18
 */
public class DateTimeUtilsTest {

    @Test
    public void instantFormat() {
        String format = DateTimeUtils.format(Instant.now(), DateTimeFormat.yyyy_MM_dd_HH_mm_ss);
        PrintUtils.info(format);
    }

    @Test
    public void date2Instant() {
        String date = "2019-07-09";
        Instant instant = DateTimeUtils.parseDate(date);
        PrintUtils.info(instant);
    }

    @Test
    public void dateTime2Instant() {
        String dateTime = "2019-07-09 18:00:00";
        Instant instant = DateTimeUtils.parseDateTime(dateTime, "yyyy-MM-dd HH:mm:ss");
        PrintUtils.info(instant);
    }

    // 当前月
    @Test
    public void getMonth() {
        // curr: 2019-11-20
        Month month = LocalDate.now().getMonth();
        PrintUtils.info(month); //NOVEMBER
        PrintUtils.info(month.getValue()); // 11

        int monthValue = LocalDate.now().getMonthValue();
        PrintUtils.info(monthValue); // 11

        Integer currentMonth = DateTimeUtils.getMonth();
        PrintUtils.info(currentMonth); // 11
    }

    @Test
    public void des() {
        LocalDateTime dateTime = LocalDateTime.of(2019, 12, 6, 23, 0);
        PrintUtils.info(dateTime);
        String message = DateTimeUtils.descPastTimeEn(dateTime);
        PrintUtils.info(message);
    }

}
