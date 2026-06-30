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

public class BaseEntity_isEnabled_13380698365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4575;

    public BaseEntity_isEnabled_13380698365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4576 = new Long(-4187265590402169996L);
        term4575 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity"));
        Object term4579 = newInstance(Class.forName("java.util.Date"));
        Object term4581 = newInstance(Class.forName("java.util.Date"));
        setField(term4575, term4575.getClass(), "id", term4576);
        setBooleanField(term4575, term4575.getClass(), "enabled", false);
        setLongField(term4579, term4579.getClass(), "fastTime", 1587362579490L);
        setField(term4579, term4579.getClass(), "cdate", null);
        setField(term4575, term4575.getClass(), "created", term4579);
        setLongField(term4581, term4581.getClass(), "fastTime", 1690947776364L);
        setField(term4581, term4581.getClass(), "cdate", null);
        setField(term4575, term4575.getClass(), "updated", term4581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnabled", argTypes, term4575, args);
    }

};


