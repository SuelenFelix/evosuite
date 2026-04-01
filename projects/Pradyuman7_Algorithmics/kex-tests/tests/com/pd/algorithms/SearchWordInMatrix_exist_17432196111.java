package com.pd.algorithms;

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
import static com.pd.algorithms.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SearchWordInMatrix_exist_17432196111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;
     Object term120;

    public SearchWordInMatrix_exist_17432196111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119 = newInstance(Class.forName("com.pd.algorithms.SearchWordInMatrix"));
        term120 = (Object[]) newArray("[C", 5);
        char[] term121 = (char[]) newCharArray(2);
        char[] term124 = (char[]) newCharArray(3);
        char[] term128 = (char[]) newCharArray(1);
        char[] term130 = (char[]) newCharArray(0);
        char[] term131 = (char[]) newCharArray(2);
        setCharElement(term121, 0, 'P');
        setCharElement(term121, 1, 'A');
        setElement(term120, 0, term121);
        setCharElement(term124, 0, 'E');
        setCharElement(term124, 1, 'B');
        setCharElement(term124, 2, 't');
        setElement(term120, 1, term124);
        setCharElement(term128, 0, 'n');
        setElement(term120, 2, term128);
        setElement(term120, 3, term130);
        setCharElement(term131, 0, 'Z');
        setCharElement(term131, 1, 't');
        setElement(term120, 4, term131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.SearchWordInMatrix");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term120;
        args[1] = "PAEBtnZtTD";
        callMethod(klass, "exist", argTypes, term119, args);
    }

};


