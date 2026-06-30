package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class TransactionEnt_getCode_17098695310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2453;

    public TransactionEnt_getCode_17098695310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2454 = new Long(5946780097489996391L);
        Long term2494 = new Long(-8652538484981166496L);
        Long term2496 = new Long(2701184207686293431L);
        term2453 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term2468 = newInstance(Class.forName("java.util.Date"));
        setField(term2453, term2453.getClass(), "id", term2454);
        setField(term2453, term2453.getClass(), "hash", "ytSBIKXogI");
        setLongField(term2468, term2468.getClass(), "fastTime", 1442370534632L);
        setField(term2468, term2468.getClass(), "cdate", null);
        setField(term2453, term2453.getClass(), "createDate", term2468);
        setField(term2453, term2453.getClass(), "failReason", "nHXjMycHlU");
        setField(term2453, term2453.getClass(), "code", "ieCtQFdkii");
        setField(term2453, term2453.getClass(), "dropRecipientId", term2494);
        setField(term2453, term2453.getClass(), "dropRequestId", term2496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCode", argTypes, term2453, args);
    }

};


