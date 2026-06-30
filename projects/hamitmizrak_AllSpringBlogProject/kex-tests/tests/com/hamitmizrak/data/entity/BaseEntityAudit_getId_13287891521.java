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

public class BaseEntityAudit_getId_13287891521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public BaseEntityAudit_getId_13287891521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term136 = new Long(2442117782898005296L);
        term135 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term150 = newInstance(Class.forName("java.util.Date"));
        Object term164 = newInstance(Class.forName("java.util.Date"));
        setField(term135, term135.getClass(), "id", term136);
        setField(term135, term135.getClass(), "createdBy", "SzjVpOQTyS");
        setLongField(term150, term150.getClass(), "fastTime", 1345871412244L);
        setField(term150, term150.getClass(), "cdate", null);
        setField(term135, term135.getClass(), "createdDate", term150);
        setField(term135, term135.getClass(), "updateBy", "MjGYSRKTNF");
        setLongField(term164, term164.getClass(), "fastTime", 1480438351369L);
        setField(term164, term164.getClass(), "cdate", null);
        setField(term135, term135.getClass(), "updateDate", term164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term135, args);
    }

};


