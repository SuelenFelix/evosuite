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

public class TransactionEvent_setCreateTime_10485189456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3610;
     Object term3654;

    public TransactionEvent_setCreateTime_10485189456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3650 = new Long(0L);
        Integer term3652 = new Integer(0);
        term3610 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term3647 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3610, term3610.getClass(), "id", "OJJtVNPyKZ");
        setField(term3610, term3610.getClass(), "type", "AKNapTAfmD");
        setField(term3610, term3610.getClass(), "request", "xJgPlLxpgC");
        setIntField(term3647, term3647.getClass(), "nanos", 361000000);
        setLongField(term3647, term3647.getClass(), "fastTime", 1311549317000L);
        setField(term3647, term3647.getClass(), "cdate", null);
        setField(term3610, term3610.getClass(), "createTime", term3647);
        setField(term3610, term3610.getClass(), "kafkaOffset", term3650);
        setField(term3610, term3610.getClass(), "kafkaPartition", term3652);
        term3654 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term3654, term3654.getClass(), "nanos", 842000000);
        setLongField(term3654, term3654.getClass(), "fastTime", 1595506783000L);
        setField(term3654, term3654.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term3654;
        callMethod(klass, "setCreateTime", argTypes, term3610, args);
    }

};


