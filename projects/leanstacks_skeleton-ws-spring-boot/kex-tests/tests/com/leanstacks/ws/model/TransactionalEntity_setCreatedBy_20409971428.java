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
     Object term5111;

    public TransactionalEntity_setCreatedBy_20409971428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5112 = new Long(-5216789073301458893L);
        Integer term5152 = new Integer(-1347665717);
        term5111 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5166 = newInstance(Class.forName("java.time.Instant"));
        Object term5181 = newInstance(Class.forName("java.time.Instant"));
        setField(term5111, term5111.getClass(), "id", term5112);
        setField(term5111, term5111.getClass(), "referenceId", "c4ff8192-9fae-42f8-abd7-2498e0fa36d1");
        setField(term5111, term5111.getClass(), "version", term5152);
        setField(term5111, term5111.getClass(), "createdBy", "ShIELyuULw");
        setLongField(term5166, term5166.getClass(), "seconds", 1714093306L);
        setIntField(term5166, term5166.getClass(), "nanos", 769000000);
        setField(term5111, term5111.getClass(), "createdAt", term5166);
        setField(term5111, term5111.getClass(), "updatedBy", "IpQuOGMgmj");
        setLongField(term5181, term5181.getClass(), "seconds", 1792469628L);
        setIntField(term5181, term5181.getClass(), "nanos", 390000000);
        setField(term5111, term5111.getClass(), "updatedAt", term5181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pJbnHTYrxn";
        callMethod(klass, "setCreatedBy", argTypes, term5111, args);
    }

};


