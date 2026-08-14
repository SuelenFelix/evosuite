package com.patika.designpatern.creation.a2.builder;

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
import static com.patika.designpatern.creation.a2.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LombokBuilder_canEqual_157927682711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term929;
     Object term954;

    public LombokBuilder_canEqual_157927682711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term929 = newInstance(Class.forName("com.patika.designpatern.creation.a2.builder.LombokBuilder"));
        setField(term929, term929.getClass(), "adi", "UlajhuVLaP");
        setField(term929, term929.getClass(), "soyadi", "gGSMzuGICf");
        term954 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.designpatern.creation.a2.builder.LombokBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term954;
        callMethod(klass, "canEqual", argTypes, term929, args);
    }

};


