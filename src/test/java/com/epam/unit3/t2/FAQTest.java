package com.epam.unit3.t2;

import com.epam.unit3.t02.FAQ;
import java.util.Scanner;
import org.junit.Test;

/**
 * Created by Olya Lee on 31.10.2016.
 */
public class FAQTest {

    @Test
    public void faqTest(){
        FAQ faq = new FAQ();
        faq.chooseLocale();
        faq.showQuestions();
        faq.chooseQuestionAndGetAnswer();
    }

}

