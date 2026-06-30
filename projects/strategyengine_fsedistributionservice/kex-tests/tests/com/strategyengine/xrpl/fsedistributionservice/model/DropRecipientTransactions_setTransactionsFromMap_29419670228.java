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

public class DropRecipientTransactions_setTransactionsFromMap_29419670228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88612;

    public DropRecipientTransactions_setTransactionsFromMap_29419670228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88612 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions"));
        setField(term88612, term88612.getClass(), "dropRecipient", null);
        setField(term88612, term88612.getClass(), "transactions", null);
        setField(term88612, term88612.getClass(), "transactionsFromMap", null);
        setBooleanField(term88612, term88612.getClass(), "didReceive", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTransactionsFromMap", argTypes, term88612, args);
    }

};


