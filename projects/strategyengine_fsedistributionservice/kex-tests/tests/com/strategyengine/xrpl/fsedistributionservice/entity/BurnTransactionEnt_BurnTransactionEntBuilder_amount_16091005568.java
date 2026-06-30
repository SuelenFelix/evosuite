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

public class BurnTransactionEnt_BurnTransactionEntBuilder_amount_16091005568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241473;

    public BurnTransactionEnt_BurnTransactionEntBuilder_amount_16091005568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241474 = new Long(-8510452367371037137L);
        Long term241488 = new Long(2123432481270520381L);
        term241473 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder"));
        Object term241490 = newInstance(Class.forName("java.util.Date"));
        Object term241492 = newInstance(Class.forName("java.util.Date"));
        setField(term241473, term241473.getClass(), "id", term241474);
        setField(term241473, term241473.getClass(), "transactionHash", "BVlqqUSYbB");
        setField(term241473, term241473.getClass(), "ledgerIndex", term241488);
        setLongField(term241490, term241490.getClass(), "fastTime", 1592630701241L);
        setField(term241490, term241490.getClass(), "cdate", null);
        setField(term241473, term241473.getClass(), "createDate", term241490);
        setLongField(term241492, term241492.getClass(), "fastTime", 1392689921510L);
        setField(term241492, term241492.getClass(), "cdate", null);
        setField(term241473, term241473.getClass(), "txDate", term241492);
        setField(term241473, term241473.getClass(), "toAddress", "hhGHcwcBqB");
        setField(term241473, term241473.getClass(), "fromAddress", "WIVENkFxNU");
        setField(term241473, term241473.getClass(), "amount", "MFSosHURtm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hIBYlJpYye";
        callMethod(klass, "amount", argTypes, term241473, args);
    }

};


