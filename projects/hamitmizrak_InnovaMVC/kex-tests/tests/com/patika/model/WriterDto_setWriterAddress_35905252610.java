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

public class WriterDto_setWriterAddress_35905252610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1391;

    public WriterDto_setWriterAddress_35905252610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1391 = newInstance(Class.forName("com.patika.model.WriterDto"));
        Object term1430 = newInstance(Class.forName("java.util.Date"));
        setField(term1391, term1391.getClass(), "writerName", "MLqYREekMl");
        setField(term1391, term1391.getClass(), "writerSurname", "ytSBIKXogI");
        setField(term1391, term1391.getClass(), "writerAddress", "nHXjMycHlU");
        setDoubleField(term1391, term1391.getClass(), "writerTelephoneNumber", 0.9527281779865117);
        setIntField(term1391, term1391.getClass(), "id", -1456670397);
        setLongField(term1430, term1430.getClass(), "fastTime", 1437757323580L);
        setField(term1430, term1430.getClass(), "cdate", null);
        setField(term1391, term1391.getClass(), "date", term1430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ieCtQFdkii";
        callMethod(klass, "setWriterAddress", argTypes, term1391, args);
    }

};


