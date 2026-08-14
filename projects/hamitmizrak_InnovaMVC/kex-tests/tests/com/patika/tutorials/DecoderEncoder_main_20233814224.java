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

public class DecoderEncoder_main_20233814224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4048;

    public DecoderEncoder_main_20233814224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4048 = (Object[]) newArray("java.lang.String", 6);
        setElement(term4048, 0, "SJiQaLvSKv");
        setElement(term4048, 1, "OEXDRUKcFl");
        setElement(term4048, 2, "RYdKCNNMBR");
        setElement(term4048, 3, "yGtHPyvYiQ");
        setElement(term4048, 4, "MvRIxilFMJ");
        setElement(term4048, 5, "iNwOJRBEjp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.tutorials.DecoderEncoder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4048;
        callMethod(klass, "main", argTypes, null, args);
    }

};


