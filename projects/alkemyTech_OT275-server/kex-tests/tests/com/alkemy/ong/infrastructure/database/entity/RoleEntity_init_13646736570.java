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

public class RoleEntity_init_13646736570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3419;
     Object term3445;

    public RoleEntity_init_13646736570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3419 = new Long(-2170847986967241072L);
        term3445 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term3445, term3445.getClass(), "nanos", 549000000);
        setLongField(term3445, term3445.getClass(), "fastTime", 1819180838000L);
        setField(term3445, term3445.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[4];
        args[0] = term3419;
        args[1] = "PznxWXsZME";
        args[2] = "ZzIujlwVsw";
        args[3] = term3445;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


