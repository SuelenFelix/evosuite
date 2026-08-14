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

public class TransactionEvent_getType_1073810537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3687;

    public TransactionEvent_getType_1073810537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3727 = new Long(0L);
        Integer term3729 = new Integer(0);
        term3687 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term3724 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3687, term3687.getClass(), "id", "EYtfuJaxiM");
        setField(term3687, term3687.getClass(), "type", "gCWtLVKVVe");
        setField(term3687, term3687.getClass(), "request", "fWKJoSoCwE");
        setIntField(term3724, term3724.getClass(), "nanos", 888000000);
        setLongField(term3724, term3724.getClass(), "fastTime", 1464410989000L);
        setField(term3724, term3724.getClass(), "cdate", null);
        setField(term3687, term3687.getClass(), "createTime", term3724);
        setField(term3687, term3687.getClass(), "kafkaOffset", term3727);
        setField(term3687, term3687.getClass(), "kafkaPartition", term3729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term3687, args);
    }

};


