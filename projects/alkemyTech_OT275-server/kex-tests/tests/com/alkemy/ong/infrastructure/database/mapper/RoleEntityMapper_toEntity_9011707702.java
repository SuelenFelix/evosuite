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

public class RoleEntityMapper_toEntity_9011707702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1540;
     Object term1541;

    public RoleEntityMapper_toEntity_9011707702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1540 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.RoleEntityMapper"));
        Long term1542 = new Long(7009926388951271268L);
        term1541 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term1541, term1541.getClass(), "id", term1542);
        setField(term1541, term1541.getClass(), "name", "SPpkrGcPRr");
        setField(term1541, term1541.getClass(), "description", "sEccwbJKYE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.RoleEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Role");
        Object[] args = new Object[1];
        args[0] = term1541;
        callMethod(klass, "toEntity", argTypes, term1540, args);
    }

};


