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
import java.lang.Boolean;

public class DropRecipientTransactions_DropRecipientTransactionsBuilder_didReceive_127273417111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331543;
     Object term331545;

    public DropRecipientTransactions_DropRecipientTransactionsBuilder_didReceive_127273417111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331543 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions$DropRecipientTransactionsBuilder"));
        setField(term331543, term331543.getClass(), "dropRecipient", null);
        setField(term331543, term331543.getClass(), "transactions", null);
        setField(term331543, term331543.getClass(), "transactionsFromMap", null);
        setBooleanField(term331543, term331543.getClass(), "didReceive", false);
        term331545 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions$DropRecipientTransactionsBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term331545;
        callMethod(klass, "didReceive", argTypes, term331543, args);
    }

};


