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

public class LombokTutorials_main_8035697991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1428;

    public LombokTutorials_main_8035697991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1428 = (Object[]) newArray("java.lang.String", 6);
        setElement(term1428, 0, "LQFpaHEwXR");
        setElement(term1428, 1, "oVcInYnLWB");
        setElement(term1428, 2, "aJlieCFVtF");
        setElement(term1428, 3, "ZiaGIbnzTs");
        setElement(term1428, 4, "tbcdzjIfER");
        setElement(term1428, 5, "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.tutorials.LombokTutorials");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1428;
        callMethod(klass, "main", argTypes, null, args);
    }

};


