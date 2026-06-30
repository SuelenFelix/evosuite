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

public class BurnTransactionEnt_BurnTransactionEntBuilder_txDate_17795365175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241136;
     Object term241193;

    public BurnTransactionEnt_BurnTransactionEntBuilder_txDate_17795365175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241137 = new Long(2201264121669950608L);
        Long term241151 = new Long(4911393165710268247L);
        term241136 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder"));
        Object term241153 = newInstance(Class.forName("java.util.Date"));
        Object term241155 = newInstance(Class.forName("java.util.Date"));
        setField(term241136, term241136.getClass(), "id", term241137);
        setField(term241136, term241136.getClass(), "transactionHash", "oZDNpnQlCv");
        setField(term241136, term241136.getClass(), "ledgerIndex", term241151);
        setLongField(term241153, term241153.getClass(), "fastTime", 1613844001053L);
        setField(term241153, term241153.getClass(), "cdate", null);
        setField(term241136, term241136.getClass(), "createDate", term241153);
        setLongField(term241155, term241155.getClass(), "fastTime", 1737400295143L);
        setField(term241155, term241155.getClass(), "cdate", null);
        setField(term241136, term241136.getClass(), "txDate", term241155);
        setField(term241136, term241136.getClass(), "toAddress", "NdPeQAHWKN");
        setField(term241136, term241136.getClass(), "fromAddress", "giGQTpcQuV");
        setField(term241136, term241136.getClass(), "amount", "IWCccrYFQd");
        term241193 = newInstance(Class.forName("java.util.Date"));
        setLongField(term241193, term241193.getClass(), "fastTime", 1504042626647L);
        setField(term241193, term241193.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term241193;
        callMethod(klass, "txDate", argTypes, term241136, args);
    }

};


