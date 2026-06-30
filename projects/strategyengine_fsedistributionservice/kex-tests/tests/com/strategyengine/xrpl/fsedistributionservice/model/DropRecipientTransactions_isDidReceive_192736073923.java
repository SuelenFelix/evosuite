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

public class DropRecipientTransactions_isDidReceive_192736073923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88604;

    public DropRecipientTransactions_isDidReceive_192736073923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88604 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions"));
        setField(term88604, term88604.getClass(), "dropRecipient", null);
        setField(term88604, term88604.getClass(), "transactions", null);
        setField(term88604, term88604.getClass(), "transactionsFromMap", null);
        setBooleanField(term88604, term88604.getClass(), "didReceive", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDidReceive", argTypes, term88604, args);
    }

};


