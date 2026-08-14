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

public class ExampleObjectMapperDto_setVariableString_8280060594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76;

    public ExampleObjectMapperDto_setVariableString_8280060594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76 = newInstance(Class.forName("com.slm.proguard.example.spring.boot.dto.ExampleObjectMapperDto"));
        Object term90 = newInstance(Class.forName("java.lang.Object"));
        setField(term76, term76.getClass(), "variableString", "xxtlPwDYFs");
        setIntField(term76, term76.getClass(), "variableInt", 391863371);
        setField(term76, term76.getClass(), "variableObject", term90);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.slm.proguard.example.spring.boot.dto.ExampleObjectMapperDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "setVariableString", argTypes, term76, args);
    }

};


