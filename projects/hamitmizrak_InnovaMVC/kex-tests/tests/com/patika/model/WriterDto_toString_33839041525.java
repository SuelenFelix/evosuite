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

public class WriterDto_toString_33839041525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1663;

    public WriterDto_toString_33839041525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1663 = newInstance(Class.forName("com.patika.model.WriterDto"));
        setField(term1663, term1663.getClass(), "writerName", null);
        setField(term1663, term1663.getClass(), "writerSurname", null);
        setField(term1663, term1663.getClass(), "writerAddress", null);
        setDoubleField(term1663, term1663.getClass(), "writerTelephoneNumber", 0.0);
        setIntField(term1663, term1663.getClass(), "id", 0);
        setField(term1663, term1663.getClass(), "date", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1663, args);
    }

};


