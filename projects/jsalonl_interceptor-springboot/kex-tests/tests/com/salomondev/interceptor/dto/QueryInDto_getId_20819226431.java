package com.salomondev.interceptor.dto;

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
import static com.salomondev.interceptor.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class QueryInDto_getId_20819226431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;

    public QueryInDto_getId_20819226431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term139 = new Long(2442117782898005296L);
        Long term165 = new Long(6375119433582206027L);
        term138 = newInstance(Class.forName("com.salomondev.interceptor.dto.QueryInDto"));
        setField(term138, term138.getClass(), "id", term139);
        setField(term138, term138.getClass(), "name", "SzjVpOQTyS");
        setField(term138, term138.getClass(), "lastName", "MjGYSRKTNF");
        setField(term138, term138.getClass(), "documentNumber", term165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.dto.QueryInDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term138, args);
    }

};


