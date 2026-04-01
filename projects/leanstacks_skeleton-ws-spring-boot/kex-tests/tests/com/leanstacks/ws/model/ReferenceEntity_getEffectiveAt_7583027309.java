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

public class ReferenceEntity_getEffectiveAt_7583027309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513;

    public ReferenceEntity_getEffectiveAt_7583027309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term514 = new Long(6967924379644551255L);
        Integer term540 = new Integer(-1339778481);
        term513 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term542 = newInstance(Class.forName("java.time.Instant"));
        Object term545 = newInstance(Class.forName("java.time.Instant"));
        Object term548 = newInstance(Class.forName("java.time.Instant"));
        setField(term513, term513.getClass(), "id", term514);
        setField(term513, term513.getClass(), "code", "HyxfbSQYBe");
        setField(term513, term513.getClass(), "label", "pCTimMblYc");
        setField(term513, term513.getClass(), "ordinal", term540);
        setLongField(term542, term542.getClass(), "seconds", 1347400561L);
        setIntField(term542, term542.getClass(), "nanos", 385000000);
        setField(term513, term513.getClass(), "effectiveAt", term542);
        setLongField(term545, term545.getClass(), "seconds", 1502158153L);
        setIntField(term545, term545.getClass(), "nanos", 899000000);
        setField(term513, term513.getClass(), "expiresAt", term545);
        setLongField(term548, term548.getClass(), "seconds", 1630952644L);
        setIntField(term548, term548.getClass(), "nanos", 759000000);
        setField(term513, term513.getClass(), "createdAt", term548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectiveAt", argTypes, term513, args);
    }

};


