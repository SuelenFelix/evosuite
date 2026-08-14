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
     Object term6322;
     Object term6395;

    public TransactionalEntity_equals_166133249017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6323 = new Long(1215116475929634177L);
        Integer term6363 = new Integer(-1476117762);
        term6322 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term6377 = newInstance(Class.forName("java.time.Instant"));
        Object term6392 = newInstance(Class.forName("java.time.Instant"));
        setField(term6322, term6322.getClass(), "id", term6323);
        setField(term6322, term6322.getClass(), "referenceId", "4b97040a-5239-4362-9263-7d19505830e8");
        setField(term6322, term6322.getClass(), "version", term6363);
        setField(term6322, term6322.getClass(), "createdBy", "CGOpQSZZwI");
        setLongField(term6377, term6377.getClass(), "seconds", 1647406623L);
        setIntField(term6377, term6377.getClass(), "nanos", 363000000);
        setField(term6322, term6322.getClass(), "createdAt", term6377);
        setField(term6322, term6322.getClass(), "updatedBy", "ypEdrstygY");
        setLongField(term6392, term6392.getClass(), "seconds", 1312384068L);
        setIntField(term6392, term6392.getClass(), "nanos", 303000000);
        setField(term6322, term6322.getClass(), "updatedAt", term6392);
        term6395 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6395;
        callMethod(klass, "equals", argTypes, term6322, args);
    }

};


