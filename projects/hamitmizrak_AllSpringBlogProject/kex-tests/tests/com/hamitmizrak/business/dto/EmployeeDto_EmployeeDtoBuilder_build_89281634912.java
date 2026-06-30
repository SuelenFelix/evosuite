package com.hamitmizrak.business.dto;

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
import static com.hamitmizrak.business.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeDto_EmployeeDtoBuilder_build_89281634912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625;

    public EmployeeDto_EmployeeDtoBuilder_build_89281634912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term625 = newInstance(Class.forName("com.hamitmizrak.business.dto.EmployeeDto$EmployeeDtoBuilder"));
        setField(term625, term625.getClass(), "id", null);
        setField(term625, term625.getClass(), "firstName", null);
        setField(term625, term625.getClass(), "lastName", null);
        setField(term625, term625.getClass(), "emailId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.business.dto.EmployeeDto$EmployeeDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term625, args);
    }

};


