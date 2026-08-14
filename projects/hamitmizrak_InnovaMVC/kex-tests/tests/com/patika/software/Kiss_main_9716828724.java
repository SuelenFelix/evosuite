package com.patika.software;

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
import static com.patika.software.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Kiss_main_9716828724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term837;

    public Kiss_main_9716828724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term837 = (Object[]) newArray("java.lang.String", 5);
        setElement(term837, 0, "pJbnHTYrxn");
        setElement(term837, 1, "iIRsCSYqXH");
        setElement(term837, 2, "nghfqDXyCG");
        setElement(term837, 3, "WBAOTqErtm");
        setElement(term837, 4, "PqtVXXZMqK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.Kiss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term837;
        callMethod(klass, "main", argTypes, null, args);
    }

};


