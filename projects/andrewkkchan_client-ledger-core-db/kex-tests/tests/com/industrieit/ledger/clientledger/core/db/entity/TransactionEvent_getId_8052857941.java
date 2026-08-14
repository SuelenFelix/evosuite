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
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class TransactionEvent_getId_8052857941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3196;

    public TransactionEvent_getId_8052857941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3236 = new Long(0L);
        Integer term3238 = new Integer(0);
        term3196 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term3233 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3196, term3196.getClass(), "id", "RYdKCNNMBR");
        setField(term3196, term3196.getClass(), "type", "yGtHPyvYiQ");
        setField(term3196, term3196.getClass(), "request", "MvRIxilFMJ");
        setIntField(term3233, term3233.getClass(), "nanos", 632000000);
        setLongField(term3233, term3233.getClass(), "fastTime", 1442359734000L);
        setField(term3233, term3233.getClass(), "cdate", null);
        setField(term3196, term3196.getClass(), "createTime", term3233);
        setField(term3196, term3196.getClass(), "kafkaOffset", term3236);
        setField(term3196, term3196.getClass(), "kafkaPartition", term3238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3196, args);
    }

};


