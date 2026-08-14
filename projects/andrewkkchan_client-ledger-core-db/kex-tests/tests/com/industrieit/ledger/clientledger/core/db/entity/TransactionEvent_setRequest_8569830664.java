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

public class TransactionEvent_setRequest_8569830664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3440;

    public TransactionEvent_setRequest_8569830664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3480 = new Long(0L);
        Integer term3482 = new Integer(0);
        term3440 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term3477 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3440, term3440.getClass(), "id", "XOiDvlDhdc");
        setField(term3440, term3440.getClass(), "type", "AdxvLJhNLe");
        setField(term3440, term3440.getClass(), "request", "lHfTrWKMPk");
        setIntField(term3477, term3477.getClass(), "nanos", 366000000);
        setLongField(term3477, term3477.getClass(), "fastTime", 1304521299000L);
        setField(term3477, term3477.getClass(), "cdate", null);
        setField(term3440, term3440.getClass(), "createTime", term3477);
        setField(term3440, term3440.getClass(), "kafkaOffset", term3480);
        setField(term3440, term3440.getClass(), "kafkaPartition", term3482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDaAnsVTGV";
        callMethod(klass, "setRequest", argTypes, term3440, args);
    }

};


