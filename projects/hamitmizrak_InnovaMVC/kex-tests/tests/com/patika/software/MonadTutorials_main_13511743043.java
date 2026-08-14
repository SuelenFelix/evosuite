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

public class MonadTutorials_main_13511743043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2056;

    public MonadTutorials_main_13511743043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2056 = (Object[]) newArray("java.lang.String", 4);
        setElement(term2056, 0, "rYbtIDVdnd");
        setElement(term2056, 1, "UKAReurpHG");
        setElement(term2056, 2, "WVRMUmrljA");
        setElement(term2056, 3, "NTlKJDDWlk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.MonadTutorials");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2056;
        callMethod(klass, "main", argTypes, null, args);
    }

};


