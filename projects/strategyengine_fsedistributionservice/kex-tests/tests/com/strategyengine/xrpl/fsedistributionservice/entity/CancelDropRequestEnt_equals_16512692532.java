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

public class CancelDropRequestEnt_equals_16512692532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8;
     Object term15;

    public CancelDropRequestEnt_equals_16512692532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9 = new Long(-8257434502486459194L);
        Long term13 = new Long(-8400487765614892086L);
        term8 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt"));
        Object term11 = newInstance(Class.forName("java.util.Date"));
        setField(term8, term8.getClass(), "id", term9);
        setLongField(term11, term11.getClass(), "fastTime", 1480438351369L);
        setField(term11, term11.getClass(), "cdate", null);
        setField(term8, term8.getClass(), "createDate", term11);
        setField(term8, term8.getClass(), "dropRequestId", term13);
        term15 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15;
        callMethod(klass, "equals", argTypes, term8, args);
    }

};


