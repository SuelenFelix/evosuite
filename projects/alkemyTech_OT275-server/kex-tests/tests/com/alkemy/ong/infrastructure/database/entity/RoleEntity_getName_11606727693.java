package com.alkemy.ong.infrastructure.database.entity;

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
import static com.alkemy.ong.infrastructure.database.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class RoleEntity_getName_11606727693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3518;

    public RoleEntity_getName_11606727693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3519 = new Long(-4443169559037975007L);
        term3518 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity"));
        Object term3545 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3518, term3518.getClass(), "roleId", term3519);
        setField(term3518, term3518.getClass(), "name", "mvrkADEgpp");
        setField(term3518, term3518.getClass(), "description", "pXOkjyeIRb");
        setIntField(term3545, term3545.getClass(), "nanos", 811000000);
        setLongField(term3545, term3545.getClass(), "fastTime", 1741433763000L);
        setField(term3545, term3545.getClass(), "cdate", null);
        setField(term3518, term3518.getClass(), "createTimestamp", term3545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3518, args);
    }

};


