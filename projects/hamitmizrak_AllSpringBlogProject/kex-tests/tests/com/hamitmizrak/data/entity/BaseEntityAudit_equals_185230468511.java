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

public class BaseEntityAudit_equals_185230468511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term695;
     Object term726;

    public BaseEntityAudit_equals_185230468511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term696 = new Long(-8885298608300233488L);
        term695 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term710 = newInstance(Class.forName("java.util.Date"));
        Object term724 = newInstance(Class.forName("java.util.Date"));
        setField(term695, term695.getClass(), "id", term696);
        setField(term695, term695.getClass(), "createdBy", "IoAlmYsBwc");
        setLongField(term710, term710.getClass(), "fastTime", 1538078916394L);
        setField(term710, term710.getClass(), "cdate", null);
        setField(term695, term695.getClass(), "createdDate", term710);
        setField(term695, term695.getClass(), "updateBy", "TEParAifyi");
        setLongField(term724, term724.getClass(), "fastTime", 1744090065937L);
        setField(term724, term724.getClass(), "cdate", null);
        setField(term695, term695.getClass(), "updateDate", term724);
        term726 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term726;
        callMethod(klass, "equals", argTypes, term695, args);
    }

};


