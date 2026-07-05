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

public class RoleEntity_getRoleId_20015226722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3468;

    public RoleEntity_getRoleId_20015226722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3469 = new Long(4044358158040652353L);
        term3468 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity"));
        Object term3495 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3468, term3468.getClass(), "roleId", term3469);
        setField(term3468, term3468.getClass(), "name", "LWyEaeIyAo");
        setField(term3468, term3468.getClass(), "description", "yVMkkQhvmN");
        setIntField(term3495, term3495.getClass(), "nanos", 698000000);
        setLongField(term3495, term3495.getClass(), "fastTime", 1400680978000L);
        setField(term3495, term3495.getClass(), "cdate", null);
        setField(term3468, term3468.getClass(), "createTimestamp", term3495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.RoleEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoleId", argTypes, term3468, args);
    }

};


