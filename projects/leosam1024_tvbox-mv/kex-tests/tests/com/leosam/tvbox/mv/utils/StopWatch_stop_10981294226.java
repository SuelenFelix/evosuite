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

public class StopWatch_stop_10981294226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405;

    public StopWatch_stop_10981294226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term409 = new ArrayList();
        term405 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term426 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term405, term405.getClass(), "id", "");
        setBooleanField(term405, term405.getClass(), "keepTaskList", true);
        setField(term405, term405.getClass(), "taskList", term409);
        setLongField(term405, term405.getClass(), "startTimeNanos", 5127676408959197577L);
        setField(term405, term405.getClass(), "currentTaskName", "aJlieCFVtF");
        setField(term426, term426.getClass(), "taskName", "ZiaGIbnzTs");
        setLongField(term426, term426.getClass(), "timeNanos", -6573104506744284592L);
        setField(term405, term405.getClass(), "lastTaskInfo", term426);
        setIntField(term405, term405.getClass(), "taskCount", -1922583790);
        setLongField(term405, term405.getClass(), "totalTimeNanos", -4920224193275732920L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "stop", argTypes, term405, args);
    }

};


