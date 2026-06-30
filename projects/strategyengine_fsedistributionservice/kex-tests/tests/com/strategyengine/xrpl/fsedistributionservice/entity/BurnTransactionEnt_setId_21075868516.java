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

public class BurnTransactionEnt_setId_21075868516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235095;
     Object term235152;

    public BurnTransactionEnt_setId_21075868516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235096 = new Long(7893661350133453338L);
        Long term235110 = new Long(9056245012917372169L);
        term235095 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term235112 = newInstance(Class.forName("java.util.Date"));
        Object term235114 = newInstance(Class.forName("java.util.Date"));
        setField(term235095, term235095.getClass(), "id", term235096);
        setField(term235095, term235095.getClass(), "transactionHash", "eiDqCOWbLE");
        setField(term235095, term235095.getClass(), "ledgerIndex", term235110);
        setLongField(term235112, term235112.getClass(), "fastTime", 1349598435730L);
        setField(term235112, term235112.getClass(), "cdate", null);
        setField(term235095, term235095.getClass(), "createDate", term235112);
        setLongField(term235114, term235114.getClass(), "fastTime", 1665698884619L);
        setField(term235114, term235114.getClass(), "cdate", null);
        setField(term235095, term235095.getClass(), "txDate", term235114);
        setField(term235095, term235095.getClass(), "toAddress", "OBbbsrFNxC");
        setField(term235095, term235095.getClass(), "fromAddress", "mvdZyohjrq");
        setField(term235095, term235095.getClass(), "amount", "hXsByefZqZ");
        term235152 = new Long(7848004402682338886L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term235152;
        callMethod(klass, "setId", argTypes, term235095, args);
    }

};


