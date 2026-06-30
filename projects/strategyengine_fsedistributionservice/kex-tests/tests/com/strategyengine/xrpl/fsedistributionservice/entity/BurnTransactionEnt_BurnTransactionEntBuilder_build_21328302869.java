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

public class BurnTransactionEnt_BurnTransactionEntBuilder_build_21328302869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241592;

    public BurnTransactionEnt_BurnTransactionEntBuilder_build_21328302869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241593 = new Long(7205698466499430091L);
        Long term241607 = new Long(-4868523627266698649L);
        term241592 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder"));
        Object term241609 = newInstance(Class.forName("java.util.Date"));
        Object term241611 = newInstance(Class.forName("java.util.Date"));
        setField(term241592, term241592.getClass(), "id", term241593);
        setField(term241592, term241592.getClass(), "transactionHash", "LNendOzJhj");
        setField(term241592, term241592.getClass(), "ledgerIndex", term241607);
        setLongField(term241609, term241609.getClass(), "fastTime", 1569059009448L);
        setField(term241609, term241609.getClass(), "cdate", null);
        setField(term241592, term241592.getClass(), "createDate", term241609);
        setLongField(term241611, term241611.getClass(), "fastTime", 1728362873153L);
        setField(term241611, term241611.getClass(), "cdate", null);
        setField(term241592, term241592.getClass(), "txDate", term241611);
        setField(term241592, term241592.getClass(), "toAddress", "ZwcevQDgzv");
        setField(term241592, term241592.getClass(), "fromAddress", "rzkENrHYBI");
        setField(term241592, term241592.getClass(), "amount", "ylJjmNVzzt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term241592, args);
    }

};


