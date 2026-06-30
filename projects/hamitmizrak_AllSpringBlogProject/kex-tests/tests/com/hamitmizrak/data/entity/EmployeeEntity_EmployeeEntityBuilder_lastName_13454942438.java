package com.hamitmizrak.data.entity;

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
import static com.hamitmizrak.data.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeEntity_EmployeeEntityBuilder_lastName_13454942438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1317;

    public EmployeeEntity_EmployeeEntityBuilder_lastName_13454942438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1317 = newInstance(Class.forName("com.hamitmizrak.data.entity.EmployeeEntity$EmployeeEntityBuilder"));
        setField(term1317, term1317.getClass(), "firstName", null);
        setField(term1317, term1317.getClass(), "lastName", null);
        setField(term1317, term1317.getClass(), "emailId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.EmployeeEntity$EmployeeEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "lastName", argTypes, term1317, args);
    }

};


