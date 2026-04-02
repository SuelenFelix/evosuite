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

public class BurnTransactionEnt_BurnTransactionEntBuilder_toAddress_1464779096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241235;

    public BurnTransactionEnt_BurnTransactionEntBuilder_toAddress_1464779096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241236 = new Long(-836309941570511418L);
        Long term241250 = new Long(-4851193391918639512L);
        term241235 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder"));
        Object term241252 = newInstance(Class.forName("java.util.Date"));
        Object term241254 = newInstance(Class.forName("java.util.Date"));
        setField(term241235, term241235.getClass(), "id", term241236);
        setField(term241235, term241235.getClass(), "transactionHash", "zpkdYKWkCa");
        setField(term241235, term241235.getClass(), "ledgerIndex", term241250);
        setLongField(term241252, term241252.getClass(), "fastTime", 1339088205799L);
        setField(term241252, term241252.getClass(), "cdate", null);
        setField(term241235, term241235.getClass(), "createDate", term241252);
        setLongField(term241254, term241254.getClass(), "fastTime", 1274416785563L);
        setField(term241254, term241254.getClass(), "cdate", null);
        setField(term241235, term241235.getClass(), "txDate", term241254);
        setField(term241235, term241235.getClass(), "toAddress", "mvOJAtEcWR");
        setField(term241235, term241235.getClass(), "fromAddress", "QybezBkmJu");
        setField(term241235, term241235.getClass(), "amount", "uWIrREgpjs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TmEdDFXkTZ";
        callMethod(klass, "toAddress", argTypes, term241235, args);
    }

};


