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

public class LombokBuilder_getSoyadi_19638052286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term703;

    public LombokBuilder_getSoyadi_19638052286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term703 = newInstance(Class.forName("com.patika.designpatern.creation.a2.builder.LombokBuilder"));
        setField(term703, term703.getClass(), "adi", "dWRymuLBtr");
        setField(term703, term703.getClass(), "soyadi", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.designpatern.creation.a2.builder.LombokBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSoyadi", argTypes, term703, args);
    }

};


