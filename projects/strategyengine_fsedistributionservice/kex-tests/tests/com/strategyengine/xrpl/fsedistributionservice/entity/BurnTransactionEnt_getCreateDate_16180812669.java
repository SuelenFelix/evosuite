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

public class BurnTransactionEnt_getCreateDate_16180812669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234514;

    public BurnTransactionEnt_getCreateDate_16180812669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234515 = new Long(8261619652909874476L);
        Long term234529 = new Long(-3692936312179064102L);
        term234514 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term234531 = newInstance(Class.forName("java.util.Date"));
        Object term234533 = newInstance(Class.forName("java.util.Date"));
        setField(term234514, term234514.getClass(), "id", term234515);
        setField(term234514, term234514.getClass(), "transactionHash", "pbqIeikQzp");
        setField(term234514, term234514.getClass(), "ledgerIndex", term234529);
        setLongField(term234531, term234531.getClass(), "fastTime", 1625188435797L);
        setField(term234531, term234531.getClass(), "cdate", null);
        setField(term234514, term234514.getClass(), "createDate", term234531);
        setLongField(term234533, term234533.getClass(), "fastTime", 1314616559203L);
        setField(term234533, term234533.getClass(), "cdate", null);
        setField(term234514, term234514.getClass(), "txDate", term234533);
        setField(term234514, term234514.getClass(), "toAddress", "baLJgqNNUx");
        setField(term234514, term234514.getClass(), "fromAddress", "GlPSGqVaBj");
        setField(term234514, term234514.getClass(), "amount", "jieMNXAAbL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term234514, args);
    }

};


