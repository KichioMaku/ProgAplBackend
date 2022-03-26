package com.company;

import java.util.Date;
import java.util.TimeZone;

public class Zadanie5 {

    public String data() {
        return (new Date()).toString();
    }

    public String dataGMT(){
        Date now = new Date();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        return now.toString();
    }
    public String dataUTC(){
        Date now = new Date();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        return now.toString();
    }
}
