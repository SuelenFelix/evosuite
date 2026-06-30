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

public class BurnTransactionEnt_BurnTransactionEntBuilder_txDate_177953651716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241790;

    public BurnTransactionEnt_BurnTransactionEntBuilder_txDate_177953651716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241790 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder"));
        setField(term241790, term241790.getClass(), "id", null);
        setField(term241790, term241790.getClass(), "transactionHash", null);
        setField(term241790, term241790.getClass(), "ledgerIndex", null);
        setField(term241790, term241790.getClass(), "createDate", null);
        setField(term241790, term241790.getClass(), "txDate", null);
        setField(term241790, term241790.getClass(), "toAddress", null);
        setField(term241790, term241790.getClass(), "fromAddress", null);
        setField(term241790, term241790.getClass(), "amount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "txDate", argTypes, term241790, args);
    }

};


