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

public class Exec_toLoggableString_6118521596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1014;

    public Exec_toLoggableString_6118521596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1014 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setField(term1014, term1014.getClass(), "command", "BndsHwAFMv");
        setField(term1014, term1014.getClass(), "directory", "GzFkzHGYFt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.Exec");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toLoggableString", argTypes, term1014, args);
    }

};


