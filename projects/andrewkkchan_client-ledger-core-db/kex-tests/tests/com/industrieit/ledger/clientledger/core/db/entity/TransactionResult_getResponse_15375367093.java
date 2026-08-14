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
import java.lang.Integer;

public class TransactionResult_getResponse_15375367093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171;

    public TransactionResult_getResponse_15375367093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term212 = new Integer(0);
        term171 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term208 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term171, term171.getClass(), "id", "MjGYSRKTNF");
        setField(term171, term171.getClass(), "requestId", "hRNSzYYIrc");
        setField(term171, term171.getClass(), "response", "RMFIsYGgne");
        setIntField(term208, term208.getClass(), "nanos", 830000000);
        setLongField(term208, term208.getClass(), "fastTime", 1610929382000L);
        setField(term208, term208.getClass(), "cdate", null);
        setField(term171, term171.getClass(), "createTime", term208);
        setLongField(term171, term171.getClass(), "kafkaOffset", -8257434502486459194L);
        setField(term171, term171.getClass(), "kafkaPartition", term212);
        setBooleanField(term171, term171.getClass(), "success", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResponse", argTypes, term171, args);
    }

};


