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

public class EmployeeDto_getHiredate_186343759913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6502;

    public EmployeeDto_getHiredate_186343759913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6502 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term6502, term6502.getClass(), "employeeId", "nKZKnxWYCK");
        setField(term6502, term6502.getClass(), "firstName", "JOqQxuzRuZ");
        setField(term6502, term6502.getClass(), "lastName", "RSaoipUlsg");
        setField(term6502, term6502.getClass(), "email", "cSHGbqKqlN");
        setField(term6502, term6502.getClass(), "phone", "pFAfANnxup");
        setField(term6502, term6502.getClass(), "hiredate", "FbSIUZyBXZ");
        setField(term6502, term6502.getClass(), "job", "mhQDwIyrRi");
        setField(term6502, term6502.getClass(), "salary", "HpZXWDPhlg");
        setField(term6502, term6502.getClass(), "managerId", "lBOokzEPfe");
        setField(term6502, term6502.getClass(), "username", "dtGZCsKXbW");
        setField(term6502, term6502.getClass(), "password", "bdyhHbDAmJ");
        setField(term6502, term6502.getClass(), "role", "BBXiTNHqGE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHiredate", argTypes, term6502, args);
    }

};


