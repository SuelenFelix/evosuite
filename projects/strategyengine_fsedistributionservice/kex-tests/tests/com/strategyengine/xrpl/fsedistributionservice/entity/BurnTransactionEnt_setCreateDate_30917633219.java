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

public class BurnTransactionEnt_setCreateDate_30917633219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235412;
     Object term235469;

    public BurnTransactionEnt_setCreateDate_30917633219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235413 = new Long(5857854340777182167L);
        Long term235427 = new Long(3660520943100987842L);
        term235412 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term235429 = newInstance(Class.forName("java.util.Date"));
        Object term235431 = newInstance(Class.forName("java.util.Date"));
        setField(term235412, term235412.getClass(), "id", term235413);
        setField(term235412, term235412.getClass(), "transactionHash", "WHpoLWpffz");
        setField(term235412, term235412.getClass(), "ledgerIndex", term235427);
        setLongField(term235429, term235429.getClass(), "fastTime", 1289611323461L);
        setField(term235429, term235429.getClass(), "cdate", null);
        setField(term235412, term235412.getClass(), "createDate", term235429);
        setLongField(term235431, term235431.getClass(), "fastTime", 1429704108059L);
        setField(term235431, term235431.getClass(), "cdate", null);
        setField(term235412, term235412.getClass(), "txDate", term235431);
        setField(term235412, term235412.getClass(), "toAddress", "axiXBkomuw");
        setField(term235412, term235412.getClass(), "fromAddress", "nhByIXwUpO");
        setField(term235412, term235412.getClass(), "amount", "vVySvQZVok");
        term235469 = newInstance(Class.forName("java.util.Date"));
        setLongField(term235469, term235469.getClass(), "fastTime", 1781537434241L);
        setField(term235469, term235469.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term235469;
        callMethod(klass, "setCreateDate", argTypes, term235412, args);
    }

};


