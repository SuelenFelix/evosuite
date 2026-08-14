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

public class WriterDto_WriterDtoBuilder_writerTelephoneNumber_20734901025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335;
     Object term373;

    public WriterDto_WriterDtoBuilder_writerTelephoneNumber_20734901025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335 = newInstance(Class.forName("com.patika.model.WriterDto$WriterDtoBuilder"));
        setField(term335, term335.getClass(), "writerName", "MxlszYVzRf");
        setField(term335, term335.getClass(), "writerSurname", "LQFpaHEwXR");
        setField(term335, term335.getClass(), "writerAddress", "oVcInYnLWB");
        setDoubleField(term335, term335.getClass(), "writerTelephoneNumber", 0.544608645520025);
        term373 = new Double(0.28570734989730284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto$WriterDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term373;
        callMethod(klass, "writerTelephoneNumber", argTypes, term335, args);
    }

};


