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

public class StopWatch_isRunning_11802616517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462;

    public StopWatch_isRunning_11802616517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term466 = new ArrayList();
        term462 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch"));
        Object term483 = newInstance(Class.forName("com.leosam.tvbox.mv.utils.StopWatch$TaskInfo"));
        setField(term462, term462.getClass(), "id", "");
        setBooleanField(term462, term462.getClass(), "keepTaskList", true);
        setField(term462, term462.getClass(), "taskList", term466);
        setLongField(term462, term462.getClass(), "startTimeNanos", 8428634514691209827L);
        setField(term462, term462.getClass(), "currentTaskName", "tbcdzjIfER");
        setField(term483, term483.getClass(), "taskName", "HyxfbSQYBe");
        setLongField(term483, term483.getClass(), "timeNanos", -2585684163342970173L);
        setField(term462, term462.getClass(), "lastTaskInfo", term483);
        setIntField(term462, term462.getClass(), "taskCount", -616727354);
        setLongField(term462, term462.getClass(), "totalTimeNanos", 8059786003080744426L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.StopWatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRunning", argTypes, term462, args);
    }

};


