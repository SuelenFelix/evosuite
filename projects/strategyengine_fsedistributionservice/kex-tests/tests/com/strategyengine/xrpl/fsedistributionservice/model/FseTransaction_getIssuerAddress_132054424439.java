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

public class FseTransaction_getIssuerAddress_132054424439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605985;

    public FseTransaction_getIssuerAddress_132054424439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605985 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        setField(term605985, term605985.getClass(), "transactionDate", null);
        setField(term605985, term605985.getClass(), "amount", null);
        setField(term605985, term605985.getClass(), "toAddress", null);
        setField(term605985, term605985.getClass(), "fromAddress", null);
        setField(term605985, term605985.getClass(), "currency", null);
        setField(term605985, term605985.getClass(), "issuerAddress", null);
        setField(term605985, term605985.getClass(), "transactionType", null);
        setField(term605985, term605985.getClass(), "ledgerIndex", null);
        setField(term605985, term605985.getClass(), "transactionHash", null);
        setField(term605985, term605985.getClass(), "resultCode", null);
        setField(term605985, term605985.getClass(), "reason", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIssuerAddress", argTypes, term605985, args);
    }

};


