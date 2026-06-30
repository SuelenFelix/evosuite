package com.example.demo;

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
import static com.example.demo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DemoApplication_main_16659385491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1160;

    public DemoApplication_main_16659385491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1160 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1160, 0, "UiUYnPrcCi");
        setElement(term1160, 1, "UoYtihxVaS");
        setElement(term1160, 2, "JDswTTCZHV");
        setElement(term1160, 3, "onpbIeEKoi");
        setElement(term1160, 4, "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.demo.DemoApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1160;
        callMethod(klass, "main", argTypes, null, args);
    }

};


