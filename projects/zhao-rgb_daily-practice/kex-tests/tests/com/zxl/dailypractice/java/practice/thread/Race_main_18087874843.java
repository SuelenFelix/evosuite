package com.zxl.dailypractice.java.practice.thread;

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
import static com.zxl.dailypractice.java.practice.thread.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Race_main_18087874843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;

    public Race_main_18087874843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = (Object[]) newArray("java.lang.String", 5);
        setElement(term5, 0, "sjlJAEtRrb");
        setElement(term5, 1, "MuLcgQHgqz");
        setElement(term5, 2, "xxtlPwDYFs");
        setElement(term5, 3, "jJCZpVmanW");
        setElement(term5, 4, "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.java.practice.thread.Race");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5;
        callMethod(klass, "main", argTypes, null, args);
    }

};


