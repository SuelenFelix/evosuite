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

public class CreateAccountRequest_getAccountGroup_18812447143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2394;

    public CreateAccountRequest_getAccountGroup_18812447143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2394 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.CreateAccountRequest"));
        setField(term2394, term2394.getClass(), "id", "HqBOwkVqjD");
        setField(term2394, term2394.getClass(), "currency", "MAcUBcBckh");
        setField(term2394, term2394.getClass(), "accountName", "oVgzLbrsFr");
        setField(term2394, term2394.getClass(), "accountGroup", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.CreateAccountRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccountGroup", argTypes, term2394, args);
    }

};


