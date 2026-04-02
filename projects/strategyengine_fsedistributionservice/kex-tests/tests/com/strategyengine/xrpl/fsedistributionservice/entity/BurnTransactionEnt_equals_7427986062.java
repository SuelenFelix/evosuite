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

public class BurnTransactionEnt_equals_7427986062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233833;
     Object term233890;

    public BurnTransactionEnt_equals_7427986062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term233834 = new Long(-894705411488729365L);
        Long term233848 = new Long(-7514437039500876647L);
        term233833 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term233850 = newInstance(Class.forName("java.util.Date"));
        Object term233852 = newInstance(Class.forName("java.util.Date"));
        setField(term233833, term233833.getClass(), "id", term233834);
        setField(term233833, term233833.getClass(), "transactionHash", "jkCUxevJxb");
        setField(term233833, term233833.getClass(), "ledgerIndex", term233848);
        setLongField(term233850, term233850.getClass(), "fastTime", 1309448020135L);
        setField(term233850, term233850.getClass(), "cdate", null);
        setField(term233833, term233833.getClass(), "createDate", term233850);
        setLongField(term233852, term233852.getClass(), "fastTime", 1601567268249L);
        setField(term233852, term233852.getClass(), "cdate", null);
        setField(term233833, term233833.getClass(), "txDate", term233852);
        setField(term233833, term233833.getClass(), "toAddress", "WqobQIRpLc");
        setField(term233833, term233833.getClass(), "fromAddress", "jesZbitPYU");
        setField(term233833, term233833.getClass(), "amount", "oIbEvXxpda");
        term233890 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term233890;
        callMethod(klass, "equals", argTypes, term233833, args);
    }

};


