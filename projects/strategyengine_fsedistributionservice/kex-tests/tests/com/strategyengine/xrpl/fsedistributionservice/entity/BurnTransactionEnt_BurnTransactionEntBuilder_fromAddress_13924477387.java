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

public class BurnTransactionEnt_BurnTransactionEntBuilder_fromAddress_13924477387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241354;

    public BurnTransactionEnt_BurnTransactionEntBuilder_fromAddress_13924477387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241355 = new Long(-7163612258041042650L);
        Long term241369 = new Long(-7186158121023817313L);
        term241354 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder"));
        Object term241371 = newInstance(Class.forName("java.util.Date"));
        Object term241373 = newInstance(Class.forName("java.util.Date"));
        setField(term241354, term241354.getClass(), "id", term241355);
        setField(term241354, term241354.getClass(), "transactionHash", "DjjdYbIhNY");
        setField(term241354, term241354.getClass(), "ledgerIndex", term241369);
        setLongField(term241371, term241371.getClass(), "fastTime", 1374832698949L);
        setField(term241371, term241371.getClass(), "cdate", null);
        setField(term241354, term241354.getClass(), "createDate", term241371);
        setLongField(term241373, term241373.getClass(), "fastTime", 1595858433477L);
        setField(term241373, term241373.getClass(), "cdate", null);
        setField(term241354, term241354.getClass(), "txDate", term241373);
        setField(term241354, term241354.getClass(), "toAddress", "AGaeaoutjJ");
        setField(term241354, term241354.getClass(), "fromAddress", "oHWSUbpGiK");
        setField(term241354, term241354.getClass(), "amount", "RreVzKmtxf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xHBCsghEAi";
        callMethod(klass, "fromAddress", argTypes, term241354, args);
    }

};


