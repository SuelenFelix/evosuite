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

public class TransactionalEntity_setVersion_5038616346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4851;
     Object term4924;

    public TransactionalEntity_setVersion_5038616346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4852 = new Long(1672578078364590450L);
        Integer term4892 = new Integer(-1263114719);
        term4851 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term4906 = newInstance(Class.forName("java.time.Instant"));
        Object term4921 = newInstance(Class.forName("java.time.Instant"));
        setField(term4851, term4851.getClass(), "id", term4852);
        setField(term4851, term4851.getClass(), "referenceId", "c0febb62-d397-4920-970c-204d1a1d72aa");
        setField(term4851, term4851.getClass(), "version", term4892);
        setField(term4851, term4851.getClass(), "createdBy", "mfCpTPPQQm");
        setLongField(term4906, term4906.getClass(), "seconds", 1654999632L);
        setIntField(term4906, term4906.getClass(), "nanos", 684000000);
        setField(term4851, term4851.getClass(), "createdAt", term4906);
        setField(term4851, term4851.getClass(), "updatedBy", "OcJCIDNIXA");
        setLongField(term4921, term4921.getClass(), "seconds", 1664732674L);
        setIntField(term4921, term4921.getClass(), "nanos", 90000000);
        setField(term4851, term4851.getClass(), "updatedAt", term4921);
        term4924 = new Integer(-894662986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4924;
        callMethod(klass, "setVersion", argTypes, term4851, args);
    }

};


