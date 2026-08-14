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

public class TransactionResult_getKafkaPartition_200249443513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term962;

    public TransactionResult_getKafkaPartition_200249443513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1003 = new Integer(0);
        term962 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term999 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term962, term962.getClass(), "id", "aKnKipADSo");
        setField(term962, term962.getClass(), "requestId", "wSQxaModmm");
        setField(term962, term962.getClass(), "response", "UlajhuVLaP");
        setIntField(term999, term999.getClass(), "nanos", 960000000);
        setLongField(term999, term999.getClass(), "fastTime", 1349058953000L);
        setField(term999, term999.getClass(), "cdate", null);
        setField(term962, term962.getClass(), "createTime", term999);
        setLongField(term962, term962.getClass(), "kafkaOffset", 2535595959091595249L);
        setField(term962, term962.getClass(), "kafkaPartition", term1003);
        setBooleanField(term962, term962.getClass(), "success", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKafkaPartition", argTypes, term962, args);
    }

};


