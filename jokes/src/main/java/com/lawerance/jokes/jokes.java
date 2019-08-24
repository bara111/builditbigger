package com.lawerance.jokes;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class jokes {

    List<String> list = asList(
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
            "My girlfriend says that I am snoopy. But OK, maybe she meant it differently when she wrote it in her diary.",
            "Today I found my first grey pubic hair. I got really excited, but not as much as the other people in the lift.",
            "Don’t be sad when a bird craps on your head. Be happy that dogs can’t fly."
    );

    public String getJoke(){
        Random random = new Random();

        String randomJoke = list.get(random.nextInt(list.size()));

        return  randomJoke;
    }}