package com.app.sr;

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
import static com.app.sr.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SampleRoomApplication_main_8183888141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1381;

    public SampleRoomApplication_main_8183888141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1381 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1381, 0, "ieCtQFdkii");
        setElement(term1381, 1, "dEnhdmILtU");
        setElement(term1381, 2, "hoicvmsovO");
        setElement(term1381, 3, "eqJfYWRaEL");
        setElement(term1381, 4, "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.sr.SampleRoomApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1381;
        callMethod(klass, "main", argTypes, null, args);
    }

};


