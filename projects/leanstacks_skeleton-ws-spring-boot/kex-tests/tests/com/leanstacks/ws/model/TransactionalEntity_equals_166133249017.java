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

public class TransactionalEntity_equals_166133249017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6308;
     Object term6381;

    public TransactionalEntity_equals_166133249017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6309 = new Long(1215116475929634177L);
        Integer term6349 = new Integer(-1476117762);
        term6308 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term6363 = newInstance(Class.forName("java.time.Instant"));
        Object term6378 = newInstance(Class.forName("java.time.Instant"));
        setField(term6308, term6308.getClass(), "id", term6309);
        setField(term6308, term6308.getClass(), "referenceId", "0dd887d6-910f-4159-84af-ca356dc5bde4");
        setField(term6308, term6308.getClass(), "version", term6349);
        setField(term6308, term6308.getClass(), "createdBy", "CGOpQSZZwI");
        setLongField(term6363, term6363.getClass(), "seconds", 1647406623L);
        setIntField(term6363, term6363.getClass(), "nanos", 363000000);
        setField(term6308, term6308.getClass(), "createdAt", term6363);
        setField(term6308, term6308.getClass(), "updatedBy", "ypEdrstygY");
        setLongField(term6378, term6378.getClass(), "seconds", 1312384068L);
        setIntField(term6378, term6378.getClass(), "nanos", 303000000);
        setField(term6308, term6308.getClass(), "updatedAt", term6378);
        term6381 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6381;
        callMethod(klass, "equals", argTypes, term6308, args);
    }

};


