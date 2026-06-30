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

public class BurnTransactionEnt_canEqual_15469612353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233931;
     Object term233988;

    public BurnTransactionEnt_canEqual_15469612353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term233932 = new Long(204473662283899955L);
        Long term233946 = new Long(-4029227951294167228L);
        term233931 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term233948 = newInstance(Class.forName("java.util.Date"));
        Object term233950 = newInstance(Class.forName("java.util.Date"));
        setField(term233931, term233931.getClass(), "id", term233932);
        setField(term233931, term233931.getClass(), "transactionHash", "QyHVDeaOqb");
        setField(term233931, term233931.getClass(), "ledgerIndex", term233946);
        setLongField(term233948, term233948.getClass(), "fastTime", 1789150469934L);
        setField(term233948, term233948.getClass(), "cdate", null);
        setField(term233931, term233931.getClass(), "createDate", term233948);
        setLongField(term233950, term233950.getClass(), "fastTime", 1648656122159L);
        setField(term233950, term233950.getClass(), "cdate", null);
        setField(term233931, term233931.getClass(), "txDate", term233950);
        setField(term233931, term233931.getClass(), "toAddress", "ZwnEWySrcE");
        setField(term233931, term233931.getClass(), "fromAddress", "laQWfyDqCq");
        setField(term233931, term233931.getClass(), "amount", "gMFGfpbPZE");
        term233988 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term233988;
        callMethod(klass, "canEqual", argTypes, term233931, args);
    }

};


