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
import java.lang.Double;

public class BossEmployeeDTO_getEname_10088293403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94;

    public BossEmployeeDTO_getEname_10088293403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term119 = new Double(0.5523635872663106);
        term94 = newInstance(Class.forName("com.selimhorri.app.pack.models.dto.BossEmployeeDTO"));
        setField(term94, term94.getClass(), "ename", "jJCZpVmanW");
        setField(term94, term94.getClass(), "job", "EGtDIRbSSb");
        setField(term94, term94.getClass(), "sal", term119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.dto.BossEmployeeDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEname", argTypes, term94, args);
    }

};


