package com.patika.tutorials;

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
import static com.patika.tutorials.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LombokTutorials_toString_17255886540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1361;

    public LombokTutorials_toString_17255886540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1361 = newInstance(Class.forName("com.patika.tutorials.LombokTutorials"));
        setField(term1361, term1361.getClass(), "adi", "NRdvgJlhkX");
        setField(term1361, term1361.getClass(), "soyadi", "uuaPigETmJ");
        setField(term1361, term1361.getClass(), "numarasi", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.tutorials.LombokTutorials");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1361, args);
    }

};


