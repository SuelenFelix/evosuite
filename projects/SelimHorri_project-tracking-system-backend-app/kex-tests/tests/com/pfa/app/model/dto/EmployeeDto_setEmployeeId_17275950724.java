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

public class EmployeeDto_setEmployeeId_17275950724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4007;

    public EmployeeDto_setEmployeeId_17275950724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4007 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term4007, term4007.getClass(), "employeeId", "UBRmXJmfrt");
        setField(term4007, term4007.getClass(), "firstName", "WZzvmIHhzZ");
        setField(term4007, term4007.getClass(), "lastName", "doQLHkjpNm");
        setField(term4007, term4007.getClass(), "email", "lCyLIcSuom");
        setField(term4007, term4007.getClass(), "phone", "CGOpQSZZwI");
        setField(term4007, term4007.getClass(), "hiredate", "ypEdrstygY");
        setField(term4007, term4007.getClass(), "job", "sNQFlATEeQ");
        setField(term4007, term4007.getClass(), "salary", "ZKMLioamsY");
        setField(term4007, term4007.getClass(), "managerId", "WVbxuoDBcn");
        setField(term4007, term4007.getClass(), "username", "pvDEABOxLt");
        setField(term4007, term4007.getClass(), "password", "beAMpkroCQ");
        setField(term4007, term4007.getClass(), "role", "uSUvKAyuvd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onQLVONGuf";
        callMethod(klass, "setEmployeeId", argTypes, term4007, args);
    }

};


