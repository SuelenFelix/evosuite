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

public class FseTransaction_toString_149413034133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605979;

    public FseTransaction_toString_149413034133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605979 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        setField(term605979, term605979.getClass(), "transactionDate", null);
        setField(term605979, term605979.getClass(), "amount", null);
        setField(term605979, term605979.getClass(), "toAddress", null);
        setField(term605979, term605979.getClass(), "fromAddress", null);
        setField(term605979, term605979.getClass(), "currency", null);
        setField(term605979, term605979.getClass(), "issuerAddress", null);
        setField(term605979, term605979.getClass(), "transactionType", null);
        setField(term605979, term605979.getClass(), "ledgerIndex", null);
        setField(term605979, term605979.getClass(), "transactionHash", null);
        setField(term605979, term605979.getClass(), "resultCode", null);
        setField(term605979, term605979.getClass(), "reason", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term605979, args);
    }

};


