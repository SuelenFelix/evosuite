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

public class StopWatch_getTotalTimeSeconds_124509652515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term918;

    public StopWatch_getTotalTimeSeconds_124509652515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term922 = new ArrayList();
        term918 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term939 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term918, term918.getClass(), "id", "");
        setBooleanField(term918, term918.getClass(), "keepTaskList", true);
        setField(term918, term918.getClass(), "taskList", term922);
        setLongField(term918, term918.getClass(), "startTimeNanos", 4784595517102746672L);
        setField(term918, term918.getClass(), "currentTaskName", "SbAoxhfrkn");
        setField(term939, term939.getClass(), "taskName", "kuTXqwMtDB");
        setLongField(term939, term939.getClass(), "timeNanos", -7612550318181586304L);
        setField(term918, term918.getClass(), "lastTaskInfo", term939);
        setIntField(term918, term918.getClass(), "taskCount", -883034806);
        setLongField(term918, term918.getClass(), "totalTimeNanos", -2170847986967241072L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalTimeSeconds", argTypes, term918, args);
    }

};


