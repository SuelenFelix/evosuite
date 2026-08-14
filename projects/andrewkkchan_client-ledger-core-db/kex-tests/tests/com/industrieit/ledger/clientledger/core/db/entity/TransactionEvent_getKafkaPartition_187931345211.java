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

public class TransactionEvent_getKafkaPartition_187931345211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4007;

    public TransactionEvent_getKafkaPartition_187931345211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4047 = new Long(0L);
        Integer term4049 = new Integer(0);
        term4007 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term4044 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term4007, term4007.getClass(), "id", "UfQtPRyWRC");
        setField(term4007, term4007.getClass(), "type", "FPvxVzzSvD");
        setField(term4007, term4007.getClass(), "request", "WHcwFgsGFC");
        setIntField(term4044, term4044.getClass(), "nanos", 186000000);
        setLongField(term4044, term4044.getClass(), "fastTime", 1666065487000L);
        setField(term4044, term4044.getClass(), "cdate", null);
        setField(term4007, term4007.getClass(), "createTime", term4044);
        setField(term4007, term4007.getClass(), "kafkaOffset", term4047);
        setField(term4007, term4007.getClass(), "kafkaPartition", term4049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKafkaPartition", argTypes, term4007, args);
    }

};


