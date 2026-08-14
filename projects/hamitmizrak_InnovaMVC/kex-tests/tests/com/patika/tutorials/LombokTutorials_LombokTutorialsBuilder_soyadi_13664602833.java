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

public class LombokTutorials_LombokTutorialsBuilder_soyadi_13664602833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3685;

    public LombokTutorials_LombokTutorialsBuilder_soyadi_13664602833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3685 = newInstance(Class.forName("com.patika.tutorials.LombokTutorials$LombokTutorialsBuilder"));
        setField(term3685, term3685.getClass(), "adi", "DfISiziTgG");
        setField(term3685, term3685.getClass(), "soyadi", "XqgfKFvPSD");
        setField(term3685, term3685.getClass(), "numarasi", "JiVRgTZvKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.tutorials.LombokTutorials$LombokTutorialsBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XPKmummaqg";
        callMethod(klass, "soyadi", argTypes, term3685, args);
    }

};


