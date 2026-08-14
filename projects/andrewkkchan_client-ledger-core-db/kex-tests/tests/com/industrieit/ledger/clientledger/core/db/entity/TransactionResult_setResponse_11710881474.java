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

public class TransactionResult_setResponse_11710881474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245;

    public TransactionResult_setResponse_11710881474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term286 = new Integer(0);
        term245 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term282 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term245, term245.getClass(), "id", "NRdvgJlhkX");
        setField(term245, term245.getClass(), "requestId", "uuaPigETmJ");
        setField(term245, term245.getClass(), "response", "MxlszYVzRf");
        setIntField(term282, term282.getClass(), "nanos", 837000000);
        setLongField(term282, term282.getClass(), "fastTime", 1606034835000L);
        setField(term282, term282.getClass(), "cdate", null);
        setField(term245, term245.getClass(), "createTime", term282);
        setLongField(term245, term245.getClass(), "kafkaOffset", -8400487765614892086L);
        setField(term245, term245.getClass(), "kafkaPartition", term286);
        setBooleanField(term245, term245.getClass(), "success", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "setResponse", argTypes, term245, args);
    }

};


