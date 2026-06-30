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

public class Task_validate_16229736555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378;

    public Task_validate_16229736555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Task"));
        Object[] term1381 = (Object[]) newArray("java.lang.String", 7);
        Object term1466 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term1378, term1378.getClass(), "async", false);
        setBooleanField(term1378, term1378.getClass(), "wait", true);
        setElement(term1381, 0, "ieCtQFdkii");
        setElement(term1381, 1, "dEnhdmILtU");
        setElement(term1381, 2, "hoicvmsovO");
        setElement(term1381, 3, "eqJfYWRaEL");
        setElement(term1381, 4, "fhkbdRViHi");
        setElement(term1381, 5, "uWHnvSvaPl");
        setElement(term1381, 6, "kBdSllIBVz");
        setField(term1378, term1378.getClass(), "goals", term1381);
        setField(term1466, term1466.getClass(), "command", "TJmVBGfTML");
        setField(term1466, term1466.getClass(), "directory", "tPlsykYBqO");
        setField(term1378, term1378.getClass(), "exec", term1466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term1378, args);
    }

};


