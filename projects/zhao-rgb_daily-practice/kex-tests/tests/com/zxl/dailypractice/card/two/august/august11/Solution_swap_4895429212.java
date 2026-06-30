package com.zxl.dailypractice.card.two.august.august11;

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
import static com.zxl.dailypractice.card.two.august.august11.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Solution_swap_4895429212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;
     Object term25;
     Object term31;
     Object term33;

    public Solution_swap_4895429212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august11.Solution"));
        term25 = (char[]) newCharArray(5);
        setCharElement(term25, 0, 'P');
        setCharElement(term25, 1, 'A');
        setCharElement(term25, 2, 'E');
        setCharElement(term25, 3, 'B');
        setCharElement(term25, 4, 't');
        term31 = new Integer(568599855);
        term33 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.august.august11.Solution");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term25;
        args[1] = term31;
        args[2] = term33;
        callMethod(klass, "swap", argTypes, term24, args);
    }

};


