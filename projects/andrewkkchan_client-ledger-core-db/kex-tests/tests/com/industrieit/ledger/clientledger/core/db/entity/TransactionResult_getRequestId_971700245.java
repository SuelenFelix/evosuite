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

public class TransactionResult_getRequestId_971700245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341;

    public TransactionResult_getRequestId_971700245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term382 = new Integer(0);
        term341 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term378 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term341, term341.getClass(), "id", "oVcInYnLWB");
        setField(term341, term341.getClass(), "requestId", "aJlieCFVtF");
        setField(term341, term341.getClass(), "response", "ZiaGIbnzTs");
        setIntField(term378, term378.getClass(), "nanos", 302000000);
        setLongField(term378, term378.getClass(), "fastTime", 1442628765000L);
        setField(term378, term378.getClass(), "cdate", null);
        setField(term341, term341.getClass(), "createTime", term378);
        setLongField(term341, term341.getClass(), "kafkaOffset", 5270370404989704783L);
        setField(term341, term341.getClass(), "kafkaPartition", term382);
        setBooleanField(term341, term341.getClass(), "success", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestId", argTypes, term341, args);
    }

};


