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

public class Employee_getSal_25489690632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10517;

    public Employee_getSal_25489690632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10517 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term10517, term10517.getClass(), "empno", null);
        setField(term10517, term10517.getClass(), "ename", null);
        setField(term10517, term10517.getClass(), "job", null);
        setField(term10517, term10517.getClass(), "mgr", null);
        setField(term10517, term10517.getClass(), "hireDate", null);
        setField(term10517, term10517.getClass(), "sal", null);
        setField(term10517, term10517.getClass(), "comm", null);
        setField(term10517, term10517.getClass(), "department", null);
        setField(term10517, term10517.getClass(), "userCredential", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSal", argTypes, term10517, args);
    }

};


