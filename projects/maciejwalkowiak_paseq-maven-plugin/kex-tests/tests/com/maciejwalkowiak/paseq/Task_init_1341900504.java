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
import java.lang.Boolean;
import java.lang.Object;

public class Task_init_1341900504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1196;
     Object term1198;
     Object term1200;
     Object term1273;

    public Task_init_1341900504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1196 = new Boolean(false);
        term1198 = new Boolean(true);
        term1200 = (Object[]) newArray("java.lang.String", 6);
        setElement(term1200, 0, "UoYtihxVaS");
        setElement(term1200, 1, "JDswTTCZHV");
        setElement(term1200, 2, "onpbIeEKoi");
        setElement(term1200, 3, "YRHGsAkhxb");
        setElement(term1200, 4, "ffYhPOzlUs");
        setElement(term1200, 5, "MLqYREekMl");
        term1273 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setField(term1273, term1273.getClass(), "command", "ytSBIKXogI");
        setField(term1273, term1273.getClass(), "directory", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.Task");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[3] = Class.forName("com.maciejwalkowiak.paseq.Exec");
        Object[] args = new Object[4];
        args[0] = term1196;
        args[1] = term1198;
        args[2] = term1200;
        args[3] = term1273;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


