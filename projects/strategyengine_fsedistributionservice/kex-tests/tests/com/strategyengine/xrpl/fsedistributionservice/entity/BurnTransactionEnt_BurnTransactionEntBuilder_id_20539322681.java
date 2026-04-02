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

public class BurnTransactionEnt_BurnTransactionEntBuilder_id_20539322681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240720;
     Object term240777;

    public BurnTransactionEnt_BurnTransactionEntBuilder_id_20539322681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term240721 = new Long(-4703513086610650698L);
        Long term240735 = new Long(-8123300791906968552L);
        term240720 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder"));
        Object term240737 = newInstance(Class.forName("java.util.Date"));
        Object term240739 = newInstance(Class.forName("java.util.Date"));
        setField(term240720, term240720.getClass(), "id", term240721);
        setField(term240720, term240720.getClass(), "transactionHash", "GqehccUels");
        setField(term240720, term240720.getClass(), "ledgerIndex", term240735);
        setLongField(term240737, term240737.getClass(), "fastTime", 1595892323510L);
        setField(term240737, term240737.getClass(), "cdate", null);
        setField(term240720, term240720.getClass(), "createDate", term240737);
        setLongField(term240739, term240739.getClass(), "fastTime", 1483532063102L);
        setField(term240739, term240739.getClass(), "cdate", null);
        setField(term240720, term240720.getClass(), "txDate", term240739);
        setField(term240720, term240720.getClass(), "toAddress", "llbDGujrPe");
        setField(term240720, term240720.getClass(), "fromAddress", "QEoeITwBfz");
        setField(term240720, term240720.getClass(), "amount", "rWOKjAUIvS");
        term240777 = new Long(7654605795400256601L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term240777;
        callMethod(klass, "id", argTypes, term240720, args);
    }

};


