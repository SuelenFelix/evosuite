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

public class P2PServiceImpl_journal_18588294373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;

    public P2PServiceImpl_journal_18588294373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.service.impl.P2PServiceImpl"));
        setField(term326, term326.getClass(), "validator", null);
        setField(term326, term326.getClass(), "committer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.service.impl.P2PServiceImpl");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "journal", argTypes, term326, args);
    }

};


