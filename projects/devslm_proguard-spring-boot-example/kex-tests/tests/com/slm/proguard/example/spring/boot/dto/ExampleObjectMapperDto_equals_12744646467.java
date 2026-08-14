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

public class ExampleObjectMapperDto_equals_12744646467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;
     Object term191;

    public ExampleObjectMapperDto_equals_12744646467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176 = newInstance(Class.forName("com.slm.proguard.example.spring.boot.dto.ExampleObjectMapperDto"));
        Object term190 = newInstance(Class.forName("java.lang.Object"));
        setField(term176, term176.getClass(), "variableString", "MjGYSRKTNF");
        setIntField(term176, term176.getClass(), "variableInt", -2038273078);
        setField(term176, term176.getClass(), "variableObject", term190);
        term191 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.slm.proguard.example.spring.boot.dto.ExampleObjectMapperDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term191;
        callMethod(klass, "equals", argTypes, term176, args);
    }

};


