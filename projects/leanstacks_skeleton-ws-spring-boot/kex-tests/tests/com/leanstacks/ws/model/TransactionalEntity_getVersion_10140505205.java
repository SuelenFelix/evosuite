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
     Object term4708;

    public TransactionalEntity_getVersion_10140505205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4709 = new Long(-8085190702504231560L);
        Integer term4749 = new Integer(-1034506028);
        term4708 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term4763 = newInstance(Class.forName("java.time.Instant"));
        Object term4778 = newInstance(Class.forName("java.time.Instant"));
        setField(term4708, term4708.getClass(), "id", term4709);
        setField(term4708, term4708.getClass(), "referenceId", "2a990511-072e-4948-ba3b-d1ca67ff1921");
        setField(term4708, term4708.getClass(), "version", term4749);
        setField(term4708, term4708.getClass(), "createdBy", "xvkbvaEGYd");
        setLongField(term4763, term4763.getClass(), "seconds", 1602136919L);
        setIntField(term4763, term4763.getClass(), "nanos", 2000000);
        setField(term4708, term4708.getClass(), "createdAt", term4763);
        setField(term4708, term4708.getClass(), "updatedBy", "HBGNxdNURv");
        setLongField(term4778, term4778.getClass(), "seconds", 1444174640L);
        setIntField(term4778, term4778.getClass(), "nanos", 781000000);
        setField(term4708, term4708.getClass(), "updatedAt", term4778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term4708, args);
    }

};


