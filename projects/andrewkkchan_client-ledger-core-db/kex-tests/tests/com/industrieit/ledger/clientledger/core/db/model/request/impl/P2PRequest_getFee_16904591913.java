package com.industrieit.ledger.clientledger.core.db.model.request.impl;

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
import static com.industrieit.ledger.clientledger.core.db.model.request.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class P2PRequest_getFee_16904591913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2076;

    public P2PRequest_getFee_16904591913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2076 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest"));
        setField(term2076, term2076.getClass(), "currency", null);
        setField(term2076, term2076.getClass(), "fromCustomerAccount", null);
        setField(term2076, term2076.getClass(), "toCustomerAccount", null);
        setField(term2076, term2076.getClass(), "feeAccount", null);
        setField(term2076, term2076.getClass(), "taxAccount", null);
        setField(term2076, term2076.getClass(), "amount", null);
        setField(term2076, term2076.getClass(), "fee", null);
        setField(term2076, term2076.getClass(), "tax", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFee", argTypes, term2076, args);
    }

};


