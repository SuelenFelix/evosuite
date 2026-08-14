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

public class EmployeeDto_setPassword_160737166224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9527;

    public EmployeeDto_setPassword_160737166224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9527 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term9527, term9527.getClass(), "employeeId", "IlBhdrCvHq");
        setField(term9527, term9527.getClass(), "firstName", "OirVUQhauU");
        setField(term9527, term9527.getClass(), "lastName", "GLbyDfbNZI");
        setField(term9527, term9527.getClass(), "email", "oNLcCYDAsO");
        setField(term9527, term9527.getClass(), "phone", "CNqMxLvtcJ");
        setField(term9527, term9527.getClass(), "hiredate", "ktbqerIaKW");
        setField(term9527, term9527.getClass(), "job", "VoghngXfsK");
        setField(term9527, term9527.getClass(), "salary", "GbahCBMvct");
        setField(term9527, term9527.getClass(), "managerId", "iiHBhsNFgk");
        setField(term9527, term9527.getClass(), "username", "HknsTajwxJ");
        setField(term9527, term9527.getClass(), "password", "XtiurrVYKw");
        setField(term9527, term9527.getClass(), "role", "rsumfoDNHa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ceCWHUTQUM";
        callMethod(klass, "setPassword", argTypes, term9527, args);
    }

};


