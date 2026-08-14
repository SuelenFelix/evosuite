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

public class TransactionEvent_getKafkaOffset_66714991522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4165;

    public TransactionEvent_getKafkaOffset_66714991522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4165 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        setField(term4165, term4165.getClass(), "id", null);
        setField(term4165, term4165.getClass(), "type", null);
        setField(term4165, term4165.getClass(), "request", null);
        setField(term4165, term4165.getClass(), "createTime", null);
        setField(term4165, term4165.getClass(), "kafkaOffset", null);
        setField(term4165, term4165.getClass(), "kafkaPartition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKafkaOffset", argTypes, term4165, args);
    }

};


