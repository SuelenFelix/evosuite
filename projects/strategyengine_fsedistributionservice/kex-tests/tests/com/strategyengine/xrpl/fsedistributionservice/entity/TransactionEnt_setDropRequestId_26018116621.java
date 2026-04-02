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

public class TransactionEnt_setDropRequestId_26018116621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3274;
     Object term3319;

    public TransactionEnt_setDropRequestId_26018116621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3275 = new Long(-4924950707540628022L);
        Long term3315 = new Long(-4393710401270724527L);
        Long term3317 = new Long(-4822736661741380518L);
        term3274 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term3289 = newInstance(Class.forName("java.util.Date"));
        setField(term3274, term3274.getClass(), "id", term3275);
        setField(term3274, term3274.getClass(), "hash", "xOcJIiQQDu");
        setLongField(term3289, term3289.getClass(), "fastTime", 1666076287186L);
        setField(term3289, term3289.getClass(), "cdate", null);
        setField(term3274, term3274.getClass(), "createDate", term3289);
        setField(term3274, term3274.getClass(), "failReason", "GVizqqzXpy");
        setField(term3274, term3274.getClass(), "code", "JqXGgAhZPl");
        setField(term3274, term3274.getClass(), "dropRecipientId", term3315);
        setField(term3274, term3274.getClass(), "dropRequestId", term3317);
        term3319 = new Long(-5386201758403679145L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3319;
        callMethod(klass, "setDropRequestId", argTypes, term3274, args);
    }

};


