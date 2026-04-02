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

public class ComputerEntity_setCreatedDate_181936115110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2040;
     Object term2070;

    public ComputerEntity_setCreatedDate_181936115110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2041 = new Long(-7612550318181586304L);
        term2040 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term2068 = newInstance(Class.forName("java.util.Date"));
        setField(term2040, term2040.getClass(), "computerId", term2041);
        setField(term2040, term2040.getClass(), "computerName", "vQVyKLdtaz");
        setField(term2040, term2040.getClass(), "computerTrade", "OWKQODBLzb");
        setDoubleField(term2040, term2040.getClass(), "computerPrice", 0.3202192021706908);
        setLongField(term2068, term2068.getClass(), "fastTime", 1695425269458L);
        setField(term2068, term2068.getClass(), "cdate", null);
        setField(term2040, term2040.getClass(), "createdDate", term2068);
        term2070 = newInstance(Class.forName("java.util.Date"));
        setLongField(term2070, term2070.getClass(), "fastTime", 1362780563394L);
        setField(term2070, term2070.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term2070;
        callMethod(klass, "setCreatedDate", argTypes, term2040, args);
    }

};


