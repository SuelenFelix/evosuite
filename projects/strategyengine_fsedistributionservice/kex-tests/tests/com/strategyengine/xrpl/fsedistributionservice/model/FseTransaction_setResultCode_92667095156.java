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

public class FseTransaction_setResultCode_92667095156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606000;

    public FseTransaction_setResultCode_92667095156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term606000 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        setField(term606000, term606000.getClass(), "transactionDate", null);
        setField(term606000, term606000.getClass(), "amount", null);
        setField(term606000, term606000.getClass(), "toAddress", null);
        setField(term606000, term606000.getClass(), "fromAddress", null);
        setField(term606000, term606000.getClass(), "currency", null);
        setField(term606000, term606000.getClass(), "issuerAddress", null);
        setField(term606000, term606000.getClass(), "transactionType", null);
        setField(term606000, term606000.getClass(), "ledgerIndex", null);
        setField(term606000, term606000.getClass(), "transactionHash", null);
        setField(term606000, term606000.getClass(), "resultCode", null);
        setField(term606000, term606000.getClass(), "reason", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setResultCode", argTypes, term606000, args);
    }

};


