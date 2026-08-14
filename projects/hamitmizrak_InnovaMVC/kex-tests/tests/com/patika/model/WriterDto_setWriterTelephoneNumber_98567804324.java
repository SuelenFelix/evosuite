package com.patika.model;

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
import static com.patika.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class WriterDto_setWriterTelephoneNumber_98567804324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1658;
     Object term1661;

    public WriterDto_setWriterTelephoneNumber_98567804324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1658 = newInstance(Class.forName("com.patika.model.WriterDto"));
        setField(term1658, term1658.getClass(), "writerName", null);
        setField(term1658, term1658.getClass(), "writerSurname", null);
        setField(term1658, term1658.getClass(), "writerAddress", null);
        setDoubleField(term1658, term1658.getClass(), "writerTelephoneNumber", 0.0);
        setIntField(term1658, term1658.getClass(), "id", 0);
        setField(term1658, term1658.getClass(), "date", null);
        term1661 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1661;
        callMethod(klass, "setWriterTelephoneNumber", argTypes, term1658, args);
    }

};


