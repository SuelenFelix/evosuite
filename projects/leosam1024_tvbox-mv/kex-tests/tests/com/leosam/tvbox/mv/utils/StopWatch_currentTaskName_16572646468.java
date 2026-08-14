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
import java.util.ArrayList;
import java.lang.Object;

public class StopWatch_currentTaskName_16572646468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519;

    public StopWatch_currentTaskName_16572646468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term523 = new ArrayList();
        term519 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term540 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term519, term519.getClass(), "id", "");
        setBooleanField(term519, term519.getClass(), "keepTaskList", true);
        setField(term519, term519.getClass(), "taskList", term523);
        setLongField(term519, term519.getClass(), "startTimeNanos", -4365849114644724155L);
        setField(term519, term519.getClass(), "currentTaskName", "pCTimMblYc");
        setField(term540, term540.getClass(), "taskName", "hNxWaHcfhY");
        setLongField(term540, term540.getClass(), "timeNanos", 2486810210675247493L);
        setField(term519, term519.getClass(), "lastTaskInfo", term540);
        setIntField(term519, term519.getClass(), "taskCount", -1955890973);
        setLongField(term519, term519.getClass(), "totalTimeNanos", 7009926388951271268L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "currentTaskName", argTypes, term519, args);
    }

};


