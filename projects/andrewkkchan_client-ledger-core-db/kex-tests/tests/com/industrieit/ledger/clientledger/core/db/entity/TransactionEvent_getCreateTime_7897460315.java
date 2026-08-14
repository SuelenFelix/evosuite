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

public class TransactionEvent_getCreateTime_7897460315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3536;

    public TransactionEvent_getCreateTime_7897460315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3576 = new Long(0L);
        Integer term3578 = new Integer(0);
        term3536 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term3573 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3536, term3536.getClass(), "id", "mLUZFTfjle");
        setField(term3536, term3536.getClass(), "type", "xIeFjkHkOe");
        setField(term3536, term3536.getClass(), "request", "SdCKLMIYnX");
        setIntField(term3573, term3573.getClass(), "nanos", 101000000);
        setLongField(term3573, term3573.getClass(), "fastTime", 1488715102000L);
        setField(term3573, term3573.getClass(), "cdate", null);
        setField(term3536, term3536.getClass(), "createTime", term3573);
        setField(term3536, term3536.getClass(), "kafkaOffset", term3576);
        setField(term3536, term3536.getClass(), "kafkaPartition", term3578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term3536, args);
    }

};


