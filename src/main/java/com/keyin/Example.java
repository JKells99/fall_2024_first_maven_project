package com.keyin;

import java.util.Calendar;
import java.util.Date;

public class Example {

    public Date getTodaysDate() {
        return new Date();
    }

    public int getCurrentMonth() {
        return Calendar.getInstance().get(Calendar.MONTH);
    }
}
