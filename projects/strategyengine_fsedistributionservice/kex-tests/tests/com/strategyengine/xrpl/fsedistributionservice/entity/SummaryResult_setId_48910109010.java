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

public class SummaryResult_setId_48910109010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251206;
     Object term251211;

    public SummaryResult_setId_48910109010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term251207 = new Long(8202413349907503373L);
        Long term251209 = new Long(4715419421865334491L);
        term251206 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.SummaryResult"));
        setField(term251206, term251206.getClass(), "id", term251207);
        setField(term251206, term251206.getClass(), "count", term251209);
        term251211 = new Long(6320559761926095887L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.SummaryResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term251211;
        callMethod(klass, "setId", argTypes, term251206, args);
    }

};


