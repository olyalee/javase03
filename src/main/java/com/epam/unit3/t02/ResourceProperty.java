package com.epam.unit3.t02;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceProperty {
    private ResourceBundle bundle_faq;
    private ResourceBundle bundle_answers;

    public ResourceProperty(Locale locale) {
        bundle_faq = ResourceBundle.getBundle("faq", locale);
        bundle_answers = ResourceBundle.getBundle("answers", locale);
    }

    public String getQuestion(String key){
        return bundle_faq.getString(key);
    }

    public String getAnswer(String key){
        return bundle_answers.getString(key);
    }
}
