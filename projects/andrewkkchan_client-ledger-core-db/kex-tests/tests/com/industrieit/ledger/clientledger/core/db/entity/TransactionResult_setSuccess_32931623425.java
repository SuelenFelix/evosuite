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
import java.lang.Boolean;

public class TransactionResult_setSuccess_32931623425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1139;
     Object term1142;

    public TransactionResult_setSuccess_32931623425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1139 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        setField(term1139, term1139.getClass(), "id", null);
        setField(term1139, term1139.getClass(), "requestId", null);
        setField(term1139, term1139.getClass(), "response", null);
        setField(term1139, term1139.getClass(), "createTime", null);
        setLongField(term1139, term1139.getClass(), "kafkaOffset", 0L);
        setField(term1139, term1139.getClass(), "kafkaPartition", null);
        setBooleanField(term1139, term1139.getClass(), "success", false);
        term1142 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1142;
        callMethod(klass, "setSuccess", argTypes, term1139, args);
    }

};


