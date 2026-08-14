package com.industrieit.ledger.clientledger.core.db.model.ledger.impl;

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
import static com.industrieit.ledger.clientledger.core.db.model.ledger.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class P2PItemizable_itemize_7728849784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1770;

    public P2PItemizable_itemize_7728849784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1770 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.ledger.impl.P2PItemizable"));
        setField(term1770, term1770.getClass(), "source", null);
        setField(term1770, term1770.getClass(), "destination", null);
        setField(term1770, term1770.getClass(), "feeAccount", null);
        setField(term1770, term1770.getClass(), "taxAccount", null);
        setField(term1770, term1770.getClass(), "amount", null);
        setField(term1770, term1770.getClass(), "fee", null);
        setField(term1770, term1770.getClass(), "tax", null);
        setField(term1770, term1770.getClass(), "currency", null);
        setField(term1770, term1770.getClass(), "requestId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.ledger.impl.P2PItemizable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "itemize", argTypes, term1770, args);
    }

};


