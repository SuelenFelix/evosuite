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

public class UserDepartment_setUserid_12503828253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38916;
     Object term38921;

    public UserDepartment_setUserid_12503828253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38917 = new Integer(-147077267);
        Integer term38919 = new Integer(-550222549);
        term38916 = newInstance(Class.forName("com.org.model.UserDepartment"));
        setField(term38916, term38916.getClass(), "userid", term38917);
        setField(term38916, term38916.getClass(), "departmentid", term38919);
        term38921 = new Integer(-499576898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserDepartment");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term38921;
        callMethod(klass, "setUserid", argTypes, term38916, args);
    }

};


