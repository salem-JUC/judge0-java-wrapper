package org.example;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Judge0Client apIconsumer;
    public static void main(String[] args) {

        apIconsumer = new Judge0Client.ClientBuilder()
                .setBaseUrl("")
                .setApiKey("")
                .setRapidapiHost("judge0-ce.p.rapidapi.com")
                .build();

//        try {
//            apIconsumer.printLanguages();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


    }


}