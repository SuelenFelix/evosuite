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

public class RoleEntity_getDescription_19419352364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3568;

    public RoleEntity_getDescription_19419352364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3569 = new Long(-3842548265506930260L);
        term3568 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity"));
        Object term3595 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3568, term3568.getClass(), "roleId", term3569);
        setField(term3568, term3568.getClass(), "name", "GgZWSjxjyE");
        setField(term3568, term3568.getClass(), "description", "EeBVbzjcCI");
        setIntField(term3595, term3595.getClass(), "nanos", 322000000);
        setLongField(term3595, term3595.getClass(), "fastTime", 1761983901000L);
        setField(term3595, term3595.getClass(), "cdate", null);
        setField(term3568, term3568.getClass(), "createTimestamp", term3595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term3568, args);
    }

};


