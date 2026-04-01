package com.leanstacks.ws.model;

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
import static com.leanstacks.ws.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class TransactionalEntity_setUpdatedAt_153694737814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5918;
     Object term5991;

    public TransactionalEntity_setUpdatedAt_153694737814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5919 = new Long(2354625302846375590L);
        Integer term5959 = new Integer(-663691365);
        term5918 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5973 = newInstance(Class.forName("java.time.Instant"));
        Object term5988 = newInstance(Class.forName("java.time.Instant"));
        setField(term5918, term5918.getClass(), "id", term5919);
        setField(term5918, term5918.getClass(), "referenceId", "bdf4fbca-e966-4414-8b6a-e5ee036b785e");
        setField(term5918, term5918.getClass(), "version", term5959);
        setField(term5918, term5918.getClass(), "createdBy", "bxrCBbrrct");
        setLongField(term5973, term5973.getClass(), "seconds", 1502420909L);
        setIntField(term5973, term5973.getClass(), "nanos", 766000000);
        setField(term5918, term5918.getClass(), "createdAt", term5973);
        setField(term5918, term5918.getClass(), "updatedBy", "CKWpJaaaxX");
        setLongField(term5988, term5988.getClass(), "seconds", 1685492640L);
        setIntField(term5988, term5988.getClass(), "nanos", 220000000);
        setField(term5918, term5918.getClass(), "updatedAt", term5988);
        term5991 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term5991, term5991.getClass(), "seconds", 1654457238L);
        setIntField(term5991, term5991.getClass(), "nanos", 681000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term5991;
        callMethod(klass, "setUpdatedAt", argTypes, term5918, args);
    }

};


