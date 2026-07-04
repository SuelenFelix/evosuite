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

public class UserDepartment_setDepartmentid_1725894104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38923;
     Object term38928;

    public UserDepartment_setDepartmentid_1725894104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38924 = new Integer(-686129078);
        Integer term38926 = new Integer(1016118972);
        term38923 = newInstance(Class.forName("com.org.model.UserDepartment"));
        setField(term38923, term38923.getClass(), "userid", term38924);
        setField(term38923, term38923.getClass(), "departmentid", term38926);
        term38928 = new Integer(1276607451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserDepartment");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term38928;
        callMethod(klass, "setDepartmentid", argTypes, term38923, args);
    }

};


