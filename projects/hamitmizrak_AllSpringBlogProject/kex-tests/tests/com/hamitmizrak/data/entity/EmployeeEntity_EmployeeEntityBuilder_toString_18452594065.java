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

public class EmployeeEntity_EmployeeEntityBuilder_toString_18452594065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1249;

    public EmployeeEntity_EmployeeEntityBuilder_toString_18452594065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1249 = newInstance(Class.forName("com.hamitmizrak.data.entity.EmployeeEntity$EmployeeEntityBuilder"));
        setField(term1249, term1249.getClass(), "firstName", "UiUYnPrcCi");
        setField(term1249, term1249.getClass(), "lastName", "UoYtihxVaS");
        setField(term1249, term1249.getClass(), "emailId", "JDswTTCZHV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.EmployeeEntity$EmployeeEntityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1249, args);
    }

};


