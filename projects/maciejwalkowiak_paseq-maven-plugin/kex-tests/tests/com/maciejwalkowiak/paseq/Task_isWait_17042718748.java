package com.maciejwalkowiak.paseq;

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
import static com.maciejwalkowiak.paseq.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Task_isWait_17042718748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1833;

    public Task_isWait_17042718748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1833 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Task"));
        Object[] term1836 = (Object[]) newArray("java.lang.String", 5);
        Object term1897 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term1833, term1833.getClass(), "async", false);
        setBooleanField(term1833, term1833.getClass(), "wait", false);
        setElement(term1836, 0, "idgaQsnJpQ");
        setElement(term1836, 1, "VgZnGoIFwQ");
        setElement(term1836, 2, "jUbSRrkrYZ");
        setElement(term1836, 3, "bWWfajKbEX");
        setElement(term1836, 4, "cAPeiZHKGJ");
        setField(term1833, term1833.getClass(), "goals", term1836);
        setField(term1897, term1897.getClass(), "command", "LvJFtLBaxj");
        setField(term1897, term1897.getClass(), "directory", "PHvxnGHptP");
        setField(term1833, term1833.getClass(), "exec", term1897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isWait", argTypes, term1833, args);
    }

};


