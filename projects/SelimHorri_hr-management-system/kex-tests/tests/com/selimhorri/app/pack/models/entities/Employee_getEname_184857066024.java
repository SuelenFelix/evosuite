package com.selimhorri.app.pack.models.entities;

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
import static com.selimhorri.app.pack.models.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Employee_getEname_184857066024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10502;

    public Employee_getEname_184857066024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10502 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term10502, term10502.getClass(), "empno", null);
        setField(term10502, term10502.getClass(), "ename", null);
        setField(term10502, term10502.getClass(), "job", null);
        setField(term10502, term10502.getClass(), "mgr", null);
        setField(term10502, term10502.getClass(), "hireDate", null);
        setField(term10502, term10502.getClass(), "sal", null);
        setField(term10502, term10502.getClass(), "comm", null);
        setField(term10502, term10502.getClass(), "department", null);
        setField(term10502, term10502.getClass(), "userCredential", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEname", argTypes, term10502, args);
    }

};


