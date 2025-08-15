package com.judge0.wrapper;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Judge0Client apIconsumer;
    public static void main(String[] args) {

        apIconsumer = new Judge0Client.Builder()
                .setBaseUrl("https://judge0-ce.p.rapidapi.com")
                .setApiKey("64431d57cbmsh5e695d9da960983p1ca418jsn067194f9b2fa")
                .setRapidapiHost("judge0-ce.p.rapidapi.com")
                .build();
        // source code = hellow world in java in trible """
        String helloWorld = """
                public class Main {
            public static void main(String[] args) {
                System.out.println("Hello, World!");
            }
        }
        """;
        // addition = java code two read two numbers and print addtion of two numbers
        String addition = """
                import java.util.Scanner;
                public class Main {
                    public static void main(String[] args) {
                        Scanne scanner = new Scanner(System.in);
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();
                        System.out.println(a + b);
                    }
                }
                """;
//        Submission submission = new Submission.Builder()
//                .setLanguageId(62)
//                .setSourceCode(addition)
//                .setStdin("5 10")
//                .setExpectedOutput("5")
//                .build();
//        String token;
        try {
            Language language = apIconsumer.getLanguageById(62);
            System.out.println(language.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}