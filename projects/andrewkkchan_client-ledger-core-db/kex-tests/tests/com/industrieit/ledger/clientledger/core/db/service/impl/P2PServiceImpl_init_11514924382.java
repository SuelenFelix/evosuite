package com.industrieit.ledger.clientledger.core.db.service.impl;

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
import static com.industrieit.ledger.clientledger.core.db.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class P2PServiceImpl_init_11514924382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public P2PServiceImpl_init_11514924382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.service.impl.P2PServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.industrieit.ledger.clientledger.core.db.ledger.validator.Validator");
        argTypes[1] = Class.forName("com.industrieit.ledger.clientledger.core.db.ledger.committer.Committer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


