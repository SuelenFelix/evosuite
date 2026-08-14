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

public class StopWatch_isRunning_118026165130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1291;

    public StopWatch_isRunning_118026165130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1291 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        setField(term1291, term1291.getClass(), "id", null);
        setBooleanField(term1291, term1291.getClass(), "keepTaskList", false);
        setField(term1291, term1291.getClass(), "taskList", null);
        setLongField(term1291, term1291.getClass(), "startTimeNanos", 0L);
        setField(term1291, term1291.getClass(), "currentTaskName", null);
        setField(term1291, term1291.getClass(), "lastTaskInfo", null);
        setIntField(term1291, term1291.getClass(), "taskCount", 0);
        setLongField(term1291, term1291.getClass(), "totalTimeNanos", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRunning", argTypes, term1291, args);
    }

};


