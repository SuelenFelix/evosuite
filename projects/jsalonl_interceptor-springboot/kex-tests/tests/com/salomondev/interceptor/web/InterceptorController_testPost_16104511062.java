package com.salomondev.interceptor.web;

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
import static com.salomondev.interceptor.web.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class InterceptorController_testPost_16104511062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term3;

    public InterceptorController_testPost_16104511062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("com.salomondev.interceptor.web.InterceptorController"));
        Long term4 = new Long(2442117782898005296L);
        Long term30 = new Long(6375119433582206027L);
        term3 = newInstance(Class.forName("com.salomondev.interceptor.dto.QueryInDto"));
        setField(term3, term3.getClass(), "id", term4);
        setField(term3, term3.getClass(), "name", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "lastName", "sjlJAEtRrb");
        setField(term3, term3.getClass(), "documentNumber", term30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.web.InterceptorController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.salomondev.interceptor.dto.QueryInDto");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "testPost", argTypes, term2, args);
    }

};


