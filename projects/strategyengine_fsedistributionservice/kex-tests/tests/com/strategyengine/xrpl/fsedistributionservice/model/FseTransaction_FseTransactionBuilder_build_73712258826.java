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

public class FseTransaction_FseTransactionBuilder_build_73712258826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566687;

    public FseTransaction_FseTransactionBuilder_build_73712258826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566687 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        setField(term566687, term566687.getClass(), "transactionDate", null);
        setField(term566687, term566687.getClass(), "amount", null);
        setField(term566687, term566687.getClass(), "toAddress", null);
        setField(term566687, term566687.getClass(), "fromAddress", null);
        setField(term566687, term566687.getClass(), "currency", null);
        setField(term566687, term566687.getClass(), "issuerAddress", null);
        setField(term566687, term566687.getClass(), "transactionType", null);
        setField(term566687, term566687.getClass(), "ledgerIndex", null);
        setField(term566687, term566687.getClass(), "transactionHash", null);
        setField(term566687, term566687.getClass(), "resultCode", null);
        setField(term566687, term566687.getClass(), "reason", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term566687, args);
    }

};


