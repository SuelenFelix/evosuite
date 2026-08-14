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

public class TransactionalEntity_getVersion_10140505205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722;

    public TransactionalEntity_getVersion_10140505205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4723 = new Long(-8085190702504231560L);
        Integer term4763 = new Integer(-1034506028);
        term4722 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term4777 = newInstance(Class.forName("java.time.Instant"));
        Object term4792 = newInstance(Class.forName("java.time.Instant"));
        setField(term4722, term4722.getClass(), "id", term4723);
        setField(term4722, term4722.getClass(), "referenceId", "839c5f29-a43f-4082-89f4-3ff728fcd481");
        setField(term4722, term4722.getClass(), "version", term4763);
        setField(term4722, term4722.getClass(), "createdBy", "xvkbvaEGYd");
        setLongField(term4777, term4777.getClass(), "seconds", 1602136919L);
        setIntField(term4777, term4777.getClass(), "nanos", 2000000);
        setField(term4722, term4722.getClass(), "createdAt", term4777);
        setField(term4722, term4722.getClass(), "updatedBy", "HBGNxdNURv");
        setLongField(term4792, term4792.getClass(), "seconds", 1444174640L);
        setIntField(term4792, term4792.getClass(), "nanos", 781000000);
        setField(term4722, term4722.getClass(), "updatedAt", term4792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term4722, args);
    }

};


