package com.zxl.dailypractice.card.two.april.april3;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.zxl.dailypractice.card.two.april.april3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;

public class Solution_nextGreatestLetter_11908389851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term8;

    public Solution_nextGreatestLetter_11908389851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april3.Solution"));
        term2 = (char[]) newCharArray(5);
        setCharElement(term2, 0, 'P');
        setCharElement(term2, 1, 'A');
        setCharElement(term2, 2, 'E');
        setCharElement(term2, 3, 'B');
        setCharElement(term2, 4, 't');
        term8 = new Character('n');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.april.april3.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term8;
        callMethod(klass, "nextGreatestLetter", argTypes, term1, args);
    }

};


