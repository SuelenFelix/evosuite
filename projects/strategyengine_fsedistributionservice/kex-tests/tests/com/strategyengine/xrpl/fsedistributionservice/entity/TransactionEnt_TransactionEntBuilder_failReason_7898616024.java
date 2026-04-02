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

public class TransactionEnt_TransactionEntBuilder_failReason_7898616024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1269;

    public TransactionEnt_TransactionEntBuilder_failReason_7898616024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1270 = new Long(6617340557564669657L);
        Long term1310 = new Long(1439298019805881866L);
        Long term1312 = new Long(-8708192233349544946L);
        term1269 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder"));
        Object term1284 = newInstance(Class.forName("java.util.Date"));
        setField(term1269, term1269.getClass(), "id", term1270);
        setField(term1269, term1269.getClass(), "hash", "uuaPigETmJ");
        setLongField(term1284, term1284.getClass(), "fastTime", 1437757323580L);
        setField(term1284, term1284.getClass(), "cdate", null);
        setField(term1269, term1269.getClass(), "createDate", term1284);
        setField(term1269, term1269.getClass(), "failReason", "MxlszYVzRf");
        setField(term1269, term1269.getClass(), "code", "LQFpaHEwXR");
        setField(term1269, term1269.getClass(), "dropRecipientId", term1310);
        setField(term1269, term1269.getClass(), "dropRequestId", term1312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        callMethod(klass, "failReason", argTypes, term1269, args);
    }

};


