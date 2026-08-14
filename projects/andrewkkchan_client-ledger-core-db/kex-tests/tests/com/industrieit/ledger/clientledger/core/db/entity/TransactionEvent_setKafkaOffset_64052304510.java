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

public class TransactionEvent_setKafkaOffset_64052304510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3931;
     Object term3975;

    public TransactionEvent_setKafkaOffset_64052304510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3971 = new Long(0L);
        Integer term3973 = new Integer(0);
        term3931 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term3968 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3931, term3931.getClass(), "id", "pXOkjyeIRb");
        setField(term3931, term3931.getClass(), "type", "GgZWSjxjyE");
        setField(term3931, term3931.getClass(), "request", "EeBVbzjcCI");
        setIntField(term3968, term3968.getClass(), "nanos", 298000000);
        setLongField(term3968, term3968.getClass(), "fastTime", 1678166815000L);
        setField(term3968, term3968.getClass(), "cdate", null);
        setField(term3931, term3931.getClass(), "createTime", term3968);
        setField(term3931, term3931.getClass(), "kafkaOffset", term3971);
        setField(term3931, term3931.getClass(), "kafkaPartition", term3973);
        term3975 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3975;
        callMethod(klass, "setKafkaOffset", argTypes, term3931, args);
    }

};


