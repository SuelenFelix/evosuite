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

public class BurnTransactionEnt_getLedgerIndex_21053402538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234417;

    public BurnTransactionEnt_getLedgerIndex_21053402538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234418 = new Long(493557348274366095L);
        Long term234432 = new Long(8699742215739444902L);
        term234417 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term234434 = newInstance(Class.forName("java.util.Date"));
        Object term234436 = newInstance(Class.forName("java.util.Date"));
        setField(term234417, term234417.getClass(), "id", term234418);
        setField(term234417, term234417.getClass(), "transactionHash", "cjiDFHGGlp");
        setField(term234417, term234417.getClass(), "ledgerIndex", term234432);
        setLongField(term234434, term234434.getClass(), "fastTime", 1661068134108L);
        setField(term234434, term234434.getClass(), "cdate", null);
        setField(term234417, term234417.getClass(), "createDate", term234434);
        setLongField(term234436, term234436.getClass(), "fastTime", 1825772492805L);
        setField(term234436, term234436.getClass(), "cdate", null);
        setField(term234417, term234417.getClass(), "txDate", term234436);
        setField(term234417, term234417.getClass(), "toAddress", "XLjtkfroHJ");
        setField(term234417, term234417.getClass(), "fromAddress", "hdqypaATat");
        setField(term234417, term234417.getClass(), "amount", "yXrHDHEipD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLedgerIndex", argTypes, term234417, args);
    }

};


