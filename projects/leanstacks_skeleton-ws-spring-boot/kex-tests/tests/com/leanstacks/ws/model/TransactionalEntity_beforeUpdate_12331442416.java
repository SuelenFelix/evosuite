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
     Object term6179;

    public TransactionalEntity_beforeUpdate_12331442416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6180 = new Long(-3936701866695933852L);
        Integer term6220 = new Integer(-615654495);
        term6179 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term6234 = newInstance(Class.forName("java.time.Instant"));
        Object term6249 = newInstance(Class.forName("java.time.Instant"));
        setField(term6179, term6179.getClass(), "id", term6180);
        setField(term6179, term6179.getClass(), "referenceId", "9e4f518d-4e5a-4b45-92b4-57940aae0272");
        setField(term6179, term6179.getClass(), "version", term6220);
        setField(term6179, term6179.getClass(), "createdBy", "doQLHkjpNm");
        setLongField(term6234, term6234.getClass(), "seconds", 1526982178L);
        setIntField(term6234, term6234.getClass(), "nanos", 232000000);
        setField(term6179, term6179.getClass(), "createdAt", term6234);
        setField(term6179, term6179.getClass(), "updatedBy", "lCyLIcSuom");
        setLongField(term6249, term6249.getClass(), "seconds", 1308378194L);
        setIntField(term6249, term6249.getClass(), "nanos", 197000000);
        setField(term6179, term6179.getClass(), "updatedAt", term6249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beforeUpdate", argTypes, term6179, args);
    }

};


