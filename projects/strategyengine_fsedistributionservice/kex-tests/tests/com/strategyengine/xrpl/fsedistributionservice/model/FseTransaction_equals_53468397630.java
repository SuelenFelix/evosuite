package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FseTransaction_equals_53468397630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605976;

    public FseTransaction_equals_53468397630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605976 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        setField(term605976, term605976.getClass(), "transactionDate", null);
        setField(term605976, term605976.getClass(), "amount", null);
        setField(term605976, term605976.getClass(), "toAddress", null);
        setField(term605976, term605976.getClass(), "fromAddress", null);
        setField(term605976, term605976.getClass(), "currency", null);
        setField(term605976, term605976.getClass(), "issuerAddress", null);
        setField(term605976, term605976.getClass(), "transactionType", null);
        setField(term605976, term605976.getClass(), "ledgerIndex", null);
        setField(term605976, term605976.getClass(), "transactionHash", null);
        setField(term605976, term605976.getClass(), "resultCode", null);
        setField(term605976, term605976.getClass(), "reason", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term605976, args);
    }

};


