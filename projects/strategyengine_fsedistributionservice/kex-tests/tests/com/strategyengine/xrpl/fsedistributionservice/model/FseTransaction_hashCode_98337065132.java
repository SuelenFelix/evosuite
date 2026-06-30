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

public class FseTransaction_hashCode_98337065132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605978;

    public FseTransaction_hashCode_98337065132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605978 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        setField(term605978, term605978.getClass(), "transactionDate", null);
        setField(term605978, term605978.getClass(), "amount", null);
        setField(term605978, term605978.getClass(), "toAddress", null);
        setField(term605978, term605978.getClass(), "fromAddress", null);
        setField(term605978, term605978.getClass(), "currency", null);
        setField(term605978, term605978.getClass(), "issuerAddress", null);
        setField(term605978, term605978.getClass(), "transactionType", null);
        setField(term605978, term605978.getClass(), "ledgerIndex", null);
        setField(term605978, term605978.getClass(), "transactionHash", null);
        setField(term605978, term605978.getClass(), "resultCode", null);
        setField(term605978, term605978.getClass(), "reason", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term605978, args);
    }

};


