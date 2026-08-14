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

public class TransactionResult_getKafkaOffset_58712573011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term812;

    public TransactionResult_getKafkaOffset_58712573011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term853 = new Integer(0);
        term812 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term849 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term812, term812.getClass(), "id", "SbAoxhfrkn");
        setField(term812, term812.getClass(), "requestId", "kuTXqwMtDB");
        setField(term812, term812.getClass(), "response", "Ghbwtircqb");
        setIntField(term849, term849.getClass(), "nanos", 30000000);
        setLongField(term849, term849.getClass(), "fastTime", 1589447121000L);
        setField(term849, term849.getClass(), "cdate", null);
        setField(term812, term812.getClass(), "createTime", term849);
        setLongField(term812, term812.getClass(), "kafkaOffset", -2813493605142626659L);
        setField(term812, term812.getClass(), "kafkaPartition", term853);
        setBooleanField(term812, term812.getClass(), "success", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKafkaOffset", argTypes, term812, args);
    }

};


