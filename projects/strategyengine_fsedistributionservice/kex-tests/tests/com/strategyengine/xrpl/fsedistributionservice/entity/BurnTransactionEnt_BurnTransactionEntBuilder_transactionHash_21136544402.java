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

public class BurnTransactionEnt_BurnTransactionEntBuilder_transactionHash_21136544402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240819;

    public BurnTransactionEnt_BurnTransactionEntBuilder_transactionHash_21136544402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term240820 = new Long(3610800451815944213L);
        Long term240834 = new Long(-3548672426577893003L);
        term240819 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder"));
        Object term240836 = newInstance(Class.forName("java.util.Date"));
        Object term240838 = newInstance(Class.forName("java.util.Date"));
        setField(term240819, term240819.getClass(), "id", term240820);
        setField(term240819, term240819.getClass(), "transactionHash", "IcpfsIGlDf");
        setField(term240819, term240819.getClass(), "ledgerIndex", term240834);
        setLongField(term240836, term240836.getClass(), "fastTime", 1711962944595L);
        setField(term240836, term240836.getClass(), "cdate", null);
        setField(term240819, term240819.getClass(), "createDate", term240836);
        setLongField(term240838, term240838.getClass(), "fastTime", 1327636883373L);
        setField(term240838, term240838.getClass(), "cdate", null);
        setField(term240819, term240819.getClass(), "txDate", term240838);
        setField(term240819, term240819.getClass(), "toAddress", "xCfGcRdHTK");
        setField(term240819, term240819.getClass(), "fromAddress", "KKHQCvKTvF");
        setField(term240819, term240819.getClass(), "amount", "XBhNIIxiNP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JljyXnwkuC";
        callMethod(klass, "transactionHash", argTypes, term240819, args);
    }

};


