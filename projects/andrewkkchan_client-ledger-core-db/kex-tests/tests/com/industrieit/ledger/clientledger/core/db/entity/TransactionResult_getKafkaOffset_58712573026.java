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

public class TransactionResult_getKafkaOffset_58712573026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1144;

    public TransactionResult_getKafkaOffset_58712573026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1144 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        setField(term1144, term1144.getClass(), "id", null);
        setField(term1144, term1144.getClass(), "requestId", null);
        setField(term1144, term1144.getClass(), "response", null);
        setField(term1144, term1144.getClass(), "createTime", null);
        setLongField(term1144, term1144.getClass(), "kafkaOffset", 0L);
        setField(term1144, term1144.getClass(), "kafkaPartition", null);
        setBooleanField(term1144, term1144.getClass(), "success", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKafkaOffset", argTypes, term1144, args);
    }

};


