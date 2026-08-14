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

public class CreateAccountRequest_getId_16189536950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2127;

    public CreateAccountRequest_getId_16189536950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2127 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.CreateAccountRequest"));
        setField(term2127, term2127.getClass(), "id", "hoicvmsovO");
        setField(term2127, term2127.getClass(), "currency", "eqJfYWRaEL");
        setField(term2127, term2127.getClass(), "accountName", "fhkbdRViHi");
        setField(term2127, term2127.getClass(), "accountGroup", "uWHnvSvaPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.CreateAccountRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2127, args);
    }

};


