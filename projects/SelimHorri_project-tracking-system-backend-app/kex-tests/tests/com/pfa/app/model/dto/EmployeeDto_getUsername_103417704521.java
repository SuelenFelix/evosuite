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

public class EmployeeDto_getUsername_103417704521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8710;

    public EmployeeDto_getUsername_103417704521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8710 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term8710, term8710.getClass(), "employeeId", "fIZsWucfXz");
        setField(term8710, term8710.getClass(), "firstName", "IApvtmfhnq");
        setField(term8710, term8710.getClass(), "lastName", "VSaNnhMpRc");
        setField(term8710, term8710.getClass(), "email", "QNjNTLlUaV");
        setField(term8710, term8710.getClass(), "phone", "hIYsRyOZxk");
        setField(term8710, term8710.getClass(), "hiredate", "RjNoEywJbC");
        setField(term8710, term8710.getClass(), "job", "RTTvrwwhou");
        setField(term8710, term8710.getClass(), "salary", "lRORwXipuk");
        setField(term8710, term8710.getClass(), "managerId", "fVdTcjgHdw");
        setField(term8710, term8710.getClass(), "username", "wwAwLLcLPp");
        setField(term8710, term8710.getClass(), "password", "nHpMKOmlpQ");
        setField(term8710, term8710.getClass(), "role", "fKhrQsJToZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term8710, args);
    }

};


