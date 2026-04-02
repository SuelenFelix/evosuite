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

public class BaseEntity_setUpdated_64963147810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4619;
     Object term4627;

    public BaseEntity_setUpdated_64963147810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4620 = new Long(-1889784286465977825L);
        term4619 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity"));
        Object term4623 = newInstance(Class.forName("java.util.Date"));
        Object term4625 = newInstance(Class.forName("java.util.Date"));
        setField(term4619, term4619.getClass(), "id", term4620);
        setBooleanField(term4619, term4619.getClass(), "enabled", false);
        setLongField(term4623, term4623.getClass(), "fastTime", 1586203190451L);
        setField(term4623, term4623.getClass(), "cdate", null);
        setField(term4619, term4619.getClass(), "created", term4623);
        setLongField(term4625, term4625.getClass(), "fastTime", 1646107013192L);
        setField(term4625, term4625.getClass(), "cdate", null);
        setField(term4619, term4619.getClass(), "updated", term4625);
        term4627 = newInstance(Class.forName("java.util.Date"));
        setLongField(term4627, term4627.getClass(), "fastTime", 1519167927930L);
        setField(term4627, term4627.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term4627;
        callMethod(klass, "setUpdated", argTypes, term4619, args);
    }

};


