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

public class TransactionalEntity_getCreatedBy_20912127147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4982;

    public TransactionalEntity_getCreatedBy_20912127147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4983 = new Long(4949335493504695457L);
        Integer term5023 = new Integer(304775596);
        term4982 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5037 = newInstance(Class.forName("java.time.Instant"));
        Object term5052 = newInstance(Class.forName("java.time.Instant"));
        setField(term4982, term4982.getClass(), "id", term4983);
        setField(term4982, term4982.getClass(), "referenceId", "9207a472-a0b6-41d4-9865-144c188392f3");
        setField(term4982, term4982.getClass(), "version", term5023);
        setField(term4982, term4982.getClass(), "createdBy", "XfRABIFVEp");
        setLongField(term5037, term5037.getClass(), "seconds", 1699925062L);
        setIntField(term5037, term5037.getClass(), "nanos", 576000000);
        setField(term4982, term4982.getClass(), "createdAt", term5037);
        setField(term4982, term4982.getClass(), "updatedBy", "MHGKyEnwKc");
        setLongField(term5052, term5052.getClass(), "seconds", 1706636196L);
        setIntField(term5052, term5052.getClass(), "nanos", 274000000);
        setField(term4982, term4982.getClass(), "updatedAt", term5052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedBy", argTypes, term4982, args);
    }

};


