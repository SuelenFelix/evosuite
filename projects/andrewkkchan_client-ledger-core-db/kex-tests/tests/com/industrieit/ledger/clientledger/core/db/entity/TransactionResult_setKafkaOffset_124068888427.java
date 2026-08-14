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
import java.lang.Long;

public class TransactionResult_setKafkaOffset_124068888427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1147;
     Object term1150;

    public TransactionResult_setKafkaOffset_124068888427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1147 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        setField(term1147, term1147.getClass(), "id", null);
        setField(term1147, term1147.getClass(), "requestId", null);
        setField(term1147, term1147.getClass(), "response", null);
        setField(term1147, term1147.getClass(), "createTime", null);
        setLongField(term1147, term1147.getClass(), "kafkaOffset", 0L);
        setField(term1147, term1147.getClass(), "kafkaPartition", null);
        setBooleanField(term1147, term1147.getClass(), "success", false);
        term1150 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1150;
        callMethod(klass, "setKafkaOffset", argTypes, term1147, args);
    }

};


