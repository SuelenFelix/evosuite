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

public class StopWatch_prettyPrint_92130916442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1351;

    public StopWatch_prettyPrint_92130916442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1351 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        setField(term1351, term1351.getClass(), "id", null);
        setBooleanField(term1351, term1351.getClass(), "keepTaskList", false);
        setField(term1351, term1351.getClass(), "taskList", null);
        setLongField(term1351, term1351.getClass(), "startTimeNanos", 0L);
        setField(term1351, term1351.getClass(), "currentTaskName", null);
        setField(term1351, term1351.getClass(), "lastTaskInfo", null);
        setIntField(term1351, term1351.getClass(), "taskCount", 0);
        setLongField(term1351, term1351.getClass(), "totalTimeNanos", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prettyPrint", argTypes, term1351, args);
    }

};


