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

public class TransactionalEntity_beforeUpdate_12331442417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9955;

    public TransactionalEntity_beforeUpdate_12331442417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9956 = new Long(6273754186658578034L);
        Integer term9996 = new Integer(-1963434938);
        term9955 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term10010 = newInstance(Class.forName("java.time.Instant"));
        Object term10025 = newInstance(Class.forName("java.time.Instant"));
        setField(term9955, term9955.getClass(), "id", term9956);
        setField(term9955, term9955.getClass(), "referenceId", "81b0b5c3-e719-4edd-9475-f991b8b23c59");
        setField(term9955, term9955.getClass(), "version", term9996);
        setField(term9955, term9955.getClass(), "createdBy", "aanyiAOJCl");
        setLongField(term10010, term10010.getClass(), "seconds", 1689828992L);
        setIntField(term10010, term10010.getClass(), "nanos", 84000000);
        setField(term9955, term9955.getClass(), "createdAt", term10010);
        setField(term9955, term9955.getClass(), "updatedBy", "VDokbsCuqq");
        setLongField(term10025, term10025.getClass(), "seconds", 1288596730L);
        setIntField(term10025, term10025.getClass(), "nanos", 763000000);
        setField(term9955, term9955.getClass(), "updatedAt", term10025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beforeUpdate", argTypes, term9955, args);
    }

};


