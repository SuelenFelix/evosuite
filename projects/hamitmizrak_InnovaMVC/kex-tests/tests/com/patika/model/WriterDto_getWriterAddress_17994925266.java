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

public class WriterDto_getWriterAddress_17994925266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1063;

    public WriterDto_getWriterAddress_17994925266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1063 = newInstance(Class.forName("com.patika.model.WriterDto"));
        Object term1102 = newInstance(Class.forName("java.util.Date"));
        setField(term1063, term1063.getClass(), "writerName", "hxCBltsObl");
        setField(term1063, term1063.getClass(), "writerSurname", "BndsHwAFMv");
        setField(term1063, term1063.getClass(), "writerAddress", "GzFkzHGYFt");
        setDoubleField(term1063, term1063.getClass(), "writerTelephoneNumber", 0.5183269973490326);
        setIntField(term1063, term1063.getClass(), "id", -883034806);
        setLongField(term1102, term1102.getClass(), "fastTime", 1349069753960L);
        setField(term1102, term1102.getClass(), "cdate", null);
        setField(term1063, term1063.getClass(), "date", term1102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWriterAddress", argTypes, term1063, args);
    }

};


