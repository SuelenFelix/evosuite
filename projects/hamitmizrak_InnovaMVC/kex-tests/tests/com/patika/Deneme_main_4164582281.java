package com.patika;

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
import static com.patika.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Deneme_main_4164582281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7482;

    public Deneme_main_4164582281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7482 = (Object[]) newArray("java.lang.String", 4);
        setElement(term7482, 0, "lLiSiPCciB");
        setElement(term7482, 1, "PsMKIIEwdR");
        setElement(term7482, 2, "RbQmXqfXAT");
        setElement(term7482, 3, "fcCAsvfBbe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.Deneme");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7482;
        callMethod(klass, "main", argTypes, null, args);
    }

};


