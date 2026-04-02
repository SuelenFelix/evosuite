package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class BaseEntity_getCreated_12500527577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4593;

    public BaseEntity_getCreated_12500527577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4594 = new Long(4626639872957534248L);
        term4593 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity"));
        Object term4597 = newInstance(Class.forName("java.util.Date"));
        Object term4599 = newInstance(Class.forName("java.util.Date"));
        setField(term4593, term4593.getClass(), "id", term4594);
        setBooleanField(term4593, term4593.getClass(), "enabled", false);
        setLongField(term4597, term4597.getClass(), "fastTime", 1579107331640L);
        setField(term4597, term4597.getClass(), "cdate", null);
        setField(term4593, term4593.getClass(), "created", term4597);
        setLongField(term4599, term4599.getClass(), "fastTime", 1504206452490L);
        setField(term4599, term4599.getClass(), "cdate", null);
        setField(term4593, term4593.getClass(), "updated", term4599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreated", argTypes, term4593, args);
    }

};


