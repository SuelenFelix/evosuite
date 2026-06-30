package com.zxl.dailypractice;

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
import static com.zxl.dailypractice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DailyPracticeApplication_main_12419317471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178179;

    public DailyPracticeApplication_main_12419317471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178179 = (Object[]) newArray("java.lang.String", 3);
        setElement(term178179, 0, "SchXFoqYFy");
        setElement(term178179, 1, "MnHKbTZBTr");
        setElement(term178179, 2, "xCNDHQZBKx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.DailyPracticeApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term178179;
        callMethod(klass, "main", argTypes, null, args);
    }

};


