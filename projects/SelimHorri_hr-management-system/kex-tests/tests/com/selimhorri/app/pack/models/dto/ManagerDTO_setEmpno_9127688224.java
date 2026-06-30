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
import java.lang.Integer;

public class ManagerDTO_setEmpno_9127688224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509;
     Object term526;

    public ManagerDTO_setEmpno_9127688224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term510 = new Integer(-1955890973);
        Integer term524 = new Integer(-2038273078);
        term509 = newInstance(Class.forName("com.selimhorri.app.pack.models.dto.ManagerDTO"));
        setField(term509, term509.getClass(), "empno", term510);
        setField(term509, term509.getClass(), "ename", "RkybSrpybU");
        setField(term509, term509.getClass(), "mgr", term524);
        term526 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.dto.ManagerDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term526;
        callMethod(klass, "setEmpno", argTypes, term509, args);
    }

};


