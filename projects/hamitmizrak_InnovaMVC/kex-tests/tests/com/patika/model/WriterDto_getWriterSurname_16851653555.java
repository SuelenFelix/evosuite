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
import java.lang.Object;

public class WriterDto_getWriterSurname_16851653555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term992;

    public WriterDto_getWriterSurname_16851653555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term992 = newInstance(Class.forName("com.patika.model.WriterDto"));
        Object term1031 = newInstance(Class.forName("java.util.Date"));
        setField(term992, term992.getClass(), "writerName", "wSQxaModmm");
        setField(term992, term992.getClass(), "writerSurname", "UlajhuVLaP");
        setField(term992, term992.getClass(), "writerAddress", "gGSMzuGICf");
        setDoubleField(term992, term992.getClass(), "writerTelephoneNumber", 0.8474802076607362);
        setIntField(term992, term992.getClass(), "id", 1134449235);
        setLongField(term1031, term1031.getClass(), "fastTime", 1745462962080L);
        setField(term1031, term1031.getClass(), "cdate", null);
        setField(term992, term992.getClass(), "date", term1031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWriterSurname", argTypes, term992, args);
    }

};


