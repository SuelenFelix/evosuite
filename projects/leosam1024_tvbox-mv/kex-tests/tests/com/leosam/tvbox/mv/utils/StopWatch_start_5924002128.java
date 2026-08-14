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

public class StopWatch_start_5924002128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1281;

    public StopWatch_start_5924002128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1281 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        setField(term1281, term1281.getClass(), "id", null);
        setBooleanField(term1281, term1281.getClass(), "keepTaskList", false);
        setField(term1281, term1281.getClass(), "taskList", null);
        setLongField(term1281, term1281.getClass(), "startTimeNanos", 0L);
        setField(term1281, term1281.getClass(), "currentTaskName", null);
        setField(term1281, term1281.getClass(), "lastTaskInfo", null);
        setIntField(term1281, term1281.getClass(), "taskCount", 0);
        setLongField(term1281, term1281.getClass(), "totalTimeNanos", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "start", argTypes, term1281, args);
    }

};


