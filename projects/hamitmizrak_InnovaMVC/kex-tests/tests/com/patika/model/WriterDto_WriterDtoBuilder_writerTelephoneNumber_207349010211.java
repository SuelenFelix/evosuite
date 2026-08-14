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

public class WriterDto_WriterDtoBuilder_writerTelephoneNumber_207349010211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545;
     Object term547;

    public WriterDto_WriterDtoBuilder_writerTelephoneNumber_207349010211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545 = newInstance(Class.forName("com.patika.model.WriterDto$WriterDtoBuilder"));
        setField(term545, term545.getClass(), "writerName", null);
        setField(term545, term545.getClass(), "writerSurname", null);
        setField(term545, term545.getClass(), "writerAddress", null);
        setDoubleField(term545, term545.getClass(), "writerTelephoneNumber", 0.0);
        term547 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto$WriterDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term547;
        callMethod(klass, "writerTelephoneNumber", argTypes, term545, args);
    }

};


