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

public class InterceptorController_testPatch_16445139724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102;
     Object term103;

    public InterceptorController_testPatch_16445139724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102 = newInstance(Class.forName("com.salomondev.interceptor.web.InterceptorController"));
        Long term104 = new Long(5270370404989704783L);
        Long term130 = new Long(7411271909051562686L);
        term103 = newInstance(Class.forName("com.salomondev.interceptor.dto.QueryInDto"));
        setField(term103, term103.getClass(), "id", term104);
        setField(term103, term103.getClass(), "name", "jJCZpVmanW");
        setField(term103, term103.getClass(), "lastName", "EGtDIRbSSb");
        setField(term103, term103.getClass(), "documentNumber", term130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.web.InterceptorController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.salomondev.interceptor.dto.QueryInDto");
        Object[] args = new Object[1];
        args[0] = term103;
        callMethod(klass, "testPatch", argTypes, term102, args);
    }

};


