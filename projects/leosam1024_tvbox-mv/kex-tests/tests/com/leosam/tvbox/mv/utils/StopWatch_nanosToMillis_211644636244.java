package com.leosam.tvbox.mv.utils;

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
import static com.leosam.tvbox.mv.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class StopWatch_nanosToMillis_211644636244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1361;
     Object term1366;

    public StopWatch_nanosToMillis_211644636244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1361 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        setField(term1361, term1361.getClass(), "id", null);
        setBooleanField(term1361, term1361.getClass(), "keepTaskList", false);
        setField(term1361, term1361.getClass(), "taskList", null);
        setLongField(term1361, term1361.getClass(), "startTimeNanos", 0L);
        setField(term1361, term1361.getClass(), "currentTaskName", null);
        setField(term1361, term1361.getClass(), "lastTaskInfo", null);
        setIntField(term1361, term1361.getClass(), "taskCount", 0);
        setLongField(term1361, term1361.getClass(), "totalTimeNanos", 0L);
        term1366 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1366;
        callMethod(klass, "nanosToMillis", argTypes, term1361, args);
    }

};


