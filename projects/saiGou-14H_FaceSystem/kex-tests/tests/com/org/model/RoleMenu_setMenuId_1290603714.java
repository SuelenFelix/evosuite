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

public class RoleMenu_setMenuId_1290603714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39471;
     Object term39476;

    public RoleMenu_setMenuId_1290603714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39472 = new Integer(121806851);
        Integer term39474 = new Integer(1753247664);
        term39471 = newInstance(Class.forName("com.org.model.RoleMenu"));
        setField(term39471, term39471.getClass(), "roleId", term39472);
        setField(term39471, term39471.getClass(), "menuId", term39474);
        term39476 = new Integer(521507971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.RoleMenu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term39476;
        callMethod(klass, "setMenuId", argTypes, term39471, args);
    }

};


