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

public class BackUpProcessor_process_9488060761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669;
     Object term670;

    public BackUpProcessor_process_9488060761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term669 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.consumer.impl.BackUpProcessor"));
        setField(term669, term669.getClass(), "producer", null);
        Long term710 = new Long(0L);
        Integer term712 = new Integer(0);
        term670 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term707 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term670, term670.getClass(), "id", "BYqFIqCKAV");
        setField(term670, term670.getClass(), "type", "vrQLuWIDJX");
        setField(term670, term670.getClass(), "request", "flxyYxBRtu");
        setIntField(term707, term707.getClass(), "nanos", 837000000);
        setLongField(term707, term707.getClass(), "fastTime", 1606034835000L);
        setField(term707, term707.getClass(), "cdate", null);
        setField(term670, term670.getClass(), "createTime", term707);
        setField(term670, term670.getClass(), "kafkaOffset", term710);
        setField(term670, term670.getClass(), "kafkaPartition", term712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.consumer.impl.BackUpProcessor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Object[] args = new Object[1];
        args[0] = term670;
        callMethod(klass, "process", argTypes, term669, args);
    }

};


