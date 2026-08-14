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

public class StopWatch_start_592400215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;

    public StopWatch_start_592400215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term330 = new ArrayList();
        term326 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term347 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term326, term326.getClass(), "id", "");
        setBooleanField(term326, term326.getClass(), "keepTaskList", true);
        setField(term326, term326.getClass(), "taskList", term330);
        setLongField(term326, term326.getClass(), "startTimeNanos", -5476826692763582090L);
        setField(term326, term326.getClass(), "currentTaskName", "MxlszYVzRf");
        setField(term347, term347.getClass(), "taskName", "LQFpaHEwXR");
        setLongField(term347, term347.getClass(), "timeNanos", -872011222785455006L);
        setField(term326, term326.getClass(), "lastTaskInfo", term347);
        setIntField(term326, term326.getClass(), "taskCount", 391863371);
        setLongField(term326, term326.getClass(), "totalTimeNanos", -316468845751588286L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        callMethod(klass, "start", argTypes, term326, args);
    }

};


