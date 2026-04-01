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

public class ReferenceEntity_getCode_16811173423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public ReferenceEntity_getCode_16811173423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term120 = new Long(-8400487765614892086L);
        Integer term146 = new Integer(1484323161);
        term119 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term148 = newInstance(Class.forName("java.time.Instant"));
        Object term151 = newInstance(Class.forName("java.time.Instant"));
        Object term154 = newInstance(Class.forName("java.time.Instant"));
        setField(term119, term119.getClass(), "id", term120);
        setField(term119, term119.getClass(), "code", "jJCZpVmanW");
        setField(term119, term119.getClass(), "label", "EGtDIRbSSb");
        setField(term119, term119.getClass(), "ordinal", term146);
        setLongField(term148, term148.getClass(), "seconds", 1429023851L);
        setIntField(term148, term148.getClass(), "nanos", 389000000);
        setField(term119, term119.getClass(), "effectiveAt", term148);
        setLongField(term151, term151.getClass(), "seconds", 1495357463L);
        setIntField(term151, term151.getClass(), "nanos", 288000000);
        setField(term119, term119.getClass(), "expiresAt", term151);
        setLongField(term154, term154.getClass(), "seconds", 1645834034L);
        setIntField(term154, term154.getClass(), "nanos", 896000000);
        setField(term119, term119.getClass(), "createdAt", term154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCode", argTypes, term119, args);
    }

};


