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

public class ExampleDto_canEqual_11514311059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term688;
     Object term703;

    public ExampleDto_canEqual_11514311059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term688 = newInstance(Class.forName("com.slm.proguard.example.spring.boot.dto.ExampleDto"));
        Object term702 = newInstance(Class.forName("java.lang.Object"));
        setField(term688, term688.getClass(), "variableString", "flxyYxBRtu");
        setIntField(term688, term688.getClass(), "variableInt", 590364439);
        setField(term688, term688.getClass(), "variableObject", term702);
        term703 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.slm.proguard.example.spring.boot.dto.ExampleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term703;
        callMethod(klass, "canEqual", argTypes, term688, args);
    }

};


