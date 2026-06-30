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

public class FseTransaction_getTransactionHash_34647840542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605988;

    public FseTransaction_getTransactionHash_34647840542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605988 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        setField(term605988, term605988.getClass(), "transactionDate", null);
        setField(term605988, term605988.getClass(), "amount", null);
        setField(term605988, term605988.getClass(), "toAddress", null);
        setField(term605988, term605988.getClass(), "fromAddress", null);
        setField(term605988, term605988.getClass(), "currency", null);
        setField(term605988, term605988.getClass(), "issuerAddress", null);
        setField(term605988, term605988.getClass(), "transactionType", null);
        setField(term605988, term605988.getClass(), "ledgerIndex", null);
        setField(term605988, term605988.getClass(), "transactionHash", null);
        setField(term605988, term605988.getClass(), "resultCode", null);
        setField(term605988, term605988.getClass(), "reason", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTransactionHash", argTypes, term605988, args);
    }

};


