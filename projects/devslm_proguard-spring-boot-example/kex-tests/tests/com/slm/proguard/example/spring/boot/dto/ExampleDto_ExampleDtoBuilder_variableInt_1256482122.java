package com.slm.proguard.example.spring.boot.dto;

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
import static com.slm.proguard.example.spring.boot.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ExampleDto_ExampleDtoBuilder_variableInt_1256482122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347;
     Object term362;

    public ExampleDto_ExampleDtoBuilder_variableInt_1256482122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347 = newInstance(Class.forName("com.slm.proguard.example.spring.boot.dto.ExampleDto$ExampleDtoBuilder"));
        Object term361 = newInstance(Class.forName("java.lang.Object"));
        setField(term347, term347.getClass(), "variableString", "LQFpaHEwXR");
        setIntField(term347, term347.getClass(), "variableInt", 1134449235);
        setField(term347, term347.getClass(), "variableObject", term361);
        term362 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.slm.proguard.example.spring.boot.dto.ExampleDto$ExampleDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term362;
        callMethod(klass, "variableInt", argTypes, term347, args);
    }

};


