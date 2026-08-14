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

public class Log4j2Tutorials_Log4j2TutorialsBuilder_toString_150829934011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3569;

    public Log4j2Tutorials_Log4j2TutorialsBuilder_toString_150829934011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3569 = newInstance(Class.forName("com.patika.tutorials.Log4j2Tutorials$Log4j2TutorialsBuilder"));
        setField(term3569, term3569.getClass(), "adi", null);
        setField(term3569, term3569.getClass(), "soyadi", null);
        setField(term3569, term3569.getClass(), "numarasi", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.tutorials.Log4j2Tutorials$Log4j2TutorialsBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3569, args);
    }

};


