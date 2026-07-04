package com.org;

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
import static com.org.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FaceSystemApplication_main_11700743381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40008;

    public FaceSystemApplication_main_11700743381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40008 = (Object[]) newArray("java.lang.String", 7);
        setElement(term40008, 0, "erGLJPrSFu");
        setElement(term40008, 1, "hClrkDuclb");
        setElement(term40008, 2, "RQGjkjoJid");
        setElement(term40008, 3, "fqFCsfbRxM");
        setElement(term40008, 4, "VxtdFZGhCL");
        setElement(term40008, 5, "NdCqWFAKtC");
        setElement(term40008, 6, "brggoDHwgJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.FaceSystemApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term40008;
        callMethod(klass, "main", argTypes, null, args);
    }

};


