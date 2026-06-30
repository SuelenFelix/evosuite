package com.martinachov.hexagonal;

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
import static com.martinachov.hexagonal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HexagonalArchitectureApplication_main_16029411281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term905;

    public HexagonalArchitectureApplication_main_16029411281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term905 = (Object[]) newArray("java.lang.String", 5);
        setElement(term905, 0, "aKnKipADSo");
        setElement(term905, 1, "wSQxaModmm");
        setElement(term905, 2, "UlajhuVLaP");
        setElement(term905, 3, "gGSMzuGICf");
        setElement(term905, 4, "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.HexagonalArchitectureApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term905;
        callMethod(klass, "main", argTypes, null, args);
    }

};


