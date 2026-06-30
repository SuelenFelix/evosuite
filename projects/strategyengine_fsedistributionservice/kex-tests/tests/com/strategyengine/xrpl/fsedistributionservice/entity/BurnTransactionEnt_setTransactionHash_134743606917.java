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

public class BurnTransactionEnt_setTransactionHash_134743606917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235194;

    public BurnTransactionEnt_setTransactionHash_134743606917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235195 = new Long(8931772176819893873L);
        Long term235209 = new Long(-4370635295110591519L);
        term235194 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term235211 = newInstance(Class.forName("java.util.Date"));
        Object term235213 = newInstance(Class.forName("java.util.Date"));
        setField(term235194, term235194.getClass(), "id", term235195);
        setField(term235194, term235194.getClass(), "transactionHash", "PfWKdFFgbz");
        setField(term235194, term235194.getClass(), "ledgerIndex", term235209);
        setLongField(term235211, term235211.getClass(), "fastTime", 1336455625156L);
        setField(term235211, term235211.getClass(), "cdate", null);
        setField(term235194, term235194.getClass(), "createDate", term235211);
        setLongField(term235213, term235213.getClass(), "fastTime", 1329540837220L);
        setField(term235213, term235213.getClass(), "cdate", null);
        setField(term235194, term235194.getClass(), "txDate", term235213);
        setField(term235194, term235194.getClass(), "toAddress", "rgmFLfFmTW");
        setField(term235194, term235194.getClass(), "fromAddress", "GHvFvelXFv");
        setField(term235194, term235194.getClass(), "amount", "MIDoqNmCoh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yrOIMfdQSI";
        callMethod(klass, "setTransactionHash", argTypes, term235194, args);
    }

};


