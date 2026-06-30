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

public class BurnTransactionEnt_getCreateDate_161808126633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235976;

    public BurnTransactionEnt_getCreateDate_161808126633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235976 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        setField(term235976, term235976.getClass(), "id", null);
        setField(term235976, term235976.getClass(), "transactionHash", null);
        setField(term235976, term235976.getClass(), "ledgerIndex", null);
        setField(term235976, term235976.getClass(), "createDate", null);
        setField(term235976, term235976.getClass(), "txDate", null);
        setField(term235976, term235976.getClass(), "toAddress", null);
        setField(term235976, term235976.getClass(), "fromAddress", null);
        setField(term235976, term235976.getClass(), "amount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term235976, args);
    }

};


