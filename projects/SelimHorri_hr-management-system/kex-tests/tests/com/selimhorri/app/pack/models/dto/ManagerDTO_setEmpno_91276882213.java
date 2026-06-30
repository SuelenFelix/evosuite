package com.selimhorri.app.pack.models.dto;

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
import static com.selimhorri.app.pack.models.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ManagerDTO_setEmpno_91276882213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672;

    public ManagerDTO_setEmpno_91276882213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672 = newInstance(Class.forName("com.selimhorri.app.pack.models.dto.ManagerDTO"));
        setField(term672, term672.getClass(), "empno", null);
        setField(term672, term672.getClass(), "ename", null);
        setField(term672, term672.getClass(), "mgr", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.dto.ManagerDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEmpno", argTypes, term672, args);
    }

};


