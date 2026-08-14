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

public class JournalEntry_setAccount_167873479221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7111;

    public JournalEntry_setAccount_167873479221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7111 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        setField(term7111, term7111.getClass(), "id", null);
        setField(term7111, term7111.getClass(), "requestId", null);
        setField(term7111, term7111.getClass(), "account", null);
        setField(term7111, term7111.getClass(), "currency", null);
        setField(term7111, term7111.getClass(), "createTime", null);
        setField(term7111, term7111.getClass(), "amount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAccount", argTypes, term7111, args);
    }

};


