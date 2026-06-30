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
import java.lang.Long;

public class EmployeeDto_EmployeeDtoBuilder_lastName_6196384933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301;

    public EmployeeDto_EmployeeDtoBuilder_lastName_6196384933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term302 = new Long(7411271909051562686L);
        term301 = newInstance(Class.forName("com.hamitmizrak.business.dto.EmployeeDto$EmployeeDtoBuilder"));
        setField(term301, term301.getClass(), "id", term302);
        setField(term301, term301.getClass(), "firstName", "LQFpaHEwXR");
        setField(term301, term301.getClass(), "lastName", "oVcInYnLWB");
        setField(term301, term301.getClass(), "emailId", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.business.dto.EmployeeDto$EmployeeDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        callMethod(klass, "lastName", argTypes, term301, args);
    }

};


