package com.epam.unit3.t01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

/* Задание 1. Строковые классы

   Необходимо создать класс CrazyLogger, ведущий журнал лога, используя как накопитель объект типа StringBuilder.
   Логгер должен содержать методы поиска определенной информации в таком логе [с возможностью вывода ее в поток ввода вывода].
   Информацию логгер хранит в форматированном виде: dd-mm-YYYY : hh-mm – message;.
 */

public class CrazyLogger {

    StringBuilder log;
    SimpleDateFormat dateFormat;

    public CrazyLogger() {
        log = new StringBuilder();
        dateFormat = new SimpleDateFormat("dd-MM-yyyy : hh-mm");
    }

    //add to log
    public void addMessage(String s){
        Date date = new Date();
        log.append(dateFormat.format(date)+" – " + s + "; ");
    }

    //print whole log
    public void showLog(){
        System.out.println(log);
    }

    //find in log
    public void searchInLog(String textToFind){
        String[] logToSeek = log.toString().split(";");
        for (String s:logToSeek) {
            if(s.contains(textToFind)){
                System.out.println(s);
            }
        }
    }
}
