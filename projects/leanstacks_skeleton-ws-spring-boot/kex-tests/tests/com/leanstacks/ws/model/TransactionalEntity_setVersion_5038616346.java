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
     Object term4837;
     Object term4910;

    public TransactionalEntity_setVersion_5038616346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4838 = new Long(1672578078364590450L);
        Integer term4878 = new Integer(-1263114719);
        term4837 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term4892 = newInstance(Class.forName("java.time.Instant"));
        Object term4907 = newInstance(Class.forName("java.time.Instant"));
        setField(term4837, term4837.getClass(), "id", term4838);
        setField(term4837, term4837.getClass(), "referenceId", "9433db70-fc3f-441b-8f53-178d5774636e");
        setField(term4837, term4837.getClass(), "version", term4878);
        setField(term4837, term4837.getClass(), "createdBy", "mfCpTPPQQm");
        setLongField(term4892, term4892.getClass(), "seconds", 1654999632L);
        setIntField(term4892, term4892.getClass(), "nanos", 684000000);
        setField(term4837, term4837.getClass(), "createdAt", term4892);
        setField(term4837, term4837.getClass(), "updatedBy", "OcJCIDNIXA");
        setLongField(term4907, term4907.getClass(), "seconds", 1664732674L);
        setIntField(term4907, term4907.getClass(), "nanos", 90000000);
        setField(term4837, term4837.getClass(), "updatedAt", term4907);
        term4910 = new Integer(-894662986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4910;
        callMethod(klass, "setVersion", argTypes, term4837, args);
    }

};


