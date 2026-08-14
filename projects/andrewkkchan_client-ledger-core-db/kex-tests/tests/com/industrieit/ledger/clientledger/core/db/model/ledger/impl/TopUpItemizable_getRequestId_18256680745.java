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

public class TopUpItemizable_getRequestId_18256680745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2690;

    public TopUpItemizable_getRequestId_18256680745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2690 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.ledger.impl.TopUpItemizable"));
        setField(term2690, term2690.getClass(), "topUp", null);
        setField(term2690, term2690.getClass(), "settlement", null);
        setField(term2690, term2690.getClass(), "amount", null);
        setField(term2690, term2690.getClass(), "currency", null);
        setField(term2690, term2690.getClass(), "requestId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.ledger.impl.TopUpItemizable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestId", argTypes, term2690, args);
    }

};


