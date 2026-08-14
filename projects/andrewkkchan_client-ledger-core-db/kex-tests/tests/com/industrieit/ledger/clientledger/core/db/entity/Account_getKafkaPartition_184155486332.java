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

public class Account_getKafkaPartition_184155486332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3194;

    public Account_getKafkaPartition_184155486332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3194 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        setField(term3194, term3194.getClass(), "id", null);
        setField(term3194, term3194.getClass(), "createTime", null);
        setField(term3194, term3194.getClass(), "currency", null);
        setField(term3194, term3194.getClass(), "accountName", null);
        setField(term3194, term3194.getClass(), "accountGroup", null);
        setField(term3194, term3194.getClass(), "balance", null);
        setField(term3194, term3194.getClass(), "kafkaOffset", null);
        setField(term3194, term3194.getClass(), "kafkaPartition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKafkaPartition", argTypes, term3194, args);
    }

};


