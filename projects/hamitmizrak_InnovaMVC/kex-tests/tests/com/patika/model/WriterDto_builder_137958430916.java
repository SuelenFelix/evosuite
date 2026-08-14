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

public class WriterDto_builder_137958430916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1634;

    public WriterDto_builder_137958430916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1634 = newInstance(Class.forName("com.patika.model.WriterDto"));
        setField(term1634, term1634.getClass(), "writerName", null);
        setField(term1634, term1634.getClass(), "writerSurname", null);
        setField(term1634, term1634.getClass(), "writerAddress", null);
        setDoubleField(term1634, term1634.getClass(), "writerTelephoneNumber", 0.0);
        setIntField(term1634, term1634.getClass(), "id", 0);
        setField(term1634, term1634.getClass(), "date", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "builder", argTypes, term1634, args);
    }

};


