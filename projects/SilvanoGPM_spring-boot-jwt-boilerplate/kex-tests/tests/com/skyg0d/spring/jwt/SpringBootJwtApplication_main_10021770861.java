package com.skyg0d.spring.jwt;

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
import static com.skyg0d.spring.jwt.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SpringBootJwtApplication_main_10021770861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10571;

    public SpringBootJwtApplication_main_10021770861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10571 = (Object[]) newArray("java.lang.String", 5);
        setElement(term10571, 0, "GPSEWEDSTo");
        setElement(term10571, 1, "RCOqfVsRHt");
        setElement(term10571, 2, "TSyCeEZPaT");
        setElement(term10571, 3, "JeZFtaqkzW");
        setElement(term10571, 4, "vOVuNSCCLe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.SpringBootJwtApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10571;
        callMethod(klass, "main", argTypes, null, args);
    }

};


