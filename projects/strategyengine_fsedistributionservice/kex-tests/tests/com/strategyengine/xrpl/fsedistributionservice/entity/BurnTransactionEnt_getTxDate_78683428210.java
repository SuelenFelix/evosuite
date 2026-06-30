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

public class BurnTransactionEnt_getTxDate_78683428210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234611;

    public BurnTransactionEnt_getTxDate_78683428210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234612 = new Long(5498944509671266637L);
        Long term234626 = new Long(-6838909359433858599L);
        term234611 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term234628 = newInstance(Class.forName("java.util.Date"));
        Object term234630 = newInstance(Class.forName("java.util.Date"));
        setField(term234611, term234611.getClass(), "id", term234612);
        setField(term234611, term234611.getClass(), "transactionHash", "NbmTxmqOjh");
        setField(term234611, term234611.getClass(), "ledgerIndex", term234626);
        setLongField(term234628, term234628.getClass(), "fastTime", 1370469229141L);
        setField(term234628, term234628.getClass(), "cdate", null);
        setField(term234611, term234611.getClass(), "createDate", term234628);
        setLongField(term234630, term234630.getClass(), "fastTime", 1557946678025L);
        setField(term234630, term234630.getClass(), "cdate", null);
        setField(term234611, term234611.getClass(), "txDate", term234630);
        setField(term234611, term234611.getClass(), "toAddress", "rLDmBbcLaC");
        setField(term234611, term234611.getClass(), "fromAddress", "tUKcXglBlG");
        setField(term234611, term234611.getClass(), "amount", "ZGptycjjRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTxDate", argTypes, term234611, args);
    }

};


