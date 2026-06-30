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

public class FseTransaction_getReason_204404923944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605990;

    public FseTransaction_getReason_204404923944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605990 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        setField(term605990, term605990.getClass(), "transactionDate", null);
        setField(term605990, term605990.getClass(), "amount", null);
        setField(term605990, term605990.getClass(), "toAddress", null);
        setField(term605990, term605990.getClass(), "fromAddress", null);
        setField(term605990, term605990.getClass(), "currency", null);
        setField(term605990, term605990.getClass(), "issuerAddress", null);
        setField(term605990, term605990.getClass(), "transactionType", null);
        setField(term605990, term605990.getClass(), "ledgerIndex", null);
        setField(term605990, term605990.getClass(), "transactionHash", null);
        setField(term605990, term605990.getClass(), "resultCode", null);
        setField(term605990, term605990.getClass(), "reason", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReason", argTypes, term605990, args);
    }

};


