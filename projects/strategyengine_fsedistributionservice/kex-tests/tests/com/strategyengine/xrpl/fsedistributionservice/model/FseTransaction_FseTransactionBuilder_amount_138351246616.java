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

public class FseTransaction_FseTransactionBuilder_amount_138351246616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566677;

    public FseTransaction_FseTransactionBuilder_amount_138351246616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566677 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        setField(term566677, term566677.getClass(), "transactionDate", null);
        setField(term566677, term566677.getClass(), "amount", null);
        setField(term566677, term566677.getClass(), "toAddress", null);
        setField(term566677, term566677.getClass(), "fromAddress", null);
        setField(term566677, term566677.getClass(), "currency", null);
        setField(term566677, term566677.getClass(), "issuerAddress", null);
        setField(term566677, term566677.getClass(), "transactionType", null);
        setField(term566677, term566677.getClass(), "ledgerIndex", null);
        setField(term566677, term566677.getClass(), "transactionHash", null);
        setField(term566677, term566677.getClass(), "resultCode", null);
        setField(term566677, term566677.getClass(), "reason", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "amount", argTypes, term566677, args);
    }

};


