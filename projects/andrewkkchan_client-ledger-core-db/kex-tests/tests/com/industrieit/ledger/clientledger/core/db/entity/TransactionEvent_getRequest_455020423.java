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

public class TransactionEvent_getRequest_455020423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3366;

    public TransactionEvent_getRequest_455020423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3406 = new Long(0L);
        Integer term3408 = new Integer(0);
        term3366 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term3403 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3366, term3366.getClass(), "id", "dpNsDgfPso");
        setField(term3366, term3366.getClass(), "type", "hCWPJQKpdc");
        setField(term3366, term3366.getClass(), "request", "WzMEhMXkKx");
        setIntField(term3403, term3403.getClass(), "nanos", 559000000);
        setLongField(term3403, term3403.getClass(), "fastTime", 1876862000000L);
        setField(term3403, term3403.getClass(), "cdate", null);
        setField(term3366, term3366.getClass(), "createTime", term3403);
        setField(term3366, term3366.getClass(), "kafkaOffset", term3406);
        setField(term3366, term3366.getClass(), "kafkaPartition", term3408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequest", argTypes, term3366, args);
    }

};


