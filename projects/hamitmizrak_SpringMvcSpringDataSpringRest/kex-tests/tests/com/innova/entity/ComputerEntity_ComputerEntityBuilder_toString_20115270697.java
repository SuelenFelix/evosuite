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

public class ComputerEntity_ComputerEntityBuilder_toString_20115270697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1476;

    public ComputerEntity_ComputerEntityBuilder_toString_20115270697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1477 = new Long(-484994522244390100L);
        term1476 = newInstance(Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder"));
        Object term1504 = newInstance(Class.forName("java.util.Date"));
        setField(term1476, term1476.getClass(), "computerId", term1477);
        setField(term1476, term1476.getClass(), "computerName", "YRHGsAkhxb");
        setField(term1476, term1476.getClass(), "computerTrade", "ffYhPOzlUs");
        setDoubleField(term1476, term1476.getClass(), "computerPrice", 0.10667076642995188);
        setLongField(term1504, term1504.getClass(), "fastTime", 1405279189488L);
        setField(term1504, term1504.getClass(), "cdate", null);
        setField(term1476, term1476.getClass(), "createdDate", term1504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1476, args);
    }

};


