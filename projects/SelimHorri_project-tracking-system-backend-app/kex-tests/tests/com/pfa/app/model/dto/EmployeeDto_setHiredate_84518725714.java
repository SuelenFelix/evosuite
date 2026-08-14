package com.pfa.app.model.dto;

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
import static com.pfa.app.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeDto_setHiredate_84518725714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6767;

    public EmployeeDto_setHiredate_84518725714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6767 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term6767, term6767.getClass(), "employeeId", "IEYhJmgCVd");
        setField(term6767, term6767.getClass(), "firstName", "KSJeYkkvpk");
        setField(term6767, term6767.getClass(), "lastName", "qUtkFGMNUV");
        setField(term6767, term6767.getClass(), "email", "mGRiYhnMcR");
        setField(term6767, term6767.getClass(), "phone", "NFlvfJCVPO");
        setField(term6767, term6767.getClass(), "hiredate", "KarbTXFmUU");
        setField(term6767, term6767.getClass(), "job", "jiUSjqwSIQ");
        setField(term6767, term6767.getClass(), "salary", "MgLCedQfoj");
        setField(term6767, term6767.getClass(), "managerId", "zgKiINdgNu");
        setField(term6767, term6767.getClass(), "username", "zLMTXDQHYH");
        setField(term6767, term6767.getClass(), "password", "PqywFWJlpE");
        setField(term6767, term6767.getClass(), "role", "OzXRsFGTIp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TjWpyghUWN";
        callMethod(klass, "setHiredate", argTypes, term6767, args);
    }

};


