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

public class EmployeeDto_getLastName_4656560007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4846;

    public EmployeeDto_getLastName_4656560007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4846 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term4846, term4846.getClass(), "employeeId", "urCiQnUFBM");
        setField(term4846, term4846.getClass(), "firstName", "EKjQdtKxAM");
        setField(term4846, term4846.getClass(), "lastName", "TXZAIPQJHt");
        setField(term4846, term4846.getClass(), "email", "DIbeDHICho");
        setField(term4846, term4846.getClass(), "phone", "dJGPlmSRnz");
        setField(term4846, term4846.getClass(), "hiredate", "DPskuFUobI");
        setField(term4846, term4846.getClass(), "job", "wBGfLpNNiZ");
        setField(term4846, term4846.getClass(), "salary", "yUGCjlqgJE");
        setField(term4846, term4846.getClass(), "managerId", "PXdVZyoJyC");
        setField(term4846, term4846.getClass(), "username", "vLerpqavFM");
        setField(term4846, term4846.getClass(), "password", "qnvxzwuGKX");
        setField(term4846, term4846.getClass(), "role", "EdPAvpluZg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term4846, args);
    }

};


