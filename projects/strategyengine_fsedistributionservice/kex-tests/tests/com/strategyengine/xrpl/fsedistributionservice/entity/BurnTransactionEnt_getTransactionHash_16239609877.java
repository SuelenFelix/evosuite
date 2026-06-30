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

public class BurnTransactionEnt_getTransactionHash_16239609877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234320;

    public BurnTransactionEnt_getTransactionHash_16239609877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234321 = new Long(-8957441653116712448L);
        Long term234335 = new Long(-5761087225966065493L);
        term234320 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term234337 = newInstance(Class.forName("java.util.Date"));
        Object term234339 = newInstance(Class.forName("java.util.Date"));
        setField(term234320, term234320.getClass(), "id", term234321);
        setField(term234320, term234320.getClass(), "transactionHash", "FZQimBsMNt");
        setField(term234320, term234320.getClass(), "ledgerIndex", term234335);
        setLongField(term234337, term234337.getClass(), "fastTime", 1670946906342L);
        setField(term234337, term234337.getClass(), "cdate", null);
        setField(term234320, term234320.getClass(), "createDate", term234337);
        setLongField(term234339, term234339.getClass(), "fastTime", 1634320653008L);
        setField(term234339, term234339.getClass(), "cdate", null);
        setField(term234320, term234320.getClass(), "txDate", term234339);
        setField(term234320, term234320.getClass(), "toAddress", "lowANLpXCV");
        setField(term234320, term234320.getClass(), "fromAddress", "orjiIcUIcD");
        setField(term234320, term234320.getClass(), "amount", "lGzFueHQqZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTransactionHash", argTypes, term234320, args);
    }

};


