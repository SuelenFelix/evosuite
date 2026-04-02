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

public class TransactionEnt_getDropRecipientId_91557768211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2528;

    public TransactionEnt_getDropRecipientId_91557768211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2529 = new Long(4474998035090263139L);
        Long term2569 = new Long(2848819812340321742L);
        Long term2571 = new Long(-8876856890348836498L);
        term2528 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term2543 = newInstance(Class.forName("java.util.Date"));
        setField(term2528, term2528.getClass(), "id", term2529);
        setField(term2528, term2528.getClass(), "hash", "dEnhdmILtU");
        setLongField(term2543, term2543.getClass(), "fastTime", 1659994192918L);
        setField(term2543, term2543.getClass(), "cdate", null);
        setField(term2528, term2528.getClass(), "createDate", term2543);
        setField(term2528, term2528.getClass(), "failReason", "hoicvmsovO");
        setField(term2528, term2528.getClass(), "code", "eqJfYWRaEL");
        setField(term2528, term2528.getClass(), "dropRecipientId", term2569);
        setField(term2528, term2528.getClass(), "dropRequestId", term2571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDropRecipientId", argTypes, term2528, args);
    }

};


