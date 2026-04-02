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

public class FseTransaction_FseTransactionBuilder_transactionDate_162659145515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566676;

    public FseTransaction_FseTransactionBuilder_transactionDate_162659145515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566676 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        setField(term566676, term566676.getClass(), "transactionDate", null);
        setField(term566676, term566676.getClass(), "amount", null);
        setField(term566676, term566676.getClass(), "toAddress", null);
        setField(term566676, term566676.getClass(), "fromAddress", null);
        setField(term566676, term566676.getClass(), "currency", null);
        setField(term566676, term566676.getClass(), "issuerAddress", null);
        setField(term566676, term566676.getClass(), "transactionType", null);
        setField(term566676, term566676.getClass(), "ledgerIndex", null);
        setField(term566676, term566676.getClass(), "transactionHash", null);
        setField(term566676, term566676.getClass(), "resultCode", null);
        setField(term566676, term566676.getClass(), "reason", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transactionDate", argTypes, term566676, args);
    }

};


