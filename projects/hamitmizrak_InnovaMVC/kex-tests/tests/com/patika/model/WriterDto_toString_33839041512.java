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

public class WriterDto_toString_33839041512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1557;

    public WriterDto_toString_33839041512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1557 = newInstance(Class.forName("com.patika.model.WriterDto"));
        Object term1596 = newInstance(Class.forName("java.util.Date"));
        setField(term1557, term1557.getClass(), "writerName", "fhkbdRViHi");
        setField(term1557, term1557.getClass(), "writerSurname", "uWHnvSvaPl");
        setField(term1557, term1557.getClass(), "writerAddress", "kBdSllIBVz");
        setDoubleField(term1557, term1557.getClass(), "writerTelephoneNumber", 0.6436713023569729);
        setIntField(term1557, term1557.getClass(), "id", 1048535127);
        setLongField(term1596, term1596.getClass(), "fastTime", 1725122217647L);
        setField(term1596, term1596.getClass(), "cdate", null);
        setField(term1557, term1557.getClass(), "date", term1596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1557, args);
    }

};


