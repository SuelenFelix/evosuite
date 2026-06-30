package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MonthlyWorkSheet_init_4317352461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27301;
     Object term27304;

    public MonthlyWorkSheet_init_4317352461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27301 = (int[]) newIntArray(2);
        setIntElement(term27301, 0, -1963434938);
        setIntElement(term27301, 1, 906181092);
        term27304 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 2);
        Object[] term27305 = (Object[]) newArray("java.lang.String", 5);
        Object[] term27366 = (Object[]) newArray("java.lang.String", 4);
        setElement(term27305, 0, "zLMTXDQHYH");
        setElement(term27305, 1, "PqywFWJlpE");
        setElement(term27305, 2, "OzXRsFGTIp");
        setElement(term27305, 3, "TjWpyghUWN");
        setElement(term27305, 4, "dkZFDZxcde");
        setElement(term27304, 0, term27305);
        setElement(term27366, 0, "WXcZEtUKlI");
        setElement(term27366, 1, "IkpjUOuWQU");
        setElement(term27366, 2, "boSSpezHeU");
        setElement(term27366, 3, "OUeBWNTQDh");
        setElement(term27304, 1, term27366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.MonthlyWorkSheet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "zgKiINdgNu";
        args[1] = term27301;
        args[2] = term27304;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


