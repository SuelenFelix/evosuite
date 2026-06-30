package com.meteergin.medium.stream;

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
import static com.meteergin.medium.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Sample_main_19125816031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1159;

    public Sample_main_19125816031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1159 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1159, 0, "xLbjWUgOIL");
        setElement(term1159, 1, "jDtqGUpnZN");
        setElement(term1159, 2, "nGKItKLYNC");
        setElement(term1159, 3, "UiUYnPrcCi");
        setElement(term1159, 4, "UoYtihxVaS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.Sample");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1159;
        callMethod(klass, "main", argTypes, null, args);
    }

};


