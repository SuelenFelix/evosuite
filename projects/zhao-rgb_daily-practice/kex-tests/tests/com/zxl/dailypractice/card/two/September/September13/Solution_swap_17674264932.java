package com.zxl.dailypractice.card.two.September.September13;

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
import static com.zxl.dailypractice.card.two.September.September13.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Solution_swap_17674264932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;
     Object term5;
     Object term11;
     Object term13;

    public Solution_swap_17674264932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September13.Solution"));
        term5 = (char[]) newCharArray(5);
        setCharElement(term5, 0, 'P');
        setCharElement(term5, 1, 'A');
        setCharElement(term5, 2, 'E');
        setCharElement(term5, 3, 'B');
        setCharElement(term5, 4, 't');
        term11 = new Integer(1162663216);
        term13 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.September.September13.Solution");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term5;
        args[1] = term11;
        args[2] = term13;
        callMethod(klass, "swap", argTypes, term4, args);
    }

};


