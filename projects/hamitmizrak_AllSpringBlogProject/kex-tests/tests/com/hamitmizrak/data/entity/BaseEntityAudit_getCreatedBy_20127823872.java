package com.hamitmizrak.data.entity;

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
import static com.hamitmizrak.data.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class BaseEntityAudit_getCreatedBy_20127823872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186;

    public BaseEntityAudit_getCreatedBy_20127823872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term187 = new Long(6375119433582206027L);
        term186 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term201 = newInstance(Class.forName("java.util.Date"));
        Object term215 = newInstance(Class.forName("java.util.Date"));
        setField(term186, term186.getClass(), "id", term187);
        setField(term186, term186.getClass(), "createdBy", "hRNSzYYIrc");
        setLongField(term201, term201.getClass(), "fastTime", 1610940182830L);
        setField(term201, term201.getClass(), "cdate", null);
        setField(term186, term186.getClass(), "createdDate", term201);
        setField(term186, term186.getClass(), "updateBy", "RMFIsYGgne");
        setLongField(term215, term215.getClass(), "fastTime", 1606045635837L);
        setField(term215, term215.getClass(), "cdate", null);
        setField(term186, term186.getClass(), "updateDate", term215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedBy", argTypes, term186, args);
    }

};


