package org.example;

import org.example.consumer.Judge0Client;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Judge0Client apIconsumer = new Judge0Client();
    public static void main(String[] args) {

        SubmissionBuilder submissionBuilder = new SubmissionBuilder();
        Submission submission = submissionBuilder.setExpectedOutput("Hellow World")
                .build();


    }


}