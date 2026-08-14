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
import java.lang.Boolean;

public class TransactionResult_setSuccess_32931623410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736;
     Object term780;

    public TransactionResult_setSuccess_32931623410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term777 = new Integer(0);
        term736 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term773 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term736, term736.getClass(), "id", "OWDIEULEFu");
        setField(term736, term736.getClass(), "requestId", "dWRymuLBtr");
        setField(term736, term736.getClass(), "response", "AijpHYOFuy");
        setIntField(term773, term773.getClass(), "nanos", 25000000);
        setLongField(term773, term773.getClass(), "fastTime", 1797192828000L);
        setField(term773, term773.getClass(), "cdate", null);
        setField(term736, term736.getClass(), "createTime", term773);
        setLongField(term736, term736.getClass(), "kafkaOffset", 6967924379644551255L);
        setField(term736, term736.getClass(), "kafkaPartition", term777);
        setBooleanField(term736, term736.getClass(), "success", true);
        term780 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term780;
        callMethod(klass, "setSuccess", argTypes, term736, args);
    }

};


