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

public class TransactionResult_getCreateTime_9129270147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511;

    public TransactionResult_getCreateTime_9129270147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term552 = new Integer(0);
        term511 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term548 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term511, term511.getClass(), "id", "RkybSrpybU");
        setField(term511, term511.getClass(), "requestId", "xOEqzGAmDU");
        setField(term511, term511.getClass(), "response", "eZFUvlxvGV");
        setIntField(term548, term548.getClass(), "nanos", 389000000);
        setLongField(term548, term548.getClass(), "fastTime", 1429013051000L);
        setField(term548, term548.getClass(), "cdate", null);
        setField(term511, term511.getClass(), "createTime", term548);
        setLongField(term511, term511.getClass(), "kafkaOffset", 4872422362414183754L);
        setField(term511, term511.getClass(), "kafkaPartition", term552);
        setBooleanField(term511, term511.getClass(), "success", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term511, args);
    }

};


