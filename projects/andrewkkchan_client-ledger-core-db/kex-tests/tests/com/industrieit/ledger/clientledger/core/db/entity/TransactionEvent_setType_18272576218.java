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

public class TransactionEvent_setType_18272576218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3761;

    public TransactionEvent_setType_18272576218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3801 = new Long(0L);
        Integer term3803 = new Integer(0);
        term3761 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term3798 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3761, term3761.getClass(), "id", "wfaXBpWAUH");
        setField(term3761, term3761.getClass(), "type", "VMeAzAHwZj");
        setField(term3761, term3761.getClass(), "request", "PznxWXsZME");
        setIntField(term3798, term3798.getClass(), "nanos", 488000000);
        setLongField(term3798, term3798.getClass(), "fastTime", 1405268389000L);
        setField(term3798, term3798.getClass(), "cdate", null);
        setField(term3761, term3761.getClass(), "createTime", term3798);
        setField(term3761, term3761.getClass(), "kafkaOffset", term3801);
        setField(term3761, term3761.getClass(), "kafkaPartition", term3803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZzIujlwVsw";
        callMethod(klass, "setType", argTypes, term3761, args);
    }

};


