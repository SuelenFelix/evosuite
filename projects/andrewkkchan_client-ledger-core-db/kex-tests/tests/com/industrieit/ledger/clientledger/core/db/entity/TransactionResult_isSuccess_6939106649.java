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

public class TransactionResult_isSuccess_6939106649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term662;

    public TransactionResult_isSuccess_6939106649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term703 = new Integer(0);
        term662 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term699 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term662, term662.getClass(), "id", "OclPbYPkcH");
        setField(term662, term662.getClass(), "requestId", "IoAlmYsBwc");
        setField(term662, term662.getClass(), "response", "TEParAifyi");
        setIntField(term699, term699.getClass(), "nanos", 23000000);
        setLongField(term699, term699.getClass(), "fastTime", 1500710268000L);
        setField(term699, term699.getClass(), "cdate", null);
        setField(term662, term662.getClass(), "createTime", term699);
        setLongField(term662, term662.getClass(), "kafkaOffset", -7237588299778557629L);
        setField(term662, term662.getClass(), "kafkaPartition", term703);
        setBooleanField(term662, term662.getClass(), "success", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term662, args);
    }

};


