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

public class TransactionResult_setRequestId_655874166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415;

    public TransactionResult_setRequestId_655874166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term456 = new Integer(0);
        term415 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term452 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term415, term415.getClass(), "id", "tbcdzjIfER");
        setField(term415, term415.getClass(), "requestId", "HyxfbSQYBe");
        setField(term415, term415.getClass(), "response", "pCTimMblYc");
        setIntField(term452, term452.getClass(), "nanos", 18000000);
        setLongField(term452, term452.getClass(), "fastTime", 1515879330000L);
        setField(term452, term452.getClass(), "cdate", null);
        setField(term415, term415.getClass(), "createTime", term452);
        setLongField(term415, term415.getClass(), "kafkaOffset", 7411271909051562686L);
        setField(term415, term415.getClass(), "kafkaPartition", term456);
        setBooleanField(term415, term415.getClass(), "success", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "setRequestId", argTypes, term415, args);
    }

};


