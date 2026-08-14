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

public class TransactionEvent_setKafkaPartition_70321815012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4081;
     Object term4125;

    public TransactionEvent_setKafkaPartition_70321815012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4121 = new Long(0L);
        Integer term4123 = new Integer(0);
        term4081 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term4118 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term4081, term4081.getClass(), "id", "HzqpegHiRq");
        setField(term4081, term4081.getClass(), "type", "jwsfVjMoJT");
        setField(term4081, term4081.getClass(), "request", "ZfdXfCCFDf");
        setIntField(term4118, term4118.getClass(), "nanos", 434000000);
        setLongField(term4118, term4118.getClass(), "fastTime", 1426008074000L);
        setField(term4118, term4118.getClass(), "cdate", null);
        setField(term4081, term4081.getClass(), "createTime", term4118);
        setField(term4081, term4081.getClass(), "kafkaOffset", term4121);
        setField(term4081, term4081.getClass(), "kafkaPartition", term4123);
        term4125 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4125;
        callMethod(klass, "setKafkaPartition", argTypes, term4081, args);
    }

};


