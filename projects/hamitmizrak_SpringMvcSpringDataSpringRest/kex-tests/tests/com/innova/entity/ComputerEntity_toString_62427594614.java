package com.innova.entity;

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
import static com.innova.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ComputerEntity_toString_62427594614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2244;

    public ComputerEntity_toString_62427594614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2245 = new Long(-3842548265506930260L);
        term2244 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term2272 = newInstance(Class.forName("java.util.Date"));
        setField(term2244, term2244.getClass(), "computerId", term2245);
        setField(term2244, term2244.getClass(), "computerName", "LvJFtLBaxj");
        setField(term2244, term2244.getClass(), "computerTrade", "PHvxnGHptP");
        setDoubleField(term2244, term2244.getClass(), "computerPrice", 0.6397214730945112);
        setLongField(term2272, term2272.getClass(), "fastTime", 1843214817357L);
        setField(term2272, term2272.getClass(), "cdate", null);
        setField(term2244, term2244.getClass(), "createdDate", term2272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2244, args);
    }

};


