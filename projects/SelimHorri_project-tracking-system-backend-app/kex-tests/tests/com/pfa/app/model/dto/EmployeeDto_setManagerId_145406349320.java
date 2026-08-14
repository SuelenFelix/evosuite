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

public class EmployeeDto_setManagerId_145406349320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8423;

    public EmployeeDto_setManagerId_145406349320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8423 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term8423, term8423.getClass(), "employeeId", "sHMXNUzNeM");
        setField(term8423, term8423.getClass(), "firstName", "gPzGDOEPPw");
        setField(term8423, term8423.getClass(), "lastName", "rwKoAngzCu");
        setField(term8423, term8423.getClass(), "email", "VUkRVwROTl");
        setField(term8423, term8423.getClass(), "phone", "UDlkdccCRn");
        setField(term8423, term8423.getClass(), "hiredate", "McpzErOcYb");
        setField(term8423, term8423.getClass(), "job", "jqrVEUvYEz");
        setField(term8423, term8423.getClass(), "salary", "QITgiBrmfj");
        setField(term8423, term8423.getClass(), "managerId", "pXxkiXgQnq");
        setField(term8423, term8423.getClass(), "username", "tKmrUDURku");
        setField(term8423, term8423.getClass(), "password", "JeZbrwZmsP");
        setField(term8423, term8423.getClass(), "role", "bxyfeicqrK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vBnWPlsZMk";
        callMethod(klass, "setManagerId", argTypes, term8423, args);
    }

};


