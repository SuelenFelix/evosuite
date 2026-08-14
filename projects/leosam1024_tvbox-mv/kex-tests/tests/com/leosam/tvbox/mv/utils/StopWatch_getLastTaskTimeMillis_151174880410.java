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

public class StopWatch_getLastTaskTimeMillis_151174880410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633;

    public StopWatch_getLastTaskTimeMillis_151174880410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term637 = new ArrayList();
        term633 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term654 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term633, term633.getClass(), "id", "");
        setBooleanField(term633, term633.getClass(), "keepTaskList", true);
        setField(term633, term633.getClass(), "taskList", term637);
        setLongField(term633, term633.getClass(), "startTimeNanos", 2120084523938730454L);
        setField(term633, term633.getClass(), "currentTaskName", "eZFUvlxvGV");
        setField(term654, term654.getClass(), "taskName", "BYqFIqCKAV");
        setLongField(term654, term654.getClass(), "timeNanos", 6855071767938501807L);
        setField(term633, term633.getClass(), "lastTaskInfo", term654);
        setIntField(term633, term633.getClass(), "taskCount", 1227103734);
        setLongField(term633, term633.getClass(), "totalTimeNanos", -5892135042702373494L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastTaskTimeMillis", argTypes, term633, args);
    }

};


