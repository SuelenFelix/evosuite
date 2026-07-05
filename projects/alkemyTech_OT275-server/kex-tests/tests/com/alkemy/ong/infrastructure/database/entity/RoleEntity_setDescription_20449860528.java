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

public class RoleEntity_setDescription_20449860528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3792;

    public RoleEntity_setDescription_20449860528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3793 = new Long(-2644215923136513282L);
        term3792 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity"));
        Object term3819 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3792, term3792.getClass(), "roleId", term3793);
        setField(term3792, term3792.getClass(), "name", "VYkqXKVlAJ");
        setField(term3792, term3792.getClass(), "description", "XkIoWJRNwN");
        setIntField(term3819, term3819.getClass(), "nanos", 628000000);
        setLongField(term3819, term3819.getClass(), "fastTime", 1795925537000L);
        setField(term3819, term3819.getClass(), "cdate", null);
        setField(term3792, term3792.getClass(), "createTimestamp", term3819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aNWLJdrZMq";
        callMethod(klass, "setDescription", argTypes, term3792, args);
    }

};


