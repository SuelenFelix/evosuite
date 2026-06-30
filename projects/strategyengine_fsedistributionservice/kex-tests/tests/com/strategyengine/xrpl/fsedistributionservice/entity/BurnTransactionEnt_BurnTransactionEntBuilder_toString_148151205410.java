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

public class BurnTransactionEnt_BurnTransactionEntBuilder_toString_148151205410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241689;

    public BurnTransactionEnt_BurnTransactionEntBuilder_toString_148151205410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241690 = new Long(3228082303360203224L);
        Long term241704 = new Long(8845929725457841487L);
        term241689 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder"));
        Object term241706 = newInstance(Class.forName("java.util.Date"));
        Object term241708 = newInstance(Class.forName("java.util.Date"));
        setField(term241689, term241689.getClass(), "id", term241690);
        setField(term241689, term241689.getClass(), "transactionHash", "nwKTRDmHWk");
        setField(term241689, term241689.getClass(), "ledgerIndex", term241704);
        setLongField(term241706, term241706.getClass(), "fastTime", 1849549908456L);
        setField(term241706, term241706.getClass(), "cdate", null);
        setField(term241689, term241689.getClass(), "createDate", term241706);
        setLongField(term241708, term241708.getClass(), "fastTime", 1845098913855L);
        setField(term241708, term241708.getClass(), "cdate", null);
        setField(term241689, term241689.getClass(), "txDate", term241708);
        setField(term241689, term241689.getClass(), "toAddress", "UueEixdrss");
        setField(term241689, term241689.getClass(), "fromAddress", "ceafBXJyBB");
        setField(term241689, term241689.getClass(), "amount", "VNHIbCXqhH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt$BurnTransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term241689, args);
    }

};


