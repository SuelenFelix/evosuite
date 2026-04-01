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

public class TransactionalEntity_setCreatedBy_20409971428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5097;

    public TransactionalEntity_setCreatedBy_20409971428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5098 = new Long(-5216789073301458893L);
        Integer term5138 = new Integer(-1347665717);
        term5097 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5152 = newInstance(Class.forName("java.time.Instant"));
        Object term5167 = newInstance(Class.forName("java.time.Instant"));
        setField(term5097, term5097.getClass(), "id", term5098);
        setField(term5097, term5097.getClass(), "referenceId", "95772ae9-804b-4791-8d54-099363b6ac4e");
        setField(term5097, term5097.getClass(), "version", term5138);
        setField(term5097, term5097.getClass(), "createdBy", "ShIELyuULw");
        setLongField(term5152, term5152.getClass(), "seconds", 1714093306L);
        setIntField(term5152, term5152.getClass(), "nanos", 769000000);
        setField(term5097, term5097.getClass(), "createdAt", term5152);
        setField(term5097, term5097.getClass(), "updatedBy", "IpQuOGMgmj");
        setLongField(term5167, term5167.getClass(), "seconds", 1792469628L);
        setIntField(term5167, term5167.getClass(), "nanos", 390000000);
        setField(term5097, term5097.getClass(), "updatedAt", term5167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pJbnHTYrxn";
        callMethod(klass, "setCreatedBy", argTypes, term5097, args);
    }

};


