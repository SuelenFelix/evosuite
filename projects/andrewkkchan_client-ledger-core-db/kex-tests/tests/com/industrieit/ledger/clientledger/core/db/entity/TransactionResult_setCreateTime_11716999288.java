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

public class TransactionResult_setCreateTime_11716999288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585;
     Object term629;

    public TransactionResult_setCreateTime_11716999288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term626 = new Integer(0);
        term585 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term622 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term585, term585.getClass(), "id", "BYqFIqCKAV");
        setField(term585, term585.getClass(), "requestId", "vrQLuWIDJX");
        setField(term585, term585.getClass(), "response", "flxyYxBRtu");
        setIntField(term622, term622.getClass(), "nanos", 288000000);
        setLongField(term622, term622.getClass(), "fastTime", 1495346663000L);
        setField(term622, term622.getClass(), "cdate", null);
        setField(term585, term585.getClass(), "createTime", term622);
        setLongField(term585, term585.getClass(), "kafkaOffset", 6811161968424632369L);
        setField(term585, term585.getClass(), "kafkaPartition", term626);
        setBooleanField(term585, term585.getClass(), "success", true);
        term629 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term629, term629.getClass(), "nanos", 896000000);
        setLongField(term629, term629.getClass(), "fastTime", 1645823234000L);
        setField(term629, term629.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term629;
        callMethod(klass, "setCreateTime", argTypes, term585, args);
    }

};


