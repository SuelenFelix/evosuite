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

public class RoleEntity_setRoleId_2852865426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3668;
     Object term3698;

    public RoleEntity_setRoleId_2852865426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3669 = new Long(2936323121573284007L);
        term3668 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity"));
        Object term3695 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3668, term3668.getClass(), "roleId", term3669);
        setField(term3668, term3668.getClass(), "name", "WHcwFgsGFC");
        setField(term3668, term3668.getClass(), "description", "HzqpegHiRq");
        setIntField(term3695, term3695.getClass(), "nanos", 394000000);
        setLongField(term3695, term3695.getClass(), "fastTime", 1362769763000L);
        setField(term3695, term3695.getClass(), "cdate", null);
        setField(term3668, term3668.getClass(), "createTimestamp", term3695);
        term3698 = new Long(-1154553077993834885L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3698;
        callMethod(klass, "setRoleId", argTypes, term3668, args);
    }

};


