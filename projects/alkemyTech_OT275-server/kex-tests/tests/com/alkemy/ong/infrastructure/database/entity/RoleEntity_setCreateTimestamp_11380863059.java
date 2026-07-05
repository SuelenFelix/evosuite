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

public class RoleEntity_setCreateTimestamp_11380863059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3864;
     Object term3894;

    public RoleEntity_setCreateTimestamp_11380863059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3865 = new Long(-1468719814009985452L);
        term3864 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity"));
        Object term3891 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3864, term3864.getClass(), "roleId", term3865);
        setField(term3864, term3864.getClass(), "name", "HHmNoYxIGj");
        setField(term3864, term3864.getClass(), "description", "PtirvZmsGt");
        setIntField(term3891, term3891.getClass(), "nanos", 545000000);
        setLongField(term3891, term3891.getClass(), "fastTime", 1802984633000L);
        setField(term3891, term3891.getClass(), "cdate", null);
        setField(term3864, term3864.getClass(), "createTimestamp", term3891);
        term3894 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term3894, term3894.getClass(), "nanos", 357000000);
        setLongField(term3894, term3894.getClass(), "fastTime", 1843204017000L);
        setField(term3894, term3894.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term3894;
        callMethod(klass, "setCreateTimestamp", argTypes, term3864, args);
    }

};


