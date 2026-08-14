package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CurrentAlert_init_213099427614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5442;

    public CurrentAlert_init_213099427614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5442 = (Object[]) newArray("java.lang.String", 6);
        setElement(term5442, 0, "WBAOTqErtm");
        setElement(term5442, 1, "PqtVXXZMqK");
        setElement(term5442, 2, "rYbtIDVdnd");
        setElement(term5442, 3, "UKAReurpHG");
        setElement(term5442, 4, "WVRMUmrljA");
        setElement(term5442, 5, "NTlKJDDWlk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = "pJbnHTYrxn";
        args[1] = "iIRsCSYqXH";
        args[2] = "nghfqDXyCG";
        args[3] = term5442;
        args[4] = "vOuMEpOQAg";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


