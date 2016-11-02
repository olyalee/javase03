package com.epam.unit3.t3;

import com.epam.unit3.t03.RegExp;
import org.junit.Test;

import java.io.IOException;

public class RegExpTest {
    @Test
    public void tryGet() throws IOException {
        final String filename = "c:\\EPAM\\javase03\\src\\main\\resources\\Java.SE.03.Information handling_task_attachment.html";
        final String codetype = "cp1251";

        RegExp re = new RegExp();
        String text = re.read(filename,codetype);

        re.sentWithPic(text);
        System.out.println(re.isPicsInRightOrder());

//        System.out.println(text);
    }
}
