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

public class StopWatch_prettyPrint_92130916419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1146;

    public StopWatch_prettyPrint_92130916419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1150 = new ArrayList();
        term1146 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term1167 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term1146, term1146.getClass(), "id", "");
        setBooleanField(term1146, term1146.getClass(), "keepTaskList", true);
        setField(term1146, term1146.getClass(), "taskList", term1150);
        setLongField(term1146, term1146.getClass(), "startTimeNanos", -7738503207562305297L);
        setField(term1146, term1146.getClass(), "currentTaskName", "UlajhuVLaP");
        setField(term1167, term1167.getClass(), "taskName", "gGSMzuGICf");
        setLongField(term1167, term1167.getClass(), "timeNanos", 3825396310311739952L);
        setField(term1146, term1146.getClass(), "lastTaskInfo", term1167);
        setIntField(term1146, term1146.getClass(), "taskCount", -1456670397);
        setLongField(term1146, term1146.getClass(), "totalTimeNanos", -3838084482494604218L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prettyPrint", argTypes, term1146, args);
    }

};


