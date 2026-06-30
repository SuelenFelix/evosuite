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

public class FseTransaction_getCurrency_36130772238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605984;

    public FseTransaction_getCurrency_36130772238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605984 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        setField(term605984, term605984.getClass(), "transactionDate", null);
        setField(term605984, term605984.getClass(), "amount", null);
        setField(term605984, term605984.getClass(), "toAddress", null);
        setField(term605984, term605984.getClass(), "fromAddress", null);
        setField(term605984, term605984.getClass(), "currency", null);
        setField(term605984, term605984.getClass(), "issuerAddress", null);
        setField(term605984, term605984.getClass(), "transactionType", null);
        setField(term605984, term605984.getClass(), "ledgerIndex", null);
        setField(term605984, term605984.getClass(), "transactionHash", null);
        setField(term605984, term605984.getClass(), "resultCode", null);
        setField(term605984, term605984.getClass(), "reason", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrency", argTypes, term605984, args);
    }

};


