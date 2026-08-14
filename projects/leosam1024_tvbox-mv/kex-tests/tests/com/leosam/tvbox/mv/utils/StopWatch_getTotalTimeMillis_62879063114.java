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

public class StopWatch_getTotalTimeMillis_62879063114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term861;

    public StopWatch_getTotalTimeMillis_62879063114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term865 = new ArrayList();
        term861 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term882 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term861, term861.getClass(), "id", "");
        setBooleanField(term861, term861.getClass(), "keepTaskList", true);
        setField(term861, term861.getClass(), "taskList", term865);
        setLongField(term861, term861.getClass(), "startTimeNanos", -2068172595987555756L);
        setField(term861, term861.getClass(), "currentTaskName", "dWRymuLBtr");
        setField(term882, term882.getClass(), "taskName", "AijpHYOFuy");
        setLongField(term882, term882.getClass(), "timeNanos", -6292278961887936280L);
        setField(term861, term861.getClass(), "lastTaskInfo", term882);
        setIntField(term861, term861.getClass(), "taskCount", 1134449235);
        setLongField(term861, term861.getClass(), "totalTimeNanos", -6645965768855543712L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalTimeMillis", argTypes, term861, args);
    }

};


