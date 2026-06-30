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

public class RoleEntity_getCreateTimestamp_1248167095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3618;

    public RoleEntity_getCreateTimestamp_1248167095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3619 = new Long(-5788180182343976541L);
        term3618 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity"));
        Object term3645 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3618, term3618.getClass(), "roleId", term3619);
        setField(term3618, term3618.getClass(), "name", "UfQtPRyWRC");
        setField(term3618, term3618.getClass(), "description", "FPvxVzzSvD");
        setIntField(term3645, term3645.getClass(), "nanos", 458000000);
        setLongField(term3645, term3645.getClass(), "fastTime", 1695414469000L);
        setField(term3645, term3645.getClass(), "cdate", null);
        setField(term3618, term3618.getClass(), "createTimestamp", term3645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTimestamp", argTypes, term3618, args);
    }

};


