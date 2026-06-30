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

public class BaseEntity_getId_9190501343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4557;

    public BaseEntity_getId_9190501343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4558 = new Long(-8985577692063635272L);
        term4557 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity"));
        Object term4561 = newInstance(Class.forName("java.util.Date"));
        Object term4563 = newInstance(Class.forName("java.util.Date"));
        setField(term4557, term4557.getClass(), "id", term4558);
        setBooleanField(term4557, term4557.getClass(), "enabled", false);
        setLongField(term4561, term4561.getClass(), "fastTime", 1541389837495L);
        setField(term4561, term4561.getClass(), "cdate", null);
        setField(term4557, term4557.getClass(), "created", term4561);
        setLongField(term4563, term4563.getClass(), "fastTime", 1881428634502L);
        setField(term4563, term4563.getClass(), "cdate", null);
        setField(term4557, term4557.getClass(), "updated", term4563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4557, args);
    }

};


