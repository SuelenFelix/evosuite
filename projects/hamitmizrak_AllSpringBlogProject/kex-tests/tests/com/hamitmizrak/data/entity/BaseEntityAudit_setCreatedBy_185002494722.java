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

public class BaseEntityAudit_setCreatedBy_185002494722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term907;

    public BaseEntityAudit_setCreatedBy_185002494722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term907 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        setField(term907, term907.getClass(), "id", null);
        setField(term907, term907.getClass(), "createdBy", null);
        setField(term907, term907.getClass(), "createdDate", null);
        setField(term907, term907.getClass(), "updateBy", null);
        setField(term907, term907.getClass(), "updateDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreatedBy", argTypes, term907, args);
    }

};


