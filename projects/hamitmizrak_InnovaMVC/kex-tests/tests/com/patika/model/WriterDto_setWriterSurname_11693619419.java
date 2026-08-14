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

public class WriterDto_setWriterSurname_11693619419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1298;

    public WriterDto_setWriterSurname_11693619419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1298 = newInstance(Class.forName("com.patika.model.WriterDto"));
        Object term1337 = newInstance(Class.forName("java.util.Date"));
        setField(term1298, term1298.getClass(), "writerName", "JDswTTCZHV");
        setField(term1298, term1298.getClass(), "writerSurname", "onpbIeEKoi");
        setField(term1298, term1298.getClass(), "writerAddress", "YRHGsAkhxb");
        setDoubleField(term1298, term1298.getClass(), "writerTelephoneNumber", 0.7031006357544823);
        setIntField(term1298, term1298.getClass(), "id", -1685132342);
        setLongField(term1337, term1337.getClass(), "fastTime", 1882638884364L);
        setField(term1337, term1337.getClass(), "cdate", null);
        setField(term1298, term1298.getClass(), "date", term1337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ffYhPOzlUs";
        callMethod(klass, "setWriterSurname", argTypes, term1298, args);
    }

};


