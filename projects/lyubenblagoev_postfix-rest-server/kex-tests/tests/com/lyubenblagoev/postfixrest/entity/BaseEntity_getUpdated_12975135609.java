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

public class BaseEntity_getUpdated_12975135609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4611;

    public BaseEntity_getUpdated_12975135609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4612 = new Long(-5455716707538294699L);
        term4611 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity"));
        Object term4615 = newInstance(Class.forName("java.util.Date"));
        Object term4617 = newInstance(Class.forName("java.util.Date"));
        setField(term4611, term4611.getClass(), "id", term4612);
        setBooleanField(term4611, term4611.getClass(), "enabled", false);
        setLongField(term4615, term4615.getClass(), "fastTime", 1703142677020L);
        setField(term4615, term4615.getClass(), "cdate", null);
        setField(term4611, term4611.getClass(), "created", term4615);
        setLongField(term4617, term4617.getClass(), "fastTime", 1279199308944L);
        setField(term4617, term4617.getClass(), "cdate", null);
        setField(term4611, term4611.getClass(), "updated", term4617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdated", argTypes, term4611, args);
    }

};


