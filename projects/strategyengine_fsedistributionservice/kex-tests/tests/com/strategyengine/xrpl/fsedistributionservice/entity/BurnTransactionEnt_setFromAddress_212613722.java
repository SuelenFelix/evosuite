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

public class BurnTransactionEnt_setFromAddress_212613722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235729;

    public BurnTransactionEnt_setFromAddress_212613722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235730 = new Long(-6314099457945626605L);
        Long term235744 = new Long(-8697239524885136781L);
        term235729 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term235746 = newInstance(Class.forName("java.util.Date"));
        Object term235748 = newInstance(Class.forName("java.util.Date"));
        setField(term235729, term235729.getClass(), "id", term235730);
        setField(term235729, term235729.getClass(), "transactionHash", "TIPSlmidwP");
        setField(term235729, term235729.getClass(), "ledgerIndex", term235744);
        setLongField(term235746, term235746.getClass(), "fastTime", 1722592916634L);
        setField(term235746, term235746.getClass(), "cdate", null);
        setField(term235729, term235729.getClass(), "createDate", term235746);
        setLongField(term235748, term235748.getClass(), "fastTime", 1590910557091L);
        setField(term235748, term235748.getClass(), "cdate", null);
        setField(term235729, term235729.getClass(), "txDate", term235748);
        setField(term235729, term235729.getClass(), "toAddress", "SRYeqWJJkR");
        setField(term235729, term235729.getClass(), "fromAddress", "vUVScKcyFY");
        setField(term235729, term235729.getClass(), "amount", "DCSMbuGiaM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wtOVzMPrFU";
        callMethod(klass, "setFromAddress", argTypes, term235729, args);
    }

};


