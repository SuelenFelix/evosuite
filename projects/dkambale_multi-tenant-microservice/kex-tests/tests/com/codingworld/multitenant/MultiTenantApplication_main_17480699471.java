package com.codingworld.multitenant;

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
import static com.codingworld.multitenant.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiTenantApplication_main_17480699471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1790;

    public MultiTenantApplication_main_17480699471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1790 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1790, 0, "vQVyKLdtaz");
        setElement(term1790, 1, "OWKQODBLzb");
        setElement(term1790, 2, "wGmYcqUkgE");
        setElement(term1790, 3, "idgaQsnJpQ");
        setElement(term1790, 4, "VgZnGoIFwQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.MultiTenantApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1790;
        callMethod(klass, "main", argTypes, null, args);
    }

};


