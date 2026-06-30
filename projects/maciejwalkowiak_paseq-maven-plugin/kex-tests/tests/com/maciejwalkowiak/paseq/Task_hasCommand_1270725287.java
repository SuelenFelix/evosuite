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

public class Task_hasCommand_1270725287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1652;

    public Task_hasCommand_1270725287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1652 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Task"));
        Object[] term1655 = (Object[]) newArray("java.lang.String", 6);
        Object term1728 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term1652, term1652.getClass(), "async", true);
        setBooleanField(term1652, term1652.getClass(), "wait", true);
        setElement(term1655, 0, "JUmudUmaaV");
        setElement(term1655, 1, "KoyGrUJeJW");
        setElement(term1655, 2, "HqBOwkVqjD");
        setElement(term1655, 3, "MAcUBcBckh");
        setElement(term1655, 4, "oVgzLbrsFr");
        setElement(term1655, 5, "vQVyKLdtaz");
        setField(term1652, term1652.getClass(), "goals", term1655);
        setField(term1728, term1728.getClass(), "command", "OWKQODBLzb");
        setField(term1728, term1728.getClass(), "directory", "wGmYcqUkgE");
        setField(term1652, term1652.getClass(), "exec", term1728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasCommand", argTypes, term1652, args);
    }

};


