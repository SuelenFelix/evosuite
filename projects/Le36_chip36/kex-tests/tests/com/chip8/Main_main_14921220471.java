package com.chip8;

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
import static com.chip8.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Main_main_14921220471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5663935;

    public Main_main_14921220471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5663935 = (Object[]) newArray("java.lang.String", 7);
        setElement(term5663935, 0, "dAEiXUxDrI");
        setElement(term5663935, 1, "AgQWngzXPH");
        setElement(term5663935, 2, "EZJmAIzdHM");
        setElement(term5663935, 3, "LAOkeXXkDr");
        setElement(term5663935, 4, "YkZqFgrgVM");
        setElement(term5663935, 5, "QEJBgSNviH");
        setElement(term5663935, 6, "bjigisSVNp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.Main");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5663935;
        callMethod(klass, "main", argTypes, null, args);
    }

};


