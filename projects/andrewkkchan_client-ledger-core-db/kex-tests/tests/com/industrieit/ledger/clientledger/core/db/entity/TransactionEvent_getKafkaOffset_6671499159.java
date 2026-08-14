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

public class TransactionEvent_getKafkaOffset_6671499159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3857;

    public TransactionEvent_getKafkaOffset_6671499159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3897 = new Long(0L);
        Integer term3899 = new Integer(0);
        term3857 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term3894 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3857, term3857.getClass(), "id", "LWyEaeIyAo");
        setField(term3857, term3857.getClass(), "type", "yVMkkQhvmN");
        setField(term3857, term3857.getClass(), "request", "mvrkADEgpp");
        setIntField(term3894, term3894.getClass(), "nanos", 50000000);
        setLongField(term3894, term3894.getClass(), "fastTime", 1822693844000L);
        setField(term3894, term3894.getClass(), "cdate", null);
        setField(term3857, term3857.getClass(), "createTime", term3894);
        setField(term3857, term3857.getClass(), "kafkaOffset", term3897);
        setField(term3857, term3857.getClass(), "kafkaPartition", term3899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKafkaOffset", argTypes, term3857, args);
    }

};


