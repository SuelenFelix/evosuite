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

public class WriterDto_getWriterTelephoneNumber_173385413120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1646;

    public WriterDto_getWriterTelephoneNumber_173385413120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1646 = newInstance(Class.forName("com.patika.model.WriterDto"));
        setField(term1646, term1646.getClass(), "writerName", null);
        setField(term1646, term1646.getClass(), "writerSurname", null);
        setField(term1646, term1646.getClass(), "writerAddress", null);
        setDoubleField(term1646, term1646.getClass(), "writerTelephoneNumber", 0.0);
        setIntField(term1646, term1646.getClass(), "id", 0);
        setField(term1646, term1646.getClass(), "date", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWriterTelephoneNumber", argTypes, term1646, args);
    }

};


