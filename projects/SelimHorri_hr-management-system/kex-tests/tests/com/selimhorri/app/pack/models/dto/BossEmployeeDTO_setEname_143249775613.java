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

public class BossEmployeeDTO_setEname_143249775613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424;

    public BossEmployeeDTO_setEname_143249775613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424 = newInstance(Class.forName("com.selimhorri.app.pack.models.dto.BossEmployeeDTO"));
        setField(term424, term424.getClass(), "ename", null);
        setField(term424, term424.getClass(), "job", null);
        setField(term424, term424.getClass(), "sal", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.dto.BossEmployeeDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEname", argTypes, term424, args);
    }

};


