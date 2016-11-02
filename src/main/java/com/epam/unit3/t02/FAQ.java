package com.epam.unit3.t02;

import java.util.Locale;
import java.util.Scanner;

/*Задание 2. Locale и ResourceBundle

Разработать приложение, позволяющее по выбору пользователя использовать русский или английский язык, для отображения информации.
Приложение должно представлять собой перечень вопросов под номерами (на английском или русском соответственно).
Выбрав номер вопроса пользователь может узнать ответ на него.

 */
public class FAQ {
    ResourceProperty myBundle;

    //Choosing language (ru/eng)
    public void chooseLocale(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please, choose language: (E)nglish, (R)ussian");
        String input = in.next();
        if(input.equalsIgnoreCase("e")){
            myBundle = new ResourceProperty(new Locale("en", "US"));
            System.out.println("English");
        }
        else if(input.equalsIgnoreCase("r")){
            myBundle = new ResourceProperty(new Locale("ru", "RU"));
            System.out.println("Russian");
        }else{
            myBundle = new ResourceProperty(new Locale("en", "US"));
            System.out.println("The input was incorrect, so language is set automatically to English");
        }
    }

    //Show questions
    public void showQuestions(){
        System.out.println("1 " + myBundle.getQuestion("faq.key1"));
        System.out.println("2 " + myBundle.getQuestion("faq.key2"));
    }

    //Choosing a number of question
    public void chooseQuestionAndGetAnswer() {
        String question = "";
        System.out.println("Choose the number of the question:");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(myBundle.getAnswer("answers.value"+input));
    }

    public static void main(String [] args){
        FAQ faq = new FAQ();
        faq.chooseLocale();
        faq.showQuestions();
        faq.chooseQuestionAndGetAnswer();
    }
}
