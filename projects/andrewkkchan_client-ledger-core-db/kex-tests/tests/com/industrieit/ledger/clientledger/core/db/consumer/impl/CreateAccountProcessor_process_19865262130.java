package com.industrieit.ledger.clientledger.core.db.consumer.impl;

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
import static com.industrieit.ledger.clientledger.core.db.consumer.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class CreateAccountProcessor_process_19865262130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CreateAccountProcessor_process_19865262130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term41 = new Long(0L);
        Integer term43 = new Integer(0);
        term1 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent"));
        Object term38 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1, term1.getClass(), "id", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "type", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "request", "MuLcgQHgqz");
        setIntField(term38, term38.getClass(), "nanos", 244000000);
        setLongField(term38, term38.getClass(), "fastTime", 1345860612000L);
        setField(term38, term38.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "createTime", term38);
        setField(term1, term1.getClass(), "kafkaOffset", term41);
        setField(term1, term1.getClass(), "kafkaPartition", term43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.consumer.impl.CreateAccountProcessor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.TransactionEvent");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "process", argTypes, null, args);
    }

};


