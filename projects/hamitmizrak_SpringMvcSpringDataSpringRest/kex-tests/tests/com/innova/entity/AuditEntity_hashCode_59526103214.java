package com.innova.entity;

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
import static com.innova.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AuditEntity_hashCode_59526103214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term914;

    public AuditEntity_hashCode_59526103214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term914 = newInstance(Class.forName("com.innova.entity.AuditEntity"));
        setField(term914, term914.getClass(), "auditName", null);
        setField(term914, term914.getClass(), "id", null);
        setField(term914, term914.getClass(), "createdBy", null);
        setField(term914, term914.getClass(), "createdDate", null);
        setField(term914, term914.getClass(), "updateBy", null);
        setField(term914, term914.getClass(), "updatedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.AuditEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term914, args);
    }

};


