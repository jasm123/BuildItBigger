package com.example;

import java.util.Random;

public class JokeTeller {
    private static String[] jokes=new String[8];
    public static String  tellJoke(){
        jokes[0] = "Q: Why do java programmers wear glasses?\n" +
                "A: Because they don't C.";
        jokes[1] = "Q: How many programmers does it take to change a light bulb? \n" +
                "A: none, that's a hardware problem";
        jokes[2] = "Q: \"Whats the object-oriented way to become wealthy?\"\n" +
                "A: Inheritance";
        jokes[3] = "Q: What do you call a programmer from Finland?\n" +
                "A: Nerdic";
        jokes[4] = "Q: Why did the programmer quit his job?\n" +
                "A: Because he didn't get arrays (a raise)";
        jokes[5]="Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.\n";
        jokes[6]="Anton, do you think I’m a bad mother?\nMy name is Paul.\n" ;
        jokes[7]="Mother: \"How was school today, Patrick?\"\n" +
                "Patrick: \"It was really great mum! Today we made explosives!\"\n"+
                "Mother: \"Ooh, they do very fancy stuff with you these days. And what will you do at school tomorrow?\"\n" +
                "Patrick: \"What school?\"";
        return jokes[new Random().nextInt(jokes.length)];
    }
}
