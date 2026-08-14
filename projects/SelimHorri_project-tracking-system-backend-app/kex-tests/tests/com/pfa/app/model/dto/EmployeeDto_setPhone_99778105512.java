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

public class EmployeeDto_setPhone_99778105512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6215;

    public EmployeeDto_setPhone_99778105512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6215 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term6215, term6215.getClass(), "employeeId", "lgQkrXANyI");
        setField(term6215, term6215.getClass(), "firstName", "MeTmRZXErV");
        setField(term6215, term6215.getClass(), "lastName", "jNxbVmoZgq");
        setField(term6215, term6215.getClass(), "email", "PvmBHIXaMY");
        setField(term6215, term6215.getClass(), "phone", "hulYxtowxw");
        setField(term6215, term6215.getClass(), "hiredate", "GNEmuHPNcU");
        setField(term6215, term6215.getClass(), "job", "IoSfuKDFRe");
        setField(term6215, term6215.getClass(), "salary", "AWYyZiNfsm");
        setField(term6215, term6215.getClass(), "managerId", "ITRRYiuDwH");
        setField(term6215, term6215.getClass(), "username", "llRfwANcVF");
        setField(term6215, term6215.getClass(), "password", "sUEeHQTWkA");
        setField(term6215, term6215.getClass(), "role", "BDIRCxAWLA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eOJfbiZLnb";
        callMethod(klass, "setPhone", argTypes, term6215, args);
    }

};


