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

public class WriterDto_getWriterName_16588991274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921;

    public WriterDto_getWriterName_16588991274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term921 = newInstance(Class.forName("com.patika.model.WriterDto"));
        Object term960 = newInstance(Class.forName("java.util.Date"));
        setField(term921, term921.getClass(), "writerName", "IDCWpPLRkE");
        setField(term921, term921.getClass(), "writerSurname", "nyiiPDVjAc");
        setField(term921, term921.getClass(), "writerAddress", "aKnKipADSo");
        setDoubleField(term921, term921.getClass(), "writerTelephoneNumber", 0.37773193782763337);
        setIntField(term921, term921.getClass(), "id", -522618178);
        setLongField(term960, term960.getClass(), "fastTime", 1589457921030L);
        setField(term960, term960.getClass(), "cdate", null);
        setField(term921, term921.getClass(), "date", term960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWriterName", argTypes, term921, args);
    }

};


