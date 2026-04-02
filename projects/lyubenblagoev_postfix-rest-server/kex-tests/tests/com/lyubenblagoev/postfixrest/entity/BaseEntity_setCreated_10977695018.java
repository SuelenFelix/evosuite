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

public class BaseEntity_setCreated_10977695018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4601;
     Object term4609;

    public BaseEntity_setCreated_10977695018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4602 = new Long(-7062466217011408314L);
        term4601 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity"));
        Object term4605 = newInstance(Class.forName("java.util.Date"));
        Object term4607 = newInstance(Class.forName("java.util.Date"));
        setField(term4601, term4601.getClass(), "id", term4602);
        setBooleanField(term4601, term4601.getClass(), "enabled", true);
        setLongField(term4605, term4605.getClass(), "fastTime", 1693330343338L);
        setField(term4605, term4605.getClass(), "cdate", null);
        setField(term4601, term4601.getClass(), "created", term4605);
        setLongField(term4607, term4607.getClass(), "fastTime", 1262424641407L);
        setField(term4607, term4607.getClass(), "cdate", null);
        setField(term4601, term4601.getClass(), "updated", term4607);
        term4609 = newInstance(Class.forName("java.util.Date"));
        setLongField(term4609, term4609.getClass(), "fastTime", 1489417381567L);
        setField(term4609, term4609.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term4609;
        callMethod(klass, "setCreated", argTypes, term4601, args);
    }

};


