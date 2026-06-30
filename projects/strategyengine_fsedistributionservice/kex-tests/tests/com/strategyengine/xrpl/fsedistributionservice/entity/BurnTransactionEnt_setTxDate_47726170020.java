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

public class BurnTransactionEnt_setTxDate_47726170020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235511;
     Object term235568;

    public BurnTransactionEnt_setTxDate_47726170020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235512 = new Long(-8211240904293846981L);
        Long term235526 = new Long(3535528164828723056L);
        term235511 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term235528 = newInstance(Class.forName("java.util.Date"));
        Object term235530 = newInstance(Class.forName("java.util.Date"));
        setField(term235511, term235511.getClass(), "id", term235512);
        setField(term235511, term235511.getClass(), "transactionHash", "fDVzkGiHev");
        setField(term235511, term235511.getClass(), "ledgerIndex", term235526);
        setLongField(term235528, term235528.getClass(), "fastTime", 1587972339860L);
        setField(term235528, term235528.getClass(), "cdate", null);
        setField(term235511, term235511.getClass(), "createDate", term235528);
        setLongField(term235530, term235530.getClass(), "fastTime", 1420676685312L);
        setField(term235530, term235530.getClass(), "cdate", null);
        setField(term235511, term235511.getClass(), "txDate", term235530);
        setField(term235511, term235511.getClass(), "toAddress", "CanAbWJNgt");
        setField(term235511, term235511.getClass(), "fromAddress", "tFRLUuSeUt");
        setField(term235511, term235511.getClass(), "amount", "KcKxvbBAHa");
        term235568 = newInstance(Class.forName("java.util.Date"));
        setLongField(term235568, term235568.getClass(), "fastTime", 1660581012376L);
        setField(term235568, term235568.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term235568;
        callMethod(klass, "setTxDate", argTypes, term235511, args);
    }

};


