package com.blog.coffee_shop;

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
import static com.blog.coffee_shop.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CoffeeShopApplication_main_21296820481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;

    public CoffeeShopApplication_main_21296820481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = (Object[]) newArray("java.lang.String", 5);
        setElement(term93, 0, "jJCZpVmanW");
        setElement(term93, 1, "EGtDIRbSSb");
        setElement(term93, 2, "SzjVpOQTyS");
        setElement(term93, 3, "MjGYSRKTNF");
        setElement(term93, 4, "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.blog.coffee_shop.CoffeeShopApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term93;
        callMethod(klass, "main", argTypes, null, args);
    }

};


