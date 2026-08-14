package com.example.web_shop;

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
import static com.example.web_shop.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class WebShopApplication_main_8890851281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2939;

    public WebShopApplication_main_8890851281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2939 = (Object[]) newArray("java.lang.String", 4);
        setElement(term2939, 0, "fWKJoSoCwE");
        setElement(term2939, 1, "wfaXBpWAUH");
        setElement(term2939, 2, "VMeAzAHwZj");
        setElement(term2939, 3, "PznxWXsZME");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.WebShopApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2939;
        callMethod(klass, "main", argTypes, null, args);
    }

};


