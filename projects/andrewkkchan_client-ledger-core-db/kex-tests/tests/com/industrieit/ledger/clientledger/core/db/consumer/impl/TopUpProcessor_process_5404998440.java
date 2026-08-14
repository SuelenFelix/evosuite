package com.industrieit.ledger.clientledger.core.db.consumer.impl;

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
import static com.industrieit.ledger.clientledger.core.db.consumer.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class TopUpProcessor_process_5404998440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476;

    public TopUpProcessor_process_5404998440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term516 = new Long(0L);
        Integer term518 = new Integer(0);
        term476 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term513 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term476, term476.getClass(), "id", "tbcdzjIfER");
        setField(term476, term476.getClass(), "type", "HyxfbSQYBe");
        setField(term476, term476.getClass(), "request", "pCTimMblYc");
        setIntField(term513, term513.getClass(), "nanos", 830000000);
        setLongField(term513, term513.getClass(), "fastTime", 1610929382000L);
        setField(term513, term513.getClass(), "cdate", null);
        setField(term476, term476.getClass(), "createTime", term513);
        setField(term476, term476.getClass(), "kafkaOffset", term516);
        setField(term476, term476.getClass(), "kafkaPartition", term518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.consumer.impl.TopUpProcessor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Object[] args = new Object[1];
        args[0] = term476;
        callMethod(klass, "process", argTypes, null, args);
    }

};


