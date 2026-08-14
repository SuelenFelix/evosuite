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

public class TransactionEvent_setId_11056498662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3270;

    public TransactionEvent_setId_11056498662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3310 = new Long(0L);
        Integer term3312 = new Integer(0);
        term3270 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term3307 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3270, term3270.getClass(), "id", "iNwOJRBEjp");
        setField(term3270, term3270.getClass(), "type", "XylxrMBraH");
        setField(term3270, term3270.getClass(), "request", "pORebkoRdD");
        setIntField(term3307, term3307.getClass(), "nanos", 918000000);
        setLongField(term3307, term3307.getClass(), "fastTime", 1659983392000L);
        setField(term3307, term3307.getClass(), "cdate", null);
        setField(term3270, term3270.getClass(), "createTime", term3307);
        setField(term3270, term3270.getClass(), "kafkaOffset", term3310);
        setField(term3270, term3270.getClass(), "kafkaPartition", term3312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mXGCWJDOqA";
        callMethod(klass, "setId", argTypes, term3270, args);
    }

};


