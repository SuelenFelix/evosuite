package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class RoleMenu_setRoleId_4662450343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39464;
     Object term39469;

    public RoleMenu_setRoleId_4662450343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39465 = new Integer(1519973734);
        Integer term39467 = new Integer(-988300994);
        term39464 = newInstance(Class.forName("com.org.model.RoleMenu"));
        setField(term39464, term39464.getClass(), "roleId", term39465);
        setField(term39464, term39464.getClass(), "menuId", term39467);
        term39469 = new Integer(1939692211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.RoleMenu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term39469;
        callMethod(klass, "setRoleId", argTypes, term39464, args);
    }

};


