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

public class TransactionEnt_init_133400297814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2678;
     Object term2692;
     Object term2718;
     Object term2720;

    public TransactionEnt_init_133400297814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2678 = new Long(-2177368829816872572L);
        term2692 = newInstance(Class.forName("java.util.Date"));
        setLongField(term2692, term2692.getClass(), "fastTime", 1304532099366L);
        setField(term2692, term2692.getClass(), "cdate", null);
        term2718 = new Long(-8463029266761149071L);
        term2720 = new Long(3133860696238261492L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Date");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.Long");
        argTypes[6] = Class.forName("java.lang.Long");
        Object[] args = new Object[7];
        args[0] = term2678;
        args[1] = "TJmVBGfTML";
        args[2] = term2692;
        args[3] = "tPlsykYBqO";
        args[4] = "bLPjGVBhlX";
        args[5] = term2718;
        args[6] = term2720;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


