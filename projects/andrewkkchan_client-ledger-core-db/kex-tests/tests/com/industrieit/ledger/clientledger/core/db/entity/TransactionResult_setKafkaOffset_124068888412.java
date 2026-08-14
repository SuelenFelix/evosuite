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
import java.lang.Long;

public class TransactionResult_setKafkaOffset_124068888412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886;
     Object term930;

    public TransactionResult_setKafkaOffset_124068888412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term927 = new Integer(0);
        term886 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term923 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term886, term886.getClass(), "id", "xrwlQZdwCp");
        setField(term886, term886.getClass(), "requestId", "IDCWpPLRkE");
        setField(term886, term886.getClass(), "response", "nyiiPDVjAc");
        setIntField(term923, term923.getClass(), "nanos", 80000000);
        setLongField(term923, term923.getClass(), "fastTime", 1745452162000L);
        setField(term923, term923.getClass(), "cdate", null);
        setField(term886, term886.getClass(), "createTime", term923);
        setLongField(term886, term886.getClass(), "kafkaOffset", -8885298608300233488L);
        setField(term886, term886.getClass(), "kafkaPartition", term927);
        setBooleanField(term886, term886.getClass(), "success", false);
        term930 = new Long(-4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term930;
        callMethod(klass, "setKafkaOffset", argTypes, term886, args);
    }

};


