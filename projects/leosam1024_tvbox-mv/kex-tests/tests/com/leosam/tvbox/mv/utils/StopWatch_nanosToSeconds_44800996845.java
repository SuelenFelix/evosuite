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

public class StopWatch_nanosToSeconds_44800996845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1368;
     Object term1373;

    public StopWatch_nanosToSeconds_44800996845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1368 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        setField(term1368, term1368.getClass(), "id", null);
        setBooleanField(term1368, term1368.getClass(), "keepTaskList", false);
        setField(term1368, term1368.getClass(), "taskList", null);
        setLongField(term1368, term1368.getClass(), "startTimeNanos", 0L);
        setField(term1368, term1368.getClass(), "currentTaskName", null);
        setField(term1368, term1368.getClass(), "lastTaskInfo", null);
        setIntField(term1368, term1368.getClass(), "taskCount", 0);
        setLongField(term1368, term1368.getClass(), "totalTimeNanos", 0L);
        term1373 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1373;
        callMethod(klass, "nanosToSeconds", argTypes, term1368, args);
    }

};


