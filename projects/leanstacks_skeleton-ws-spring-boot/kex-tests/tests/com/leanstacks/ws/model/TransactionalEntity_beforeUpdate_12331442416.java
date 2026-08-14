package com.leanstacks.ws.model;

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
import static com.leanstacks.ws.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class TransactionalEntity_beforeUpdate_12331442416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6193;

    public TransactionalEntity_beforeUpdate_12331442416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6194 = new Long(-3936701866695933852L);
        Integer term6234 = new Integer(-615654495);
        term6193 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term6248 = newInstance(Class.forName("java.time.Instant"));
        Object term6263 = newInstance(Class.forName("java.time.Instant"));
        setField(term6193, term6193.getClass(), "id", term6194);
        setField(term6193, term6193.getClass(), "referenceId", "8a42ffe4-465b-4100-ab1c-b0e1a73d63e8");
        setField(term6193, term6193.getClass(), "version", term6234);
        setField(term6193, term6193.getClass(), "createdBy", "doQLHkjpNm");
        setLongField(term6248, term6248.getClass(), "seconds", 1526982178L);
        setIntField(term6248, term6248.getClass(), "nanos", 232000000);
        setField(term6193, term6193.getClass(), "createdAt", term6248);
        setField(term6193, term6193.getClass(), "updatedBy", "lCyLIcSuom");
        setLongField(term6263, term6263.getClass(), "seconds", 1308378194L);
        setIntField(term6263, term6263.getClass(), "nanos", 197000000);
        setField(term6193, term6193.getClass(), "updatedAt", term6263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beforeUpdate", argTypes, term6193, args);
    }

};


