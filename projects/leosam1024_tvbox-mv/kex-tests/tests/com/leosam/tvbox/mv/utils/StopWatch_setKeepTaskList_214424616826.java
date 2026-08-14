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
import java.lang.Boolean;

public class StopWatch_setKeepTaskList_214424616826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1269;
     Object term1274;

    public StopWatch_setKeepTaskList_214424616826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1269 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        setField(term1269, term1269.getClass(), "id", null);
        setBooleanField(term1269, term1269.getClass(), "keepTaskList", false);
        setField(term1269, term1269.getClass(), "taskList", null);
        setLongField(term1269, term1269.getClass(), "startTimeNanos", 0L);
        setField(term1269, term1269.getClass(), "currentTaskName", null);
        setField(term1269, term1269.getClass(), "lastTaskInfo", null);
        setIntField(term1269, term1269.getClass(), "taskCount", 0);
        setLongField(term1269, term1269.getClass(), "totalTimeNanos", 0L);
        term1274 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1274;
        callMethod(klass, "setKeepTaskList", argTypes, term1269, args);
    }

};


