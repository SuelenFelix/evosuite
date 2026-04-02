package com.alkemy.ong.infrastructure.database.mapper;

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
import static com.alkemy.ong.infrastructure.database.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class RoleEntityMapper_toDomain_5612268211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1489;
     Object term1490;

    public RoleEntityMapper_toDomain_5612268211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1489 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.RoleEntityMapper"));
        Long term1491 = new Long(2486810210675247493L);
        term1490 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity"));
        Object term1517 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1490, term1490.getClass(), "roleId", term1491);
        setField(term1490, term1490.getClass(), "name", "XPKmummaqg");
        setField(term1490, term1490.getClass(), "description", "BKLfkLiZTH");
        setIntField(term1517, term1517.getClass(), "nanos", 837000000);
        setLongField(term1517, term1517.getClass(), "fastTime", 1606034835000L);
        setField(term1517, term1517.getClass(), "cdate", null);
        setField(term1490, term1490.getClass(), "createTimestamp", term1517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.RoleEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity");
        Object[] args = new Object[1];
        args[0] = term1490;
        callMethod(klass, "toDomain", argTypes, term1489, args);
    }

};


