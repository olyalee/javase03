package com.epam.unit3.t1;


import com.epam.unit3.t01.CrazyLogger;
import org.junit.Test;

public class CrazyLoggerTest {
    @Test
    public void crazyTest(){
        CrazyLogger logger = new CrazyLogger();
        logger.addMessage("Hi");
        logger.addMessage("How are you?");
        logger.addMessage("Let's make test");

        logger.showLog();
        System.out.println();
        logger.searchInLog("Hi");
    }

}
