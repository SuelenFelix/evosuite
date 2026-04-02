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

public class BurnTransactionEnt_BurnTransactionEntBuilder_ledgerIndex_7684262983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240938;
     Object term240995;

    public BurnTransactionEnt_BurnTransactionEntBuilder_ledgerIndex_7684262983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term240939 = new Long(1592020674405941254L);
        Long term240953 = new Long(4098407345651793258L);
        term240938 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder"));
        Object term240955 = newInstance(Class.forName("java.util.Date"));
        Object term240957 = newInstance(Class.forName("java.util.Date"));
        setField(term240938, term240938.getClass(), "id", term240939);
        setField(term240938, term240938.getClass(), "transactionHash", "XLOxkLyvMY");
        setField(term240938, term240938.getClass(), "ledgerIndex", term240953);
        setLongField(term240955, term240955.getClass(), "fastTime", 1553138390451L);
        setField(term240955, term240955.getClass(), "cdate", null);
        setField(term240938, term240938.getClass(), "createDate", term240955);
        setLongField(term240957, term240957.getClass(), "fastTime", 1476253051731L);
        setField(term240957, term240957.getClass(), "cdate", null);
        setField(term240938, term240938.getClass(), "txDate", term240957);
        setField(term240938, term240938.getClass(), "toAddress", "pjUyKHjjKH");
        setField(term240938, term240938.getClass(), "fromAddress", "JApuaiAykc");
        setField(term240938, term240938.getClass(), "amount", "NJWFosJfXl");
        term240995 = new Long(3128610259359668233L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term240995;
        callMethod(klass, "ledgerIndex", argTypes, term240938, args);
    }

};


