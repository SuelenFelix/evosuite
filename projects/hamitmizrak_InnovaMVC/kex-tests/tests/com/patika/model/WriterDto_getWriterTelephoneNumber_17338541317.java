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

public class WriterDto_getWriterTelephoneNumber_17338541317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1134;

    public WriterDto_getWriterTelephoneNumber_17338541317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1134 = newInstance(Class.forName("com.patika.model.WriterDto"));
        Object term1173 = newInstance(Class.forName("java.util.Date"));
        setField(term1134, term1134.getClass(), "writerName", "tShwQLRGNe");
        setField(term1134, term1134.getClass(), "writerSurname", "LvtrsXUliU");
        setField(term1134, term1134.getClass(), "writerAddress", "xLbjWUgOIL");
        setDoubleField(term1134, term1134.getClass(), "writerTelephoneNumber", 0.7655020693602768);
        setIntField(term1134, term1134.getClass(), "id", 1585847225);
        setLongField(term1173, term1173.getClass(), "fastTime", 1706078172457L);
        setField(term1173, term1173.getClass(), "cdate", null);
        setField(term1134, term1134.getClass(), "date", term1173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWriterTelephoneNumber", argTypes, term1134, args);
    }

};


