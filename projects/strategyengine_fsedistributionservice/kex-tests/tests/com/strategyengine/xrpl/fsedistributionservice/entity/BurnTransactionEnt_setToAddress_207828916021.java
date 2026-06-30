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

public class BurnTransactionEnt_setToAddress_207828916021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235610;

    public BurnTransactionEnt_setToAddress_207828916021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235611 = new Long(4036794646678680547L);
        Long term235625 = new Long(4006388896509492239L);
        term235610 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term235627 = newInstance(Class.forName("java.util.Date"));
        Object term235629 = newInstance(Class.forName("java.util.Date"));
        setField(term235610, term235610.getClass(), "id", term235611);
        setField(term235610, term235610.getClass(), "transactionHash", "NbFVXCPmxn");
        setField(term235610, term235610.getClass(), "ledgerIndex", term235625);
        setLongField(term235627, term235627.getClass(), "fastTime", 1482556687275L);
        setField(term235627, term235627.getClass(), "cdate", null);
        setField(term235610, term235610.getClass(), "createDate", term235627);
        setLongField(term235629, term235629.getClass(), "fastTime", 1469121031540L);
        setField(term235629, term235629.getClass(), "cdate", null);
        setField(term235610, term235610.getClass(), "txDate", term235629);
        setField(term235610, term235610.getClass(), "toAddress", "ovYlGvhKKO");
        setField(term235610, term235610.getClass(), "fromAddress", "JvoSiMCDAb");
        setField(term235610, term235610.getClass(), "amount", "JANJXHGMsv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVQqsFGJMw";
        callMethod(klass, "setToAddress", argTypes, term235610, args);
    }

};


