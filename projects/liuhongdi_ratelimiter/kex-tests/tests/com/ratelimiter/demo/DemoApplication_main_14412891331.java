package com.ratelimiter.demo;

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
import static com.ratelimiter.demo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DemoApplication_main_14412891331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20065;

    public DemoApplication_main_14412891331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20065 = (Object[]) newArray("java.lang.String", 7);
        setElement(term20065, 0, "IDCWpPLRkE");
        setElement(term20065, 1, "nyiiPDVjAc");
        setElement(term20065, 2, "aKnKipADSo");
        setElement(term20065, 3, "wSQxaModmm");
        setElement(term20065, 4, "UlajhuVLaP");
        setElement(term20065, 5, "gGSMzuGICf");
        setElement(term20065, 6, "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ratelimiter.demo.DemoApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term20065;
        callMethod(klass, "main", argTypes, null, args);
    }

};


