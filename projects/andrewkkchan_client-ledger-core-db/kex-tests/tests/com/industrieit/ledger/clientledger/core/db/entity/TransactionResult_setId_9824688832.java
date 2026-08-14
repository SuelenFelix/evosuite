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

public class TransactionResult_setId_9824688832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;

    public TransactionResult_setId_9824688832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term116 = new Integer(0);
        term75 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term112 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term75, term75.getClass(), "id", "xxtlPwDYFs");
        setField(term75, term75.getClass(), "requestId", "jJCZpVmanW");
        setField(term75, term75.getClass(), "response", "EGtDIRbSSb");
        setIntField(term112, term112.getClass(), "nanos", 369000000);
        setLongField(term112, term112.getClass(), "fastTime", 1480427551000L);
        setField(term112, term112.getClass(), "cdate", null);
        setField(term75, term75.getClass(), "createTime", term112);
        setLongField(term75, term75.getClass(), "kafkaOffset", 6375119433582206027L);
        setField(term75, term75.getClass(), "kafkaPartition", term116);
        setBooleanField(term75, term75.getClass(), "success", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        callMethod(klass, "setId", argTypes, term75, args);
    }

};


