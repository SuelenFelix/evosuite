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

public class OperatingSystem_OperatingSystemBuilder_releaseDate_206785493914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733;

    public OperatingSystem_OperatingSystemBuilder_releaseDate_206785493914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term733 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder"));
        setField(term733, term733.getClass(), "id", null);
        setField(term733, term733.getClass(), "name", null);
        setField(term733, term733.getClass(), "version", null);
        setField(term733, term733.getClass(), "kernel", null);
        setField(term733, term733.getClass(), "releaseDate", null);
        setField(term733, term733.getClass(), "usages", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "releaseDate", argTypes, term733, args);
    }

};


