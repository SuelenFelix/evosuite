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

public class TransactionalEntity_getId_11378169571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4182;

    public TransactionalEntity_getId_11378169571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4183 = new Long(-2177368829816872572L);
        Integer term4223 = new Integer(-505439934);
        term4182 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term4237 = newInstance(Class.forName("java.time.Instant"));
        Object term4252 = newInstance(Class.forName("java.time.Instant"));
        setField(term4182, term4182.getClass(), "id", term4183);
        setField(term4182, term4182.getClass(), "referenceId", "812a2f9d-3f53-4222-8795-ddf8221c73ba");
        setField(term4182, term4182.getClass(), "version", term4223);
        setField(term4182, term4182.getClass(), "createdBy", "WXMWFDGcLB");
        setLongField(term4237, term4237.getClass(), "seconds", 1560286398L);
        setIntField(term4237, term4237.getClass(), "nanos", 870000000);
        setField(term4182, term4182.getClass(), "createdAt", term4237);
        setField(term4182, term4182.getClass(), "updatedBy", "wKWbJssZuG");
        setLongField(term4252, term4252.getClass(), "seconds", 1791294437L);
        setIntField(term4252, term4252.getClass(), "nanos", 21000000);
        setField(term4182, term4182.getClass(), "updatedAt", term4252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4182, args);
    }

};


