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

public class BurnTransactionEnt_BurnTransactionEntBuilder_createDate_13996797414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241037;
     Object term241094;

    public BurnTransactionEnt_BurnTransactionEntBuilder_createDate_13996797414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241038 = new Long(-7966859634511305171L);
        Long term241052 = new Long(5885163998873132588L);
        term241037 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder"));
        Object term241054 = newInstance(Class.forName("java.util.Date"));
        Object term241056 = newInstance(Class.forName("java.util.Date"));
        setField(term241037, term241037.getClass(), "id", term241038);
        setField(term241037, term241037.getClass(), "transactionHash", "JraVClZLWB");
        setField(term241037, term241037.getClass(), "ledgerIndex", term241052);
        setLongField(term241054, term241054.getClass(), "fastTime", 1398084101491L);
        setField(term241054, term241054.getClass(), "cdate", null);
        setField(term241037, term241037.getClass(), "createDate", term241054);
        setLongField(term241056, term241056.getClass(), "fastTime", 1355118893997L);
        setField(term241056, term241056.getClass(), "cdate", null);
        setField(term241037, term241037.getClass(), "txDate", term241056);
        setField(term241037, term241037.getClass(), "toAddress", "PxscjEhxGk");
        setField(term241037, term241037.getClass(), "fromAddress", "ePFnljQSHU");
        setField(term241037, term241037.getClass(), "amount", "wedLWAuOOY");
        term241094 = newInstance(Class.forName("java.util.Date"));
        setLongField(term241094, term241094.getClass(), "fastTime", 1852023296484L);
        setField(term241094, term241094.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term241094;
        callMethod(klass, "createDate", argTypes, term241037, args);
    }

};


