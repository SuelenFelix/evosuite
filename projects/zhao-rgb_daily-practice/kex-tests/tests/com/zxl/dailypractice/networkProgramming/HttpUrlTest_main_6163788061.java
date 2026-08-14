package com.zxl.dailypractice.networkProgramming;

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
import static com.zxl.dailypractice.networkProgramming.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HttpUrlTest_main_6163788061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term707;

    public HttpUrlTest_main_6163788061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term707 = (Object[]) newArray("java.lang.String", 7);
        setElement(term707, 0, "dWRymuLBtr");
        setElement(term707, 1, "AijpHYOFuy");
        setElement(term707, 2, "SbAoxhfrkn");
        setElement(term707, 3, "kuTXqwMtDB");
        setElement(term707, 4, "Ghbwtircqb");
        setElement(term707, 5, "xrwlQZdwCp");
        setElement(term707, 6, "IDCWpPLRkE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.networkProgramming.HttpUrlTest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term707;
        callMethod(klass, "main", argTypes, null, args);
    }

};


