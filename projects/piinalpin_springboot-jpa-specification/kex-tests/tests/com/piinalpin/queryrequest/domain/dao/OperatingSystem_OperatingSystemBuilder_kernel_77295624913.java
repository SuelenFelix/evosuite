package com.piinalpin.queryrequest.domain.dao;

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
import static com.piinalpin.queryrequest.domain.dao.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OperatingSystem_OperatingSystemBuilder_kernel_77295624913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732;

    public OperatingSystem_OperatingSystemBuilder_kernel_77295624913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder"));
        setField(term732, term732.getClass(), "id", null);
        setField(term732, term732.getClass(), "name", null);
        setField(term732, term732.getClass(), "version", null);
        setField(term732, term732.getClass(), "kernel", null);
        setField(term732, term732.getClass(), "releaseDate", null);
        setField(term732, term732.getClass(), "usages", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "kernel", argTypes, term732, args);
    }

};


