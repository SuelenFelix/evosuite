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

public class EmployeeEntity_EmployeeEntityBuilder_build_7051817994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1182;

    public EmployeeEntity_EmployeeEntityBuilder_build_7051817994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1182 = newInstance(Class.forName("com.hamitmizrak.data.entity.EmployeeEntity$EmployeeEntityBuilder"));
        setField(term1182, term1182.getClass(), "firstName", "xLbjWUgOIL");
        setField(term1182, term1182.getClass(), "lastName", "jDtqGUpnZN");
        setField(term1182, term1182.getClass(), "emailId", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.EmployeeEntity$EmployeeEntityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1182, args);
    }

};


