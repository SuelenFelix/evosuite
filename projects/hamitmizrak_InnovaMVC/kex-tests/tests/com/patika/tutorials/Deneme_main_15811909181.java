package com.patika.tutorials;

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
import static com.patika.tutorials.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Deneme_main_15811909181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3008;

    public Deneme_main_15811909181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3008 = (Object[]) newArray("java.lang.String", 7);
        setElement(term3008, 0, "uWHnvSvaPl");
        setElement(term3008, 1, "kBdSllIBVz");
        setElement(term3008, 2, "TJmVBGfTML");
        setElement(term3008, 3, "tPlsykYBqO");
        setElement(term3008, 4, "bLPjGVBhlX");
        setElement(term3008, 5, "whBvTVIIlC");
        setElement(term3008, 6, "IgRJUzaCwW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.tutorials.Deneme");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3008;
        callMethod(klass, "main", argTypes, null, args);
    }

};


