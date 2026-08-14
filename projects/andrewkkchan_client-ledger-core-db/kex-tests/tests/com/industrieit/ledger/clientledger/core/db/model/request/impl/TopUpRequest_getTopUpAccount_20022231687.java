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

public class TopUpRequest_getTopUpAccount_20022231687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term451;

    public TopUpRequest_getTopUpAccount_20022231687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term451 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest"));
        setField(term451, term451.getClass(), "currency", null);
        setField(term451, term451.getClass(), "topUpAccount", null);
        setField(term451, term451.getClass(), "settlementAccount", null);
        setField(term451, term451.getClass(), "amount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTopUpAccount", argTypes, term451, args);
    }

};


