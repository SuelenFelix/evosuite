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

public class TransactionResult_setKafkaPartition_58003716714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1036;
     Object term1080;

    public TransactionResult_setKafkaPartition_58003716714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1077 = new Integer(0);
        term1036 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term1073 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1036, term1036.getClass(), "id", "gGSMzuGICf");
        setField(term1036, term1036.getClass(), "requestId", "hxCBltsObl");
        setField(term1036, term1036.getClass(), "response", "BndsHwAFMv");
        setIntField(term1073, term1073.getClass(), "nanos", 457000000);
        setLongField(term1073, term1073.getClass(), "fastTime", 1706067372000L);
        setField(term1073, term1073.getClass(), "cdate", null);
        setField(term1036, term1036.getClass(), "createTime", term1073);
        setLongField(term1036, term1036.getClass(), "kafkaOffset", -5476826692763582090L);
        setField(term1036, term1036.getClass(), "kafkaPartition", term1077);
        setBooleanField(term1036, term1036.getClass(), "success", false);
        term1080 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1080;
        callMethod(klass, "setKafkaPartition", argTypes, term1036, args);
    }

};


