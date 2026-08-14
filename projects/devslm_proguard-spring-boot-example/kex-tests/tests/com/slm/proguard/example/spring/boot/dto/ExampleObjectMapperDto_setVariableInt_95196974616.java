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
import java.lang.Integer;

public class ExampleObjectMapperDto_setVariableInt_95196974616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286;
     Object term288;

    public ExampleObjectMapperDto_setVariableInt_95196974616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286 = newInstance(Class.forName("com.slm.proguard.example.spring.boot.dto.ExampleObjectMapperDto"));
        setField(term286, term286.getClass(), "variableString", null);
        setIntField(term286, term286.getClass(), "variableInt", 0);
        setField(term286, term286.getClass(), "variableObject", null);
        term288 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.slm.proguard.example.spring.boot.dto.ExampleObjectMapperDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term288;
        callMethod(klass, "setVariableInt", argTypes, term286, args);
    }

};


