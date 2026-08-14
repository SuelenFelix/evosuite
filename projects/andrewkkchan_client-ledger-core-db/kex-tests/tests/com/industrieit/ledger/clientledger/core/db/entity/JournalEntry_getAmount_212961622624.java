package com.industrieit.ledger.clientledger.core.db.entity;

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
import static com.industrieit.ledger.clientledger.core.db.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JournalEntry_getAmount_212961622624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7114;

    public JournalEntry_getAmount_212961622624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7114 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        setField(term7114, term7114.getClass(), "id", null);
        setField(term7114, term7114.getClass(), "requestId", null);
        setField(term7114, term7114.getClass(), "account", null);
        setField(term7114, term7114.getClass(), "currency", null);
        setField(term7114, term7114.getClass(), "createTime", null);
        setField(term7114, term7114.getClass(), "amount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmount", argTypes, term7114, args);
    }

};


