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

public class CreateAccountRequest_getCurrency_3072048217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2572;

    public CreateAccountRequest_getCurrency_3072048217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2572 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.CreateAccountRequest"));
        setField(term2572, term2572.getClass(), "id", null);
        setField(term2572, term2572.getClass(), "currency", null);
        setField(term2572, term2572.getClass(), "accountName", null);
        setField(term2572, term2572.getClass(), "accountGroup", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.CreateAccountRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrency", argTypes, term2572, args);
    }

};


