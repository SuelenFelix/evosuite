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

public class TransactionResult_getId_6821048111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TransactionResult_getId_6821048111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term42 = new Integer(0);
        term1 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult"));
        Object term38 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1, term1.getClass(), "id", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "requestId", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "response", "MuLcgQHgqz");
        setIntField(term38, term38.getClass(), "nanos", 244000000);
        setLongField(term38, term38.getClass(), "fastTime", 1345860612000L);
        setField(term38, term38.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "createTime", term38);
        setLongField(term1, term1.getClass(), "kafkaOffset", 2442117782898005296L);
        setField(term1, term1.getClass(), "kafkaPartition", term42);
        setBooleanField(term1, term1.getClass(), "success", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


