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

public class CancelDropRequestEnt_CancelDropRequestEntBuilder_createDate_8040266272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241805;
     Object term241812;

    public CancelDropRequestEnt_CancelDropRequestEntBuilder_createDate_8040266272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241806 = new Long(4337555582321907177L);
        Long term241810 = new Long(-6367418587326372844L);
        term241805 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt$CancelDropRequestEntBuilder"));
        Object term241808 = newInstance(Class.forName("java.util.Date"));
        setField(term241805, term241805.getClass(), "id", term241806);
        setLongField(term241808, term241808.getClass(), "fastTime", 1495040730024L);
        setField(term241808, term241808.getClass(), "cdate", null);
        setField(term241805, term241805.getClass(), "createDate", term241808);
        setField(term241805, term241805.getClass(), "dropRequestId", term241810);
        term241812 = newInstance(Class.forName("java.util.Date"));
        setLongField(term241812, term241812.getClass(), "fastTime", 1629430114393L);
        setField(term241812, term241812.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt$CancelDropRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term241812;
        callMethod(klass, "createDate", argTypes, term241805, args);
    }

};


