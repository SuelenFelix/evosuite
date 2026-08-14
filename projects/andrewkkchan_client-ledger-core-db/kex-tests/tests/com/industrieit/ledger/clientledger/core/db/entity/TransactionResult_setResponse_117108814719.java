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

public class TransactionResult_setResponse_117108814719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1121;

    public TransactionResult_setResponse_117108814719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1121 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        setField(term1121, term1121.getClass(), "id", null);
        setField(term1121, term1121.getClass(), "requestId", null);
        setField(term1121, term1121.getClass(), "response", null);
        setField(term1121, term1121.getClass(), "createTime", null);
        setLongField(term1121, term1121.getClass(), "kafkaOffset", 0L);
        setField(term1121, term1121.getClass(), "kafkaPartition", null);
        setBooleanField(term1121, term1121.getClass(), "success", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setResponse", argTypes, term1121, args);
    }

};


